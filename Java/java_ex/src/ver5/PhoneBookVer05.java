package ver5;

import java.util.Scanner;

interface INIT_MENU 
{
	int SAVE = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

class MenuViewer {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("PhoneBookVer05");
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

public class PhoneBookVer05 {

	public static void main(String[] args) {
		
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
	
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.sc.nextInt();
			MenuViewer.sc.nextLine();
			
			System.out.println("시작 전 curIndex 개수 : " + manager.curIndex);
			switch(choice) {
				case INIT_MENU.SAVE :
					manager.savePhoneInfo();
					break;
				case INIT_MENU.SEARCH :
					manager.searchPhoneInfo();
					break;
				case INIT_MENU.DELETE :
					manager.deletePhoneInfo();
					break;
				case INIT_MENU.EXIT :
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
			
	}
}
