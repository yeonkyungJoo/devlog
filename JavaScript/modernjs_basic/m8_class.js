// js의 클래스 정리
// -------------------------------------------------------------
// 1. 객체 리터럴
// 2. 슈퍼클래스 확장
// 3. 생성자 함수 구현
// 4. 생성자 함수 + prototype을 통한 구현
// 5. class 키워드를 이용한 구현 -> react에서 사용하는 방식
// (But, 모든 브라우저가 지원하는 것이 아니므로)
// => babel => 4번 방식 변경되어 구동
// -------------------------------------------------------------
// 1. 객체 리터럴 : 인자를 넘길 때 데이터 종류가 많으면, 1회용 객체
var obj = {
    name : '컴퓨터',
    getName : function() {
        // 에로우 함수 사용 시, this 용법 주의
        return this.name
    }
}
console.log(obj)
console.log(obj.name)
console.log(obj.getName())

// 2. 슈퍼클래스 확장(object)
var p = new Object()
console.log(p) // {}
// 객체에 . 찍고 멤버 바로 추가 가능
p.name = '멤버 변수 추가'
p.getName = function () {
    return this.name
}

// 3. 생성자 함수 구현
function Person(name, age) {
    this.name = name
    this.age = age
    this.getName = function () {
        return this.name
    }
}
var obj1 = new Person('컴퓨터', 10) 
console.log(obj1) // Person { name: '컴퓨터', age: 10, getName: [Function] }
// 객체에 이름 - Person
// 문제 : 객체를 만들면 만들수록 함수 영역이 계속해서 생성된다
console.log(obj1.name)
console.log(obj1.age)
console.log(obj1.getName())

// 4. 생성자 함수 + prototype을 통한 구현
function PersonEx(name) {
    this.name = name
}
PersonEx.prototype.age = 10
PersonEx.prototype.getName = function () {
    return this.name
}
// console.log(PersonEx('컴퓨터2')) // undefined -> new로 생성
console.log(new PersonEx('컴퓨터2')) // PersonEx { name: '컴퓨터2' }
console.log(PersonEx.prototype.age)

// 5. class 키워드를 이용한 구현
class Food {
    // 생성자
    constructor (name, age) {
        // 멤버 변수는 this.xx라고 쓰면 바로 생긴다
        this.name = name
        this.age = age
    }
    // 멤버함수 : 생성자 밖에서 썼으므로 prototype형
    info() {
        console.log(`${this.name} / ${this.age}`)
    }
}
let food = new Food('사과', 10)
console.log(food) // Food { name: '사과', age: 10 }
food.info()
console.log(food.name)
console.log(food.age)

// 상속 : 부모의 것(멤버변수, 함수) 다 사용 가능, 재정의 가능
// 자식은 새로운 기능 추가 가능
class FoodEx extends Food {
    // 재정의
    info () {
        console.log (`재정의 ${this.name} / ${this.age}`)
    }
}
let fe = new FoodEx('애플망고', 10)
console.log(fe) // FoodEx { name: '애플망고', age: 10 }
console.log(fe.name)
console.log(fe.age)
fe.info()
