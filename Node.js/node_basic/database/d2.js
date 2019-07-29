const mysql = require('mysql')

var connection = mysql.createConnection({
    host : 'localhost',
    user : 'root',
    password : '12341234',
    database : 'nodedb'
})

// 비동기 : 노드는 콜백으로 (이어서) 받아야 한다 (return X)
// 콜백함수를 등록하여 해당 시그널을 받는다
connection.connect((err)=>{
    if(err) {
        console.log('접속 오류', err)
    } else {
        // 실제 DB와 연결
        console.log('접속 성공')
        
        // 연결 종료
        connection.end((err)=>{
            console.log('접속 종료', err) // (에러가 없으므로) 접속 종료 undefined
        })

    }
})

