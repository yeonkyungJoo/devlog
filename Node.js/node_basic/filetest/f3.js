// 1.txt, 2.txt, 3.txt 데이터를 읽어서 배열에 담아 결과를 돌려주는 testReadFile 함수를 구성

const fs = require('fs')

function testReadFile (cb) {
    // 결과 담는 그릇 : 배열
    let results = []
    fs.readFile('./1.txt', (err, data)=>{
        results.push(toStr(data)) // 데이터를 배열에 추가
        fs.readFile('./2.txt', (err, data)=>{
            results.push(toStr(data))
            fs.readFile('./3.txt', (err, data)=>{
                results.push(toStr(data))
                // results를 함수 밖으로 내보내야 한다
                // return을 사용할 수 없다 -> 콜백함수로 처리
                cb(results)
            })
        })
    })
}

function toStr(data) {
    return new String(data).toString()
}

testReadFile((results)=>{
    console.log(results.length)
    console.log(results)
})