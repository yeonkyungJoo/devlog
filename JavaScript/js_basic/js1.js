// 1. 주석

// 한 줄 주석

/*
  여러 줄 주석
*/

// 2. 변수, 타입

/* 
자바 :
> 타입 변수명;

javascript :
> 키워드 변수명; 
(;(세미콜론)은 생략, 현재는 혼용
기준은 여러 줄 표현을 한 줄에 할 때)
> 키워드 => 타입을 특정하지 않는다
        => 값이 들어올 때(세팅될 때) 결정 : 값이 들어오기 전까지는 모른다
        => 타입 추론
> 키워드 종류 : var, 
                추가됨(모던) : const(상수), let(변수 범위에 대한 조정 : 코드블럭 기준)
                => 현재까지 자바스크립트 키워드는 총 3개
*/

/*
$는 프롬프트를 표현한 것

- 현재 디렉토리 목록 확인
$ ls
$ dir

- 디렉토리 이동
$ cd js_basic

- node 실행
$ node js1.js

*/

// 변수 ani 선언, 문자열 cat 세팅
// 변수는 문자열 타입이 되었다
var ani = "cat"
console.log(ani)

// 새로운 값 대입
ani = "dog"
console.log(ani)

// 다른 타입 대입도 가능
ani = 1
console.log(ani)

// 상수 : 변하지 않는다 -> readonly
// 상수의 변수명은 가급적 대문자로 기술한다
const NAME = "컴퓨터"
console.log(NAME)

// 오류가 발생하면 그 밑으로는 코드 진행 불가
// TypeError: Assignment to constant variable.
// NAME = "품질2"
// console.log(NAME)

// var vs let
// 1) var
var a = "자바스크립트"
console.log(a) // 자바스크립트
if(a) {
    var a = "컴퓨터"
    console.log(a) // 컴퓨터
}
console.log(a) // 컴퓨터
// => 조건문 안의 a 변수가 조건문 밖에 있는 a 변수에 영향을 미친다. 즉, 같은 변수다

// 2) let : block scope, 블록 범위
var b = "자바스크립트"
console.log(b) // 자바스크립트
if(b) {
    let b = "컴퓨터"
    console.log(b) // 컴퓨터
}
console.log(b) // 자바스크립트
// => 조건문 안의 b 변수가 조건문 밖의 b 변수에 영향을 미치지 않는다.
// let은 가장 가까이서 감싸고 있는 {} : 코드블럭에만 영향을 미친다.



