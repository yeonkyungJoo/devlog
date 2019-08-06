package chap18;

import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

public class ProgrammerDefineException {

	// 예외상황의 처리를 예외 상황이 발생한 메소드(readAge())를 호출한 지점으로 넘긴다
	public static int readAge() throws AgeInputException
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<0)
		{
			// 예외 클래스의 인스턴스 생성
			AgeInputException excpt = new AgeInputException();
			// throw는 예외상황이 발생되었음을 자바 가상머신에게 알리는 키워드
			// 이 문장이 실행되면서 자바의 예외처리 매커니즘이 동작
			throw excpt;
		}
		return age;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("나이를 입력하세요 : ");

		try
		{
			int age = readAge();
			System.out.println("당신은 " + age + "세입니다.");
		}
		catch(AgeInputException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
