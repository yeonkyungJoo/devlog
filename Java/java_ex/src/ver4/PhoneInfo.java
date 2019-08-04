package ver4;

class PhoneInfo {	
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String pnum) {
		this.name = name;
		this.phoneNumber = pnum;
	}
	
	public void showPhoneInfo () {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
}

class PhoneUnivInfo extends PhoneInfo {
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String pnum, String major, int year) {
		super(name, pnum);
		this.major = major;
		this.year = year;
	}
	
	public void showPhoneInfo () {
		super.showPhoneInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo {
	String company;
	
	public PhoneCompanyInfo(String name, String pnum, String company) {
		super(name, pnum);
		this.company = company;
	}
	
	public void showPhoneInfo () {
		super.showPhoneInfo();
		System.out.println("회사 : " + company);
	}
	
}