const mysql = require('mysql')

var connection = mysql.createConnection({
    host : 'localhost',
    user : 'root',
    password : '12341234',
    database : 'nodedb'
})

connection.connect((err)=>{
    if(err) {
        console.log('접속 오류', err)
    } else {
        // 아이디와 비번을 외부에서 세팅되게 수정 -> 일반화(누구나 사용 가능)
        let sql = `select * from tbl_users 
                        where uid = ? and upw = ?;`
        // query()의 2번 인자가 sql 문자열에 동적으로 데이터를 세팅하는 위치
        // 2번 인자는 생략 가능
        connection.query(sql, ['guest', '1'], (err, rows)=>{
            console.log(err, rows)
            connection.end((err)=>{
                console.log('접속 종료', err)
            })
        })                
    }
})