package chap20;

import java.util.Random;

public class PseudoRandom {

	public static void main(String[] args) {
		
		Random rand = new Random(12);
		
		for(int i = 0; i<100; i++) 
		{
			System.out.println(rand.nextInt(1000));
		}
	}

}
