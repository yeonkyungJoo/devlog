package ver4;

import java.util.Scanner;

class MenuViewer {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("PhoneBookVer04");
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

public class PhoneBookVer04 {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
	
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.sc.nextInt();
			MenuViewer.sc.nextLine();
			
			System.out.println("시작 전 curIndex 개수 : " + manager.curIndex);
			switch(choice) {
				case 1 :
					manager.savePhoneInfo();
					break;
				case 2 :
					manager.searchPhoneInfo();
					break;
				case 3 :
					manager.deletePhoneInfo();
					break;
				case 4 :
					System.out.println("프로그램을 종료합니다.");
					return;
			}
			
			// 데이터 확인
			// System.out.println(manager.curIndex);
			// for(int i = 0; i<(manager.curIndex); i++) {
			// 		System.out.println(manager.pInfoArr[i].name);
			// }	
		}
		
	
	}
}
