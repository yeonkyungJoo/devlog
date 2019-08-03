package chap12;

class Friend {
	String myName;
	public Friend(String name) {
		myName = name;
	}
	
	public String toString() {
		return "제 이름은 " + myName + "입니다.";
	}
}


public class StringToString {

	public static void main(String[] args) {
		
		Friend fnd1 = new Friend("이종수");
		Friend fnd2 = new Friend("현주은");
		
		// println 메소드는 인스턴스의 참조값이 전달되면
		// 그 인스턴스 내에 정의된 toString 메소드를 호출하고
		// 그 메소드가 반환하는 문자열을 출력한다
		System.out.println(fnd1);
		System.out.println(fnd2);
		
		System.out.println("출력이 종료되었습니다.");
		
	}

}
