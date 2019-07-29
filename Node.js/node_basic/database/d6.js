// 해당 코드를 누구나 불러서 사용할 수 있게 함수의 모듈화를 구성
const mysql = require('mysql')

// 일반 모듈화(개별 모듈화) -> exports.
exports.selectLogin = (uid, upw, cb) => {
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