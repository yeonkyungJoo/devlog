1. 개념
- Nodejs는 Chrome V8 JavaScript runtime engine이 빌트온된 서버사이드 플랫폼
- 비동기, 이벤트 기반으로 어플리케이션을 제작할 수 있게 설계되었다
- 영향을 받은 언어/플랫폼 : Ruby Event Machine, Python의 Twisted 시스템과 설계상 유사
-> 노드를 배운 후 파이썬 웹을 하면 쉽게 할 수 있다

2. 개발환경 구축
- nodejs.org 다운로드 후 설치

3. 패키지 제공
- node에서 사용되는 수많은 패키지들을 검색, 제공하는 사이트
- npmjs.com(가입) : 배포
- github.com(가입) : 배포, 공정관리
- aws(가입) : 리눅스상에 실제 서비스

4. 기본 웹 서비스 구축
- 노드 자체로도 웹 서비스를 구성할 수 있다 -> 번잡하다
- 써드 파트 패키지로 웹을 빠르고 쉽게, 파워풀하게 구성할 수 있는 제품이 등장
- expressjs 대표 패키지
- npm이 패키지를 설치하는 명령어이다. (<-> pip, conda (파이썬, 아나콘다))
$ npm install -g express
$ npm install -g express-generator

- 프로젝트 생성 : ejs 엔진으로 html을 렌더링하는 템플릿 엔진을 기본으로 사용한다
$ express -e (프로젝트명)

- 프로젝트 폴더로 이동
$ cd (프로젝트명)

- 이 프로젝트에 필요한 패키지를 다운받아라 -> node_modules가 생성
-> 무슨 근거로, 어떤 패키지를 다운받는가? package.json
$ npm install

- 서버 가동
$ node ./bin/www  or  $ npm start

- 브라우저 가동
http://localhost:3000 접속

5. 프로젝트 구조 이해
- 엔트리 포인트(진입로, 시작점) 분석
- 각 폴더/파일의 기능 이해
- 구조
    (프로젝트)
        └ bin
            └ www               : 2. 시작점, 엔트리포인트
        └ node_modules          : 현 프로젝트가 구동되기 위해 필요한 패키지가 설치된 곳
            └ *
        └ public                : 정적 데이터가 위치하는 곳, js(클라이언트 기반), css, image
            └ *
        └ routes                : 3. 요청을 받아서 응답을 처리하는 메인 코드, db 엑세스, 렌더링
            └ index.js
            └ users.js
        └ views                 : html이 위치하는 곳(html→ejs로 변경), 렌더링 템플릿 엔진이 참조하는 곳
            └ error.ejs
            └ index.ejs
        └ app.js                : 1. 요청을 정의, 웹 서비스에 필요한 큰 틀의 작업 세팅
        └ package.json

6. 프로젝트 개발 시 필요 모듈 설치
- nodemon
-> 소스를 수정하면 -> 잠시 후 -> 자동 서버 재가동
$ npm install -g nodemon
- 가동(코드 자동 저장은 자제)
$ nodemon ./bin/www

[참고사항]
- txt포맷(*.txt, *.xml, *.json, ...) => 이기종 장비(PC, C/S) 주고받는 형식
-> 데이터를 주고받는 포맷으로 주로 사용, 환경구성용 사용(xml, json)