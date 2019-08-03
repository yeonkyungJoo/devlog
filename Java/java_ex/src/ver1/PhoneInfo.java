package ver1;

class PhoneInfo {
	String name;
	String phoneNumber;
	String birthday;
	
	// 생년월일 정보는 저장을 할 수도, 저장하지 않을 수도 있다 => 생성자 2개
	public PhoneInfo(String name, String pnum, String birth) {
		this.name = name;
		this.phoneNumber = pnum;
		this.birthday = birth;
	}
	
	public PhoneInfo(String name, String pnum) {
		this.name = name;
		this.phoneNumber = pnum;
	}
	
	public void showPhoneInfo () {
		System.out.println("name : " + name);
		System.out.println("phoneNumber : " + phoneNumber);
		System.out.println("birthday : " + birthday);
		System.out.println();
	}
}