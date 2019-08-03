package chap13;

public class Ex2_1 {

	public static void addOneDArr(int[] arr, int add) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += add;
		}
	}
	
	public static void printOneDArr(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] += add;
			}
		}
	}
	
	public static void printTwoDArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// int[] arr1 = {1, 2, 3, 4, 5};
		// addOneDArr(arr1, 3);
		// printOneDArr(arr1);
		
		int[][] arr2 = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10}
		};
		addTwoDArr(arr2, 3);
		printTwoDArr(arr2);
	}

}
