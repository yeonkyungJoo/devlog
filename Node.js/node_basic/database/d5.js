// d4.js의 코드를
// 누구나 불러서 사용할 수 있게 함수 모듈화 : selectLogin 함수
// 해당 함수는 비동기 함수 -> return X, 함수 인자에 콜백함수

const mysql = require('mysql')

let selectLogin = (uid, upw, cb) => {
    var connection = mysql.createConnection({
        host : 'localhost',
        user : 'root',
        password : '12341234',
        database : 'nodedb'
    })

    connection.connect((err)=>{
        if(err) {
            // 접속 오류가 발생하면 콜백을 호출하여 해당 상황을 전달
            cb(err) // 콜백함수 1번 인자는 error
        } else {
            let sql = `select * from tbl_users 
                where uid = ? and upw = ?;`

            connection.query(sql, [uid, upw], (err, rows)=>{
                connection.end((err)=>{
                    cb(err, rows)
                })
            })
        }
    });
}

// DB는 쿼리를 던져주는 역할, 판단은 여기서
selectLogin('guest', '1', (err, rows)=>{
    if(err) {
        // 접속 오류 or 쿼리 오류 등의 오류가 발생한 경우
        console.log('오류 발생')
    } else {
        // 쿼리 성공 후 결과를 정상적으로 받은 상황
        if(rows.length==0) {
            // 회원 X
            console.log('회원이 아닙니다.')
        } else {
            // 배열의 길이가 0보다 크면 회원이다
            console.log(`회원입니다. ${rows[0].name}님 반갑습니다.`)
        }
    }
})