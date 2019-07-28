// 모듈
// 대표 모듈, 일반적 모듈
// exports를 붙이지 않은 변수, 함수, 클래스 등은
// 외부에서 쓸 수 없다. (이 안에서만 쓸 수 있다) -> private

// 일반적 모듈
let cost = 1500
exports.cost_ex = 1500

let getCost = () => {}
exports.getCost2 = () => {
    // 모듈화된 요소를 사용하고 싶으면
    // 보이는 그대로 네이밍을 다 사용
    return exports.cost_ex + cost
}

// console.log(exports.getCost2())