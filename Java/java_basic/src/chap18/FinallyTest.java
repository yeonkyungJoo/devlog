package chap18;

public class FinallyTest {

	public static boolean divider(int num1, int num2)
	{
		try
		{
			int result = num1/num2;
			System.out.println("나눗셈 결과는 " + result);
			return true;  
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			return false; 
		}
		finally 
		{
			// try 영역으로 일단 들어가면 무조건 실행되는 영역
			// 중간에 return을 하더라도 finally 영역은 실행되고 나서 메소드를 빠져나가게 된다
			System.out.println("finally 영역 실행");
		}
	}
	
	public static void main(String[] args) 
	{
		boolean divOK = divider(4, 2);
		if(divOK)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
		
		divOK = divider(4, 0);
		if(divOK)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
	}

}
