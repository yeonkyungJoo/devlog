package ver6;


interface INPUT_SELECT 
{
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}


public class PhoneBookManager {
	
	// PhoneBookManager 클래스의 인스턴스 수가 최대 하나를 넘지 않도록 코드 변경
	
	final int MAX_CNT = 100;
	PhoneInfo[] pInfoArr = new PhoneInfo[MAX_CNT];
	int curIndex = 0;
	
	private PhoneBookManager() { }
	
	public static PhoneBookManager inst = null;
	public static PhoneBookManager createManagerInst()
	{
		if(inst == null) {
			inst = new PhoneBookManager();
		} 
		return inst;
	}
	
	private PhoneInfo saveFriendInfo()
	{
		System.out.print("이름 : "); String name = MenuViewer.sc.nextLine();
		System.out.print("전화번호 : "); String pnum = MenuViewer.sc.nextLine();
		return new PhoneInfo(name, pnum);
	}
	
	private PhoneInfo saveUnivFriendInfo()
	{
		System.out.print("이름 : "); String name = MenuViewer.sc.nextLine();
		System.out.print("전화번호 : "); String pnum = MenuViewer.sc.nextLine();
		System.out.print("전공 : "); String major = MenuViewer.sc.nextLine();
		System.out.print("학년 : "); int year = MenuViewer.sc.nextInt();
		return new PhoneUnivInfo(name, pnum, major, year);
	}
	
	private PhoneInfo saveCompanyFriendInfo()
	{
		System.out.print("이름 : "); String name = MenuViewer.sc.nextLine();
		System.out.print("전화번호 : "); String pnum = MenuViewer.sc.nextLine();
		System.out.print("회사 : "); String company = MenuViewer.sc.nextLine();
		return new PhoneCompanyInfo(name, pnum, company);
	}
	
	// 데이터의 저장
	public void savePhoneInfo() throws MenuChoiceException {

		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> "); int choice = MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();
		
		if(choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(choice);
		}
		
		PhoneInfo info = null;
		
		switch(choice) {
		
		case INPUT_SELECT.NORMAL : 
			info = saveFriendInfo();
			break;
		case INPUT_SELECT.UNIV :
			info = saveUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY :
			info = saveCompanyFriendInfo();
			break;
		}
		
		pInfoArr[curIndex++] = info;
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
