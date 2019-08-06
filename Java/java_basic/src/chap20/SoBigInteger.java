package chap20;

import java.math.BigInteger;

public class SoBigInteger {

	public static void main(String[] args) 
	{
		System.out.println("최대 정수 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);
		
		// 매개변수 문자열로 전달
		BigInteger bigValue1 = new BigInteger("10000000000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999999999999");
		
		// 내부에 저장된 데이터의 변경이 불가능하기 때문에, 연산 결과를 담고 있는 별도의 인스턴스가 생성된다
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		
		System.out.println("큰 수의 덧셈결과 : " + addResult);
		System.out.println("큰 수의 곱셈결과 : " + mulResult);
	}

}
