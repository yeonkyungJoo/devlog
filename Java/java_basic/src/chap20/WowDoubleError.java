package chap20;

import java.math.BigDecimal;

public class WowDoubleError {

	public static void main(String[] args) 
	{
		BigDecimal e1 = new BigDecimal(1.6);
		BigDecimal e2 = new BigDecimal(0.1);
		
		System.out.println(e1.add(e2));
		System.out.println(e1.multiply(e2));
	}

}
