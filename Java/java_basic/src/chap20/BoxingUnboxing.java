package chap20;

public class BoxingUnboxing {

	public static void main(String[] args) 
	{
		// Integer 클래스와 Double 클래스를 이용해서 10과 3.14를 Boxing 처리
		Integer iValue = new Integer(10);
		Double dValue= new Double(3.14);
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		// Integer형 인스턴스에 저장되어 있는 정수 값을 얻기 위해 intValue() 호출 -> Unboxing & 새로운 인스턴스 생성
		iValue = new Integer(iValue.intValue()+10);
		// Double형 인스턴스에 저장되어 있는 실수 값을 얻기 위해 doubleValue() 호출 -> Unboxing & 새로운 인스턴스 생성
		dValue = new Double(dValue.doubleValue()+1.2);
		
		System.out.println(iValue);
		System.out.println(dValue);
	}

}
