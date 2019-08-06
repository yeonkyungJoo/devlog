package ver6;

import java.util.Scanner;

interface INIT_MENU 
{
	int SAVE = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

class MenuViewer {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("PhoneBookVer06");
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

public class PhoneBookVer06 {

	public static void main(String[] args) {
		
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
	
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			try
			{
				choice = MenuViewer.sc.nextInt();
				MenuViewer.sc.nextLine();
				
				if(choice<INIT_MENU.SAVE || choice>INIT_MENU.EXIT) {
					throw new MenuChoiceException(choice);
				}
				
				switch(choice) {
					case INIT_MENU.SAVE :
						try 
						{
							manager.savePhoneInfo();
							break;
						}
						catch (MenuChoiceException e)
						{
							e.showWrongChoice();
							System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
							continue;
						}
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
			catch(MenuChoiceException e)
			{
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
				continue;
			}
		}	
	}
}
