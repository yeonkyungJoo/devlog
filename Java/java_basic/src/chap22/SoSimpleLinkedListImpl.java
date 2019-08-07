package chap22;

class Box<T>
{
	public Box<T> nextBox; // 다른 Box<T>의 인스턴스 참조를 위한 변수
	T item;
	
	public void store(T item)
	{
		this.item = item;
	}
	
	public T pullOut()
	{
		return item;
	}
}

public class SoSimpleLinkedListImpl {

	public static void main(String[] args) 
	{
		Box<String> boxHead = new Box<String>();
		boxHead.store("First String");
		
		boxHead.nextBox = new Box<String>();
		boxHead.nextBox.store("Second String");
		
		boxHead.nextBox.nextBox = new Box<String>();
		boxHead.nextBox.nextBox.store("Third String");
		
		Box<String> tempRef;
		
		// 두 번째 박스에 담긴 문자열 출력 과정
		tempRef = boxHead.nextBox;
		System.out.println(tempRef.pullOut());
		
		// 세 번째 박스에 담긴 문자열 출력 과정
		tempRef = boxHead.nextBox.nextBox;
		System.out.println(tempRef.pullOut());
		
	}

}
