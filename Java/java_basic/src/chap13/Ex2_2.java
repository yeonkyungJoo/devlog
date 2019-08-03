package chap13;

public class Ex2_2 {

	public static void changeDArr (int[][] arr) {
		
		int[] temp = arr[arr.length-1];
		for(int i=arr.length-1; i>=0; i--) {
			if(i==0) {
				arr[i] = temp;
			} else {
				arr[i] = arr[i-1];
			}
		}	
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 1, 1, 1, 1},
				{2, 2, 2, 2},
				{3, 3, 3, 3},
				{4, 4, 4, 4, 4, 4, 4, 4}
		};
		
		changeDArr(arr);
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
