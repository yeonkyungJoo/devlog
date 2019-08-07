var express = require('express');
var router = express.Router();
const db = require('./db')

// http://localhost:3000?no=1&amt=10
// no : 페이지 번호
// amt : 한 페이지에서 보이는 양
router.get('/', (req, res, next)=>{
  
  // 1. get방식 전달 데이터 획득 : query
  /*
    let no = req.query.no
    let amt = req.query.amt
    
    console.log(no, typeof(no), amt, typeof(amt))
    // http://localhost:3000 입력 시
    // -> undefined 'undefined' undefined 'undefined'
    // http://localhost:3000?no=1&amt=10 입력 시
    // -> 1 string 10 string
    
    // 데이터가 없을 경우 대비 
    // no, amt 중 하나라도 undefined라면 기본값을 1, 10으로 세팅
    // 아니면 전달된 값을 수치형으로 받아준다
    if(typeof(no) == 'undefined' || typeof(amt) == 'undefined') {
      no = 1
      amt = 10
    } else {
      no = parseInt(no)
      amt = parseInt(amt)
    }
  */

  // 위의 내용을 삼항연산자로 처리
  let no = typeof(req.query.no) == 'undefined' ? 1 : parseInt(req.query.no)
  let amt = typeof(req.query.amt) == 'undefined' ? 10 : parseInt(req.query.amt)
  console.log(no, typeof(no), amt, typeof(amt))

  // 2. 수치형으로 변환한 데이터를 sql로 전달
  // 3. sql에서 쿼리에 수치를 반영
  // 4. tbl_trade 테이블에서 데이터를 획득하여 렌더링
  db.selectStocks( {no:no, amt:amt}, (err, rows)=>{
    if(err) {

    } else {
      console.log(rows)
      /*
      http://localhost:3000/ 입력 시
      [ RowDataPacket { code: '060310', name: '3S', cur: '1,955', rate: '40' },
        RowDataPacket { code: '095570', name: 'AJ네트웍스', cur: '7,4200', rate: '91' },
        RowDataPacket { code: '068400', name: 'AJ렌터카', cur: '14,6501', rate: '1,7001' },
        RowDataPacket { code: '006840', name: 'AK홀딩스', cur: '66,000', rate: '-1,300' },
        RowDataPacket { code: '054620', name: 'APS홀딩스', cur: '9,970', rate: '0' },
        RowDataPacket { code: '265520', name: 'AP시스템', cur: '38,000', rate: '-400' },
        RowDataPacket { code: '211270', name: 'AP위성', cur: '8,000', rate: '-30' },
        RowDataPacket { code: '027410', name: 'BGF리테일', cur: '79,100', rate: '0' },
        RowDataPacket { code: '138930', name: 'BNK금융지주', cur: '9,900', rate: '-40' },
        RowDataPacket { code: '001460', name: 'BYC', cur: '320,000', rate: '0' } ]
      */
      res.render('index', {title : '주식 조회 결과', rows : rows})
    }
  })
})


router.get('/search', (req, res, next)=>{
  
  // 1. 검색어 획득
  let keyword = req.query.keyword
  console.log(keyword)
  
  // 2. 해당 검색어가 포함된 주식 데이터 획득 -> 쿼리
  db.selectStocksByKeyword( {keyword : keyword}, (err, rows)=>{
    // 3. 응답
    // js의 객체를 res.json()에 넣으면 json이 된다
    res.json(rows)
  })
})


// 데이터를 주소에 붙여서 보낼 때 사용 : 동적파라미터 -> params
// 특정 코드에 해당되는 주식 정보 상세 보기
router.get('/info/:code', (req, res, next)=>{
  db.selectStockByCode( { code : req.params.code }, (err, rows)=>{
    // JSON.stringify() : 자바스크립트 객체를 JSON 문자열로 변환하는 함수
    // res.end(JSON.stringify(rows))

    // views/info.ejs를 생성, stock 데이터를 표 형식으로 렌더링
    res.render('info', {stock : rows[0], update : req.query.update})
  })
})

// post 방식으로 전송된 데이터(cur, rate) & 동적파라미터 방식으로 전송된 데이터(code) 획득
// 주식 정보 수정(update) 처리
router.post('/info/:code', (req, res, next)=>{
  let {cur, rate} = req.body  // post 방식
  let {code} = req.params     // 동적파라미터 방식
                              // code는 DB에서 데이터 업데이트 시 대상을 찾는 조건값(고유값)
  db.updateStockByCode( {cur:cur, rate:rate, code:code}, (err, rows)=>{
    if(rows.changedRows == 0 || err) {
      res.render('alert', {msg : '수정 실패', url : '-1'})
    } else {
      res.render('alert', {msg : '수정 성공', url:`/info/${code}`})
    }
  })
})

module.exports = router;
