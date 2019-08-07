const mysql = require('mysql')

// 해당 코드를 누구나 불러서 사용할 수 있게 함수의 모듈화를 구성
// 일반 모듈화(개별 모듈화)
// 로그인 : 회원 조회
exports.selectLogin = (uid, upw, cb) => {
    var connection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : '12341234',
        database : 'nodedb'
    });
    connection.connect((err)=>{
        if(err) {
            // 접속 오류가 발생하면 콜백을 호출하여 해당 상황을 전달
            cb(err)
        } else {
            let sql = `select * from tbl_users where uid = ? and upw = ?;`
            connection.query(sql, [uid, upw], (err, rows) => {
                connection.end();
                cb(err, rows)
            })
        }
    })
}

// 앞으로 DB쪽 함수는 
// 인자를 ( 전달데이터덩어리(객체), 콜백함수 )
// 이렇게 2개로만 세팅한다

// 주식 조회
// select code, name, cur, rate from tbl_trade 
// order by name asc 
// limit (no-1)*amt, amt; 
// 페이지, 개수
exports.selectStocks = ( {no, amt}, cb ) => {
    var connection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : '12341234',
        database : 'nodedb'
    });
    connection.connect ((err)=>{
        if(err) {
            cb(err)
        } else {
            let sql = `select code, name, cur, rate from tbl_trade
            order by name asc
            limit ?, ?;`
            connection.query(sql, [(no-1)*amt, amt], (err, rows)=>{
                connection.end()
                cb(err, rows)
            })
        }
    })
}

// 검색어가 포함된 주식 목록 정보를 조회하는 함수
exports.selectStocksByKeyword = ( {keyword}, cb )=> {
    var connection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : '12341234',
        database : 'nodedb'
    })
    connection.connect((err)=>{
        if(err) {
            // rows 항목에 '결과가 없다'는 의미의 빈 배열 []을 넣어서
            // 혹시라도 이 함수를 사용하는 개발자가
            // 의도하지 않게 결과를 사용할 경우
            // 오류가 나는 것을 방지
            cb(err, [])
        } else {
            let sql =  `select name, code from tbl_trade
            where name like '%${keyword}%';`
            connection.query(sql, (err, rows)=>{
                connection.end()
                cb(err, rows)
            })
        }
    })
}

// code를 이용하여 해당하는 주식 정보를 모두 가져오는 함수
exports.selectStockByCode = ( {code}, cb ) => {
    var connection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : '12341234',
        database : 'nodedb'
    })
    connection.connect( (err)=>{
        if(err) {
            cb(err)
        } else {
            let sql = `select * from tbl_trade
            where code = ?;`
            connection.query( sql, [code], (err, rows)=>{
                connection.end()
                cb(err, rows)
            })
        }
    })
}

// code를 이용하여 특정 주식 정보를 수정하고 결과를 돌려주는 함수
exports.updateStockByCode = ( {code, cur, rate}, cb ) =>{
    var connection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : '12341234',
        database : 'nodedb'
    })
    connection.connect((err)=>{
        if(err) {
            cb(err)
        } else {
            let sql = `update tbl_trade 
            set cur = ?, rate = ?
            where code = ?;`
            connection.query(sql, [cur, rate, code], (err, rows) => {
                connection.end()
                cb(err, rows)
            })
        }
    })
}