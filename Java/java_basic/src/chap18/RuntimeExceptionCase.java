package chap18;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		
		try
		{
			int[] arr = new int[3];
			arr[-1] = 20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		// 배열 클래스와 String 클래스는 형변환 불가능
		try
		{
			Object obj = new int[10];
			String str = (String)obj;
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			int[] arr = new int[-10];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e.getMessage());
		}
		
		// 참조변수가 null로 초기화된 상황에서 메소드 호출
		// 아무것도 참조하지 않으니 length 메소드를 호출할 수 없다
		try
		{
			String str = null;
			int len = str.length();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
