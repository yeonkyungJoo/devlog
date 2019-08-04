package chap17;

class OuterClass {
	
	private String myName;
	private int num;
	
	OuterClass(String name) {
		myName = name;
		num = 0;
	}
	
	public void whoAreyou() {
		num++;
		System.out.println(myName + " OuterClass " + num);
	}
	
	class InnerClass {
		
		InnerClass() {
			// Inner 클래스 내에서는 Outer 클래스에 존재하는 멤버에 직접 접근이 가능하다
			whoAreyou();
		}
	}
}


public class InnerClassTest {

	public static void main(String[] args) 
	{
		OuterClass out1 = new OuterClass("First");
		OuterClass out2 = new OuterClass("Second");
		out1.whoAreyou();
		out2.whoAreyou();
		
		OuterClass.InnerClass inn1 = out1.new InnerClass();
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
	}

}
