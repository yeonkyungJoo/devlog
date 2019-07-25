// 5. 조건문 테스트 and 문자열
let yourInput = 'hello'

// 백틱(``) 활용
console.log(`[${yourInput}]`) // [hello]

console.log(yourInput.length) // 5
console.log(yourInput.length==0) // false

// yourInput이 문자열인지 어떻게 아는가?
// => 타입검사 : typeof or typeof()
console.log(typeof(yourInput), typeof yourInput) // string string

console.log(typeof(yourInput1), typeof yourInput1) // undefined undefined
console.log(typeof yourInput1 == 'undefined') // true

let yourInput2 = null
console.log(yourInput2) // null
console.log(typeof yourInput2) // object
console.log(yourInput2 == null) // true
console.log(yourInput2 === null) // true


