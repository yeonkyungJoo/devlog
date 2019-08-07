var express = require('express');
var router = express.Router();
const db = require('./db')

// ~/users
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});

// ~/users/login, get
router.get('/login', (req, res, next)=> {
  //res.end('login page')
  res.render('login')
})


// 로그인 처리 과정
router.post('/login_practice', (req, res, next)=>{
  // 클라이언트가 보내는 모든 데이터는 req를 타고 들어온다
  // post 방식으로 데이터를 보내면 -> 'req.body.키' 형식으로 획득
  
  // 로그인 처리 과정
  // 1. 데이터 획득
  let uid = req.body.uid
  let upw = req.body.upw

  // 2. 쿼리 수행
  // 3. 판단 : Controller (웹 M(routes)V(views)C(routes))

  // Q. 'uid가 busan, upw가 1234면 회원이다' 구현
  if (uid === 'busan' && upw === '1234') {
    // 4. 판단 결과에 따른 화면 처리
    res.end('login success')
  } else {
    let resText = `<script>
    alert('login fail');
    history.back();
    </script>`
    res.end(resText)
  }
})


// ~/users/login, post
router.post('/login', (req, res, next)=>{
  let uid = req.body.uid
  let upw = req.body.upw

  // 판단은 DB쿼리
  db.selectLogin( uid, upw, (err, rows)=>{
    if(err) {
      res.render('alert', { msg : '관리자에게 문의하세요.', url : '-1'})
    } else {
      if(rows.length == 0) {
        res.render('alert', { msg : '아이디나 비밀번호를 확인하세요.', url : '-1'})
      } else {
        // 배열의 길이가 0보다 크면 회원이다
        // 로그인 성공 -> 메인서비스 화면으로 자동 이동
        res.render('alert', { msg : `로그인 성공, ${rows[0].name}님 반갑습니다.`})
      }
    }
  } )
})

// 클라이언트가 서버로 데이터를 보내는 방식 중 동적파라미터 방식
// - 모든 메소드 방식과 같이 사용 가능
// - url을 타고 데이터가 전송
// ex) ~/users/id/guest, ~/users/id/guest2, ~/users/id/busan
// ex) http://localhost:3000/users/id/guest?name=busan
router.get('/id/:uid', (req, res, next)=>{
  // 동적파라미터 : req.params.키
  // get : req.query.키
  res.end(`paramater ${req.params.uid} : ${req.query.name}`)
})


module.exports = router;
