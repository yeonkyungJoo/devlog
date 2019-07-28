// 에로우 함수, 함수 기본값 주기

// 1. 기본값 주기
// 함수 인자를 채우지 않아도 기본값으로 세팅되는 방식(편의성)

function getPerson(name = '컴퓨터', age = 26) {
    // 'name의 나이는 age입니다'라는 문자열을 동적 생성해서 콘솔에 출력
    console.log(`${name}의 나이는 ${age}입니다`)
}
getPerson()

// undefined => 정의되어 있지 않다
function getPerson2(name, age) {
    console.log(`${name}의 나이는 ${age}입니다`)
}
getPerson2() // undefined의 나이는 undefined입니다

getPerson("모라역", 20)
getPerson("덕천역") // 덕천역의 나이는 26입니다

// 순서대로 매개변수가 채워진다
getPerson(20) // 20의 나이는 26입니다
getPerson(age=20) // 20의 나이는 26입니다

// --------------------------------------------------------------------

// 에로우 함수 생성법
// 표준함수에서 에로우 함수로 변경하기
// () : 소괄호, {} : 중괄호 , [] : 대괄호
// 백틱을 주석으로 사용

/*
* 표준함수
function 함수명 (매개변수) {
    수행문(statements) : 생략가능
    return 값 : 생략가능
}
*/

// 1. function 제거
// 2. 함수명 제거 (익명함수에서 변화하려면 해당 단계 생략)
// 3. 파라미터가 만약 1개라면 () 제거 가능, 단 없다면 무조건 () 존재
// 4. => 추가
// 5. {}는 수행문이 하나인 경우 생략 가능
// 6. 수행문이 하나인데, 중괄호가 생략되어 있고, return이면 return 생략 가능

function getPerson3(name) {
    return `이름은 ${name}입니다.`
}

// 에로우 함수로 변환
const getPerson4 = (name) => {
    return `이름은 ${name}입니다.`
}

const getPerson5 = name => `이름은 ${name}입니다.`
console.log(getPerson5("컴퓨터"))