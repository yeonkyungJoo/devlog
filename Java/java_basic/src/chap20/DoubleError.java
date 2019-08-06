package chap20;

public class DoubleError {

	public static void main(String[] args) 
	{
		// 일반적인 실수의 표현에는 오차가 존재한다
		double e1 = 1.6;
		double e2 = 0.1;
		
		System.out.println("두 실수의 덧셈결과 : " + (e1+e2));
		System.out.println("두 실수의 곱셈결과 : " + (e1*e2));
	}

}
