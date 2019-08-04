package chap17;

interface Readable2
{
	public void read();
}

class OuterClass3 
{
	private String myName;
	
	OuterClass3(String name)
	{
		myName = name;
	}
	
	public Readable2 createLocalClassInst(final int instID)
	{
		// return new Readable2();
		// Readable2는 인터페이스므로 인스턴스 생성이 불가능하다.
		// 인스턴스 생성이 불가능한 가장 큰 이유는 메소드가 완전히 정의되지 않아서
		// -> 메소드의 몸체를 채워 넣는 방식의 인스턴스 생성을 허용
		return new Readable2()
		//class LocalClass implements Readable2
		{
			public void read()
			{
				System.out.println("Outer inst name : " + myName);
				// 매개변수 instID에 접근
				System.out.println("Local inst ID : " + instID);
			}
		};
		// return new LocalClass();
	}
}

public class LocalParamClassTest {

	public static void main(String[] args) 
	{
		OuterClass3 out = new OuterClass3("My Outer Class");
		Readable2 localInst1 = out.createLocalClassInst(111);
		localInst1.read();
		
		Readable2 localInst2 = out.createLocalClassInst(222);
		localInst2.read();
	}

}
