package chap21;

class Orange {
	int sugarContent; // 당분 함량
	public Orange(int sugar) {
		sugarContent = sugar;
	}
	public void showSugarContent() {
		System.out.println("당도 : " + sugarContent);
	}
}

class FruitBox { // 무엇이든 저장 가능한 박스
	Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}	
}

public class ObjectBaseFruitBox {

	public static void main(String[] args) {
		
		FruitBox fBox1 = new FruitBox();
		fBox1.store(new Orange(10));
		Orange org1 = (Orange)fBox1.pullOut();
		org1.showSugarContent();
		
		FruitBox fBox2 = new FruitBox();
		fBox2.store("오렌지");
		Orange org2 = (Orange)fBox2.pullOut();
		org2.showSugarContent();
	}

}
