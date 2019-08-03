package ver2;

import java.util.Scanner;

public class PhoneBookVer02 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void readData() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String pnum = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		PhoneInfo pInfo = new PhoneInfo(name, pnum, birth);
		
		System.out.println();
		System.out.println("입력된 정보 출력...");
		pInfo.showPhoneInfo();
	}
	
	public static void main(String[] args) {

		while(true) {

			showMenu();
			int choice = sc.nextInt();
			sc.nextLine(); // choice 뒤의 enter가 남아있으므로, 남은 enter를 읽어들여야 한다
			
			if(choice == 1) {
				readData();
			} else if(choice == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		
		sc.close();
		
	}

}
