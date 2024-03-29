package chap17;

interface UpperCasePrintable {
	// 아무것도 채워지지 않은 형태
	// 다른 클래스와의 구별을 위한 특별한 표시의 목적으로 사용되었다.
}

class ClassPrinter {
	
	public static void print(Object obj) {
		String org = obj.toString();
		// UpperCasePrintable 인터페이스를 구현하는 클래스의 인스턴스인지 확인
		if(obj instanceof UpperCasePrintable) {
			org = org.toUpperCase();
		}
		System.out.println(org);
	}
}

class PointOne implements UpperCasePrintable {
	
	private int xPos, yPos;
	
	PointOne(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public String toString() {
		String posInfo = "[ x pos : " + xPos + ", y pos : " + yPos + "]";
		return posInfo;
	}
}


class PointTwo {
	
	private int xPos, yPos;
	
	PointTwo(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public String toString() {
		String posInfo = "[ x pos : " + xPos + ", y pos : " + yPos + "]";
		return posInfo;
	}
}

public class InterfaceMark {

	public static void main(String[] args) {
		
		PointOne pos1 = new PointOne(1, 1);
		PointTwo pos2 = new PointTwo(2, 2);
		PointOne pos3 = new PointOne(3, 3);
		PointTwo pos4 = new PointTwo(4, 4);
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
	}

}
