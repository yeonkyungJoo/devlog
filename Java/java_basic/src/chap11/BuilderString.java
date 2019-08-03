package chap11;

public class BuilderString {
	
	// StringBuilder는 문자열의 저장 및 변경을 위한 메모리 공간(버퍼)을 내부에 지니는데
	// 이 메모리 공간은 그 크기가 자동으로 조절된다.
	
	public static void main(String[] args) {

		StringBuilder strBuf = new StringBuilder("AB");
		
		// append 메소드는 strBuf의 참조값을 반환
		strBuf.append(25);
		strBuf.append('Y').append(true);
		System.out.println(strBuf);
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println(strBuf);
	}

}
