package chap21;

class InstanceTypeShower2
{
	// 제네릭 메소드에는 둘 이상의 자료형 매개변수를 선언하고, 각각에 다른 자료형 정보를 전달할 수도 있다
	public <T, U> void showInstType(T inst1, U inst2)
	{
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

public class IntroGenericMethod2 {

	public static void main(String[] args) 
	{
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		InstanceTypeShower2 shower = new InstanceTypeShower2();
		shower.<AAA, BBB>showInstType(aaa, bbb);
		shower.showInstType(aaa, bbb);
	}

}
