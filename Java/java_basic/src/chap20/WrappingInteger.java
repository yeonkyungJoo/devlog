package chap20;

class IntWrapper
{
	private int num;
	
	public IntWrapper(int data)
	{
		num = data;
	}
	
	// toString() 오버라이딩
	public String toString()
	{
		return ""+num;
	}
}

public class WrappingInteger {

	public static void showData(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void main(String[] args) 
	{
		IntWrapper intInst = new IntWrapper(3);
		showData(intInst);
		showData(new IntWrapper(7));
	}

}
