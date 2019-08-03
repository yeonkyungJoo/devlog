package chap13;

class Number {

	public int num;
	public Number(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
}

public class EnhancedForInst {

	public static void main(String[] args) {
		Number[] arr = new Number[] {
				new Number(2),
				new Number(4),
				new Number(8)
		};
		
		// 배열에 저장되어 있는 인스턴스 멤버 num의 값을 1씩 증가
		// 이는 배열에 저장되어 있는 참조 값을 통해서, 인스턴스의 값을 변경시킨 것
		// 즉 배열에 저장된 참조 값을 변경시킨 것이 아니기 때문에, 인스턴스의 값은 실제 변경이 된다.
		for(Number e : arr) {
			e.num++;
		}
		
		for(Number e : arr) {
			System.out.print(e.getNum()+" ");
		}
		
		System.out.println();
		
		// 배열의 참조를 위해 선언된 변수 e의 값을 변경
		// for-each문 내에서 변경된 e의 값은 for-each문 내에서만 유효하므로
		// 이 연산의 결과는 실제 배열에는 반영 X
		for(Number e : arr) {
			e = new Number(5);
			e.num+=2;
			System.out.print(e.getNum()+" ");
		}
		
		System.out.println();
		
		for(Number e : arr) {
			System.out.print(e.getNum()+" ");
		}
	}

}
