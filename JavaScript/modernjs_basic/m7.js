// 스프레드 연산
//...

let a1 = ['콜라', '물', '사이다']
let a2 = ['밥', '햄버거']

// a1 배열 멤버 나오고, a2 배열 멤버가 차례대로 나와서 총 5개 멤버를 가진 배열
// 전체 값을 대변해서 다 포함시키는 연산자
let a3 = [...a1, ...a2]
console.log(a3) // [ '콜라', '물', '사이다', '밥', '햄버거' ]
// join은 (나열되어 있는) 배열의 멤버들을 특정 구분자를 기준으로 하나의 문자열로 생성
console.log(a3.join(',')) // 콜라,물,사이다,밥,햄버거
console.log(typeof a3.join(',')) // string
console.log(a3.join('/')) // 콜라/물/사이다/밥/햄버거


// split은 특정 문자열을 구분자 기준으로 분해하여 배열로 만드는 함수 <-> join
console.log(a3.join(',').split(',')) // [ '콜라', '물', '사이다', '밥', '햄버거' ]
console.log(typeof a3.join(',').split(',')) // object
console.log(a3.join('/').split('/')) // [ '콜라', '물', '사이다', '밥', '햄버거' ]

let url = 'https://sports.news.naver.com/wfootball/news/read.nhn?oid=413&aid=0000084237'
// 위 url에서 파일명 read.nhn 추출하기
console.log(url.split('/')[5].split('?')[0])
// 주소가 바뀔 가능성 
temp = url.split('/')
console.log(temp[temp.length-1].split('?')[0])

// a1 기준, 맨 뒤에 있는 데이터를 배열구조분해로 획득한다
var [b1, b2, b3, b4] = a1.reverse()
console.log(b1) // 사이다
console.log(b1, b2, b3, b4) // 사이다 물 콜라 undefined
console.log(b1, a1) // 사이다 [ '사이다', '물', '콜라' ] : a1값 자체가 변경

// 원본의 사본을 만들어서 작업
a1.reverse() // 원상복구
console.log(a1) // [ '콜라', '물', '사이다' ]

// 사본을 뜨고, 뒤집은 후에, 배열구조 분해
let [a6] = [...a1].reverse() // a6로 첫번째 값 하나만 가지고 오는 것
console.log(a6)

// 함수인자로 활용
test('콜라', '물', '사이다')
// 함수의 인자로 스프레드연산을 받으면 배열로 들어온다
function test(...args) {
    console.log('args => ', args)

    var [e, ...remain] = args
    console.log(e, remain) // 콜라 [ '물', '사이다' ]

    var [f, ...end] = remain.reverse() 
    console.log(f, end) // 사이다 [ '물' ]
}

// 함수를 호출할 때 스프레드를 사용하는 케이스
function test2(a, b) {
    return a + b
}

const data = [1, 2]
// var [a,b] = [1,2]
// 함수의 인자에 배열구조분해가 진행되어서 a에 1, b에 2가 대입된다
console.log(test2(data[0], data[1]))
console.log(test2(...data)) // 더 간결하다