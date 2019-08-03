package chap13;

public class Ex3_1 {

	public static int minValue(int[] arr) {
		
		int min = arr[0];
		for(int e : arr) {
			if(e<min) {
				min = e;
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		
		int max = arr[0];
		for(int e : arr) {
			if(e>max) {
				max = e;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 4, 85, 56, 1, 0, 2, -3, 30};
		
		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));
		
		
	}

}
