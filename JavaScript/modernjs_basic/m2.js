// 문자열
// 기존 표기법 : "...", '...'
// 왜 2개인가? => 표현을 자유롭게 하기 위해

console.log("I'm a boy")
// 문자열 내부에 문자열 표식이 있어서 문제가 있는 경우 대체 표현으로 사용
console.log('I\'m a boy') // 이스케이프 문자 \ 기호
// 모던 추가 : 포맷팅 때문에 등장한 `.....`
// ` : 백틱

let subway_mora = '모라역'
let city = '부산'
let gu = '사상구'

// 주소를 표시하시오
// 기존 방식
console.log(city+" "+gu+" "+subway_mora)
// 신규 방식
// 백틱으로 열고 중간에 ${변수명} 삽입해서 문자열 완성
console.log(`${city} ${gu} ${subway_mora}`)
