// 정수 난수 만들기
// parseInt(Math.random()*(범위 내 숫자 개수)) + (시작값)

// 1 <= 난수 <= 99
function makeRandom1() {
    return parseInt(Math.random()*99) + 1
}

// 일반화 : a <= 난수 <= b
function makeRandom2() {
    return parseInt(Math.random()*(b-a+1)) + a
}