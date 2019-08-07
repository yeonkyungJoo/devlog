package chap21;

class OrangeBox
{
	Orange item;
	public void store(Orange item)
	{
		this.item = item;
	}
	public Orange pullOut()
	{
		return item;
	}
}

public class OrangeBaseOrangeBox {

	public static void main(String[] args) 
	{
		OrangeBox fBox1 = new OrangeBox();
		fBox1.store(new Orange(10));
		Orange org1 = (Orange)fBox1.pullOut();
		org1.showSugarContent();
		
		OrangeBox fBox2 = new OrangeBox();
		// fBox2.store("오렌지");		에러 : 자료형의 불일치로 발생하는 문제가 컴파일 과정에서 발견 -> 자료형에 대한 안전성 보장 
		Orange org2 = fBox2.pullOut();
		org2.showSugarContent();
	}

}
