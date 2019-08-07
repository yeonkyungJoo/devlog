// 파일이 n개가 존재한다. 차례대로 읽어서 출력 -> 나만의 비동기 처리함수 구현
// 1.txt 읽고 출력 -> 2.txt 읽고 출력 -> 3.txt 읽고 출력

const fs = require('fs')

fs.readFile('./1.txt', (err, data)=>{
    console.log(err, toStr(data))
    console.log('1.txt 완료')
    fs.readFile('./2.txt', (err, data)=>{
        console.log(err, toStr(data))
        console.log('2.txt 완료')
        fs.readFile('./3.txt', (err, data)=>{
            console.log(err, toStr(data))
            console.log('3.txt 완료')
            console.log('완료')
        })
    })
})

function toStr(data) {
    return new String(data).toString()
}