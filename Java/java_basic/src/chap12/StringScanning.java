package chap12;

import java.util.Scanner;

public class StringScanning {

	public static void main(String[] args) {
		
		String source = "1 5 7";
		Scanner sc = new Scanner(source);
		
		// 모든 공백(스페이스 바, 탭, 엔터 키의 입력)이 데이터를 구분하는 기준
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		
		System.out.printf(
				"문자열에 저장된 %d, %d, %d의 합은 %d \n",
				num1, num2, num3, sum);
		
		sc.close();
	}

}
