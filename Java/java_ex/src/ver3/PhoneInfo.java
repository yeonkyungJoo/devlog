package ver3;

class PhoneInfo {	
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String pnum, String birth) {
		this.name = name;
		this.phoneNumber = pnum;
		this.birthday = birth;
	}
	
	public PhoneInfo(String name, String pnum) {
		this.name = name;
		this.phoneNumber = pnum;
		this.birthday = null;
	}
	
	public void showPhoneInfo () {
		System.out.println("name : " + name);
		System.out.println("phoneNumber : " + phoneNumber);
		System.out.println("birthday : " + birthday);
		System.out.println();
	}
}