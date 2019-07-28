// 모듈, 모듈 가져오기 -> node에서 등장
// 기존 클라이언트사이드 js의 한계점
// html이 없으면 존재할 수 없다. js 쪼개기 X -> 구조화 한계
// node에서는 js가 하나의 모듈로 인식, node 자체가 js(모듈)의 집합

// 모듈 가져오기 (자바의 import와 유사)
// 1) 써드파트 패키지 모듈(남이 만든 모듈인 경우) - npmjs.com
// require('모듈명')
// 2) 내가 만든 모듈인 경우
// require('상대경로/모듈명.js')
// require('상대경로/모듈명')

// ./ : 현재 위치
// ../ : 현재에서 위

const mod = require('./m5_mod')
console.log(mod) // { cost_ex: 1500, getCost2: [Function] } : exports 된 것만 출력

console.log(mod.cost_ex)
console.log(mod.getCost2())

// ES2015~ 이후 모듈 가져오기는
// import 대표모듈, {개별모듈, 개별모듈} from '상대경로/모듈명'
// import {cost_ex, getCost2} from './m5_mod'