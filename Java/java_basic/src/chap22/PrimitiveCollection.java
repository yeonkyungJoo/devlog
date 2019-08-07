package chap22;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);		// Auto Boxing
		list.add(20);		// Auto Boxing
		list.add(30);		// Auto Boxing
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			int num = itr.next();
			System.out.println(num);
		}
	}

}
