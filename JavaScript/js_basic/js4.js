// 4. class
// 객체지향 프로그래밍을 하기 위해
// 기존의 4가지 방식 + 모던 1개(추가, 지향점)

// 1) 객체 리터럴
// 아주 많이 사용, 일회성 객체
// 함수(객체생성자) 호출 시, 매개변수가 많다면 객체 리터럴 형태로 통으로 던지는 경우가 안전

let obj = {
    name : 'hi', // 멤버 변수
    getName : function () { // 멤버 함수
        // 자기 자신을 가리키는 키워드 => this
        return this.name
    }
}
console.log(obj) // { name: 'hi', getName: [Function: getName] }
// 멤버 변수 사용
console.log(obj.name)
// 멤버 함수 사용
console.log(obj.getName) // [Function: getName]
console.log(obj.getName()) // hi (괄호 주의)

// 2) Object 확장 (잘 사용 X)
let obj2 = new Object()
console.log(obj2) // {}
// 멤버 변수 추가, 초기화
obj2.name = "컴퓨터"
console.log(obj2) // { name: '컴퓨터' }
// 멤버 함수 추가 
obj2.getName = function () {
    return this.name
}
console.log(obj2)
console.log(obj2.name)
console.log(obj2.getName)
console.log(obj2.getName())

// 3) 생성자 함수
// 4) 생성자 함수 + 프로토타입
// 5) class (이 스타일로 만든 것이 reactjs)