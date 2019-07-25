// utf-8 : 완성형코드(8비트) <-> 조합형코드 : euc-kr(16비트)
// 완성형코드 : ex) 가 -> 82 / 값 하나 대응
// 한글 안 깨지게 하기 위해
// 표준 입력 부분에 인코딩을 utf-8로 지정

// process, os, ... : 내장객체(만든 적 없지만 사용 가능한 객체)
process.stdin.setEncoding('utf8')


// 자바스크립트의 모든 이벤트 코드는 동일하다
/*
// 이벤트 매커니즘
// 클릭했다 -> 잠시 후 -> 이벤트가 전달 -> 등록된 함수가 호출
// "언제 이벤트가 전달될 지 아무도 모른다"
// => 이벤트가 발생하고 나서 무언가를 처리해야 하는 함수는 항시 대기해야 한다
// 이를 '비동기 상황'이라고 한다

// 비동기 프로그램은 즉각적이지 않아도 이벤트가 발생돼서 전달만 되면 그 때 바로
// 이어서 코드를 진행하게끔 작성하는 프로그램 스타일이다.

xxx.on('이벤트명', () => {}(콜백함수 / 모습 : 에로우, 익명함수))
- I/O 상황은 100% 비동기 
*/

// 'readable' 이벤트 발생 시, 뒤에 함수가 호출
process.stdin.on('readable', () => {
    console.log('호출')

    // 0 ~ 무한대의 반복 (언제 끝날 지 모를 때) : while
    // 지정된 횟수를 반복 : for

    // process.stdin.read() : enter 치면 읽어온다, 리턴함수

    // while(true) {
    //     // 대기 : 사용자가 enter 칠 때까지
    //     let word = process.stdin.read() // 리턴 함수이므로 변수 필요
    //     process.stdout.write(word) // 계속 null 출력
    // }

    let chunk
    while((chunk = process.stdin.read())!==null) {
        // 사용자가 enter를 치면 값을 획득해서 chunk에 담고
        // 이것을 null과 비교하여 정상일 때만 출력한다
        process.stdout.write(`data : ${chunk}`)
        console.log(`data : ${chunk}`) // console.log는 밑에 줄바꿈이 생긴다
    }
})