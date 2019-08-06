package chap20;

public class AutoBoxingUnboxing {

	public static void main(String[] args) 
	{
		Integer iValue = 10;	// auto boxing
		Double dValue = 3.14;	// auto boxing
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1 = iValue;		// auto unboxing
		double num2 = dValue;	// auto unboxing
		System.out.println(num1);
		System.out.println(num2);
	}

}
