package chap21;

class AAA
{
	public String toString()
	{
		return "Class AAA";
	}
}

class BBB
{
	public String toString()
	{
		return "Class BBB";
	}
}

// 자바는 클래스 전부가 아닌 특정 메소드에 대해서만 제네릭으로 선언하는 것을 허용한다
class InstanceTypeShower
{
	int showCnt = 0;
	
	public <T> void showInstType(T inst)
	{
		System.out.println(inst);
		showCnt++;
	}
	
	void showPrintCnt()
	{
		System.out.println("Show count : "+ showCnt);
	}
}

public class IntroGenericMethod {

	public static void main(String[] args) 
	{
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		InstanceTypeShower shower = new InstanceTypeShower();
		shower.<AAA>showInstType(aaa);
		shower.<BBB>showInstType(bbb);
		shower.showPrintCnt();
	}

}
