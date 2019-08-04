package chap17;

class OuterClassOne {

	OuterClassOne() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo {

	OuterClassTwo() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	// private 선언 : OuterClassTwo 클래스 내에서만 인스턴스의 생성이 가능한 클래스
	private static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Instance Method Two");
		}
	}
}


public class NestedClassTest {

	public static void main(String[] args) {
		
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		
		// private 선언
		// OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass();
		// nst2.simpleMethod();		
	}

}
