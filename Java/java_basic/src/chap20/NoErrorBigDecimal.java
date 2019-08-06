package chap20;

import java.math.BigDecimal;

public class NoErrorBigDecimal {

	public static void main(String[] args) {
		// 오차 없는 실수의 표현 및 연산을 위해서는 문자열을 이용해서 값을 표현해야 한다
		BigDecimal e1 = new BigDecimal("1.6");
		BigDecimal e2 = new BigDecimal("0.1");
		
		System.out.println(e1.add(e2));
		System.out.println(e1.multiply(e2));
	}

}
