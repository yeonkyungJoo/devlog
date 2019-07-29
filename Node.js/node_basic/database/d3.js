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
        console.log('접속 성공')
        // 쿼리 수행
        let sql =  `select * from tbl_users
                            where uid = 'guest' and upw = '1';`
        connection.query(sql, (err, rows)=> {
            // 쿼리 수행 완료
            // 쿼리의 콜백이 호출되면 쿼리가 끝났다는 것이다
            console.log(err)
            console.log(rows)
            console.log(rows[0].name)
            
            connection.end((err)=>{
                console.log('접속 종료', err)
            })
        })                    
    }
})