package chap19;

public class StringEquals {

	public static void main(String[] args) 
	{
		String str1 = new String("Hi my String");
		String str2 = new String("Hi my String"); // 새로운 인스턴스를 생성
		
		if(str1==str2)
			System.out.println("참조 대상이 동일하다.");
		else
			System.out.println("참조 대상이 동일하지 않다.");
		
		if(str1.equals(str2))
			System.out.println("인스턴스 내용이 동일하다.");
		else
			System.out.println("인스턴스 내용이 동일하지 않다.");
	}

}
