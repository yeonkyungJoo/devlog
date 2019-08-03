package chap11;

class SimpleAdder {
	
	private int num;
	
	// 생성자
	public SimpleAdder() {
		num = 0;
	}
	
	public SimpleAdder add(int num) {
		this.num += num;
		// 참조를 반환하는 메소드
		// return this는 인스턴스 자신의 참조값 반환을 의미
		// 그리고 이렇게 반환되는 참조값을 대상으로 연이은 함수호출이 가능하다
		return this;
	}
	
	public void showResult() {
		System.out.println("add result : " + num);
	}
	
}

public class SelfReference {

	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		
		// add함수는 adder의 참조값을 반호나
		// => 추가적인 인스턴스 생성 X
		adder.add(1).add(3).add(5).showResult();
	}

}
