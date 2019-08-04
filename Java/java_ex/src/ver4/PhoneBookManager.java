package ver4;

public class PhoneBookManager {
	
	static int MAX_CNT = 100;
	PhoneInfo[] pInfoArr = new PhoneInfo[MAX_CNT];
	int curIndex = 0;
	
	// 데이터의 저장
	public void savePhoneInfo() {

		String name, pnum, major, company;
		int year;
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> "); int choice = MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();
		
		switch(choice) {
		
		case 1 : 
			System.out.print("이름 : "); name = MenuViewer.sc.nextLine();
			System.out.print("전화번호 : "); pnum = MenuViewer.sc.nextLine();
			pInfoArr[curIndex++] = new PhoneInfo(name, pnum);
			break;
		case 2 :
			System.out.print("이름 : "); name = MenuViewer.sc.nextLine();
			System.out.print("전화번호 : "); pnum = MenuViewer.sc.nextLine();
			System.out.print("전공 : "); major = MenuViewer.sc.nextLine();
			System.out.print("학년 : "); year = MenuViewer.sc.nextInt();
			pInfoArr[curIndex++] = new PhoneUnivInfo(name, pnum, major, year);
			break;
		case 3 :
			System.out.print("이름 : "); name = MenuViewer.sc.nextLine();
			System.out.print("전화번호 : "); pnum = MenuViewer.sc.nextLine();
			System.out.print("회사 : "); company = MenuViewer.sc.nextLine();
			pInfoArr[curIndex++] = new PhoneCompanyInfo(name, pnum, company);
			break;
		}
		
		System.out.println("데이터 입력이 완료되었습니다.");
		System.out.println();
		
	}
	
	private int search(String name) {
		for(int i = 0; i<curIndex; i++) {
			PhoneInfo curInfo = pInfoArr[i];
			if(name.compareTo(curInfo.name)==0) {
				return i;
			}
		}
		return -1;
	}
	
	// 데이터의 검색
	public void searchPhoneInfo() {
		
		System.out.println("데이터 검색을 시작합니다..");
		
		System.out.print("이름 : ");
		String searchName = MenuViewer.sc.nextLine();

		int dataIndex = search(searchName);
		if(dataIndex<0) { // -1 
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			pInfoArr[dataIndex].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
		
	}
	
	// 데이터의 삭제
	public void deletePhoneInfo() {
		
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.println("이름 : ");
		String deleteName = MenuViewer.sc.nextLine();
		
		int dataIndex = search(deleteName);
		if(dataIndex<0) { // -1
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			
			for(int i = (dataIndex+1); i<(curIndex-1); i++) {
				pInfoArr[i] = pInfoArr[i+1];
			}
			
			curIndex--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	
}
