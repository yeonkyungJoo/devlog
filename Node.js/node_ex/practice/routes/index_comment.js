// 같은 모듈을 여러 곳에서 require()해도 캐싱처리가 되어 메모리를 사용하지 않는다
// -> 성능에 무관
var express = require('express');
// 라우터 생성
var router = express.Router();

// req : 요청, res : 응답 객체(꾸미면 html 클라이언트한테 도착), next
// method는 클라이언트가 서버로 데이터를 전송하는 방식 / get, post, put 등
// - get : 보안에 취약, 데이터 크기 작다, http 헤더를 통해 전송, url 뒤에 붙어서 간다
//         url?키=값&키=값
//         ex) https://news.naver.com/main/main.nhn?mode=LSD&mid=shm&sid1=100
// - post : 보안에 우수, 대량 전송 OK, http 바디를 통해 전송

// router.메소드(url, 콜백함수(응답 담당))
// Q. http://localhost:3000/hello 페이지를 구성하시오
// ~/hello
router.get('/hello', (req, res, next)=>{
  res.send('')
})

// Q. ~/login, get방식, 텍스트 'login page'로 응답
router.get('/login', (req, res, next)=> {
  res.end('login page')
})

router.get('/', function(req, res, next) {
  // views 밑에 있는 index.ejs를 읽어서
  // 2번째 파라미터로 전송한 데이터를 활용하여 렌더링 후 응답 (html을 전송)
  res.render('index', { title: 'Express' });
});

// 대표 모듈
module.exports = router;
