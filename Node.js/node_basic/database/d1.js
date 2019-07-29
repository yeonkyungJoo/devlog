// mysql 모듈을 이용하여 노드에서 mysql 엑세스, 쿼리 수행
// 1. 모듈 가져오기 (가져오는 것은 require 함수, exports는 모듈화)
const mysql = require('mysql')

// 2. 연결 객체 생성
var connection = mysql.createConnection({
    host : 'localhost',
    user : 'root',
    password : '12341234',
    database : 'nodedb'
})

// 3. 연결
connection.connect()
console.log('연결 완료')

// 4. 해제
connection.end()
console.log('연결 종료')

// 위 코드는 동기식 코드이다
// 비번을 틀리게 설정하고 진행해보면 코드는 쭉 진행되는데
// 나중에 문제가 발생된 게 등장한다 -> 즉, 타이밍이 맞지 않는다
// 이런 스타일은 node 기반으로 구성 X