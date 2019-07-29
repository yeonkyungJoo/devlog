1. 목적
- nodejs에서 데이터베이스 access 및 쿼리 수행 모듈 생성

2. 제품
- mysql 계열 사용 : sql 모두 동일
- mysql(오라클), mariadb(free), AuroraDB(aws)
- 가장 경량의 mariadb 사용

3. 모듈
- 해당 모듈 설치는 프로젝트 내부에서 수행
- npm install --save mysql

4. 세팅
- 프로젝트 폴더 이동
- 세팅
$ npm init
 -> node 프로젝트 생성 명령
 -> Q/A 진행 => package.json 생성
 -> 계속 enter 치고 y or yes로 종료
 -> 필요한 모듈을 정리해서 package.json에 반영(수정)
- 설치
$ npm install
- 한번에 써드 파트 모듈을 package.json에 기술하고 설치까지 수행
 => --save 옵션(중요)
$ npm install --save mysql
 => 현 프로젝트 내에서 모든 노드 모듈은 mysql 모듈을 사용할 수 있게 되었다

 
