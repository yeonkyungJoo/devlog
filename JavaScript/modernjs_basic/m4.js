// for문, 인덱스 증가, for~in(for each)
// 자바스크립트의 for each는 의미가 좀 달랐다
// 표준에서 for~of가 추가되어 정확한 처리로 변경

let list = [1, 2, 3, 4]

// 기존의 for each -> 값을 순서대로 뽑는 게 목적
for(let i in list) {
    // 인덱스가 순서대로 나온다
    // console.log(i) // 0 1 2 3

    // 배열[인덱스]해서 값을 뽑아야만 했다
    console.log(i, list[i])
}

// 모던 스크립트에서 개선되었다 -> of
for(let i of list) {
    console.log(i) // 1 2 3 4
}