package chap13;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for(int e : arr) {
			sum += e;
		}
		System.out.println(sum);
		
		for(int e : arr) {
			e++;
			System.out.print(e+" ");
		} // 각 요소 값이 1씩 증가했으나 배열에는 반영 X -> for-each문 내에서만 의미 있는 값
		
		System.out.println();
		
		for(int e : arr) {
			System.out.print(e+" ");
		}
		
	}

}
