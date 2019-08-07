package chap21;

// class Orange

class Apple
{
	int weight; 	// 사과 무게
	public Apple(int weight)
	{
		this.weight = weight;
	}
	public void showAppleWeight()
	{
		System.out.println("무게 : " + weight);
	}
}

class FruitBox2<T>
{
	T item;
	
	FruitBox2(T item) {
		this.item = item;
	}
	public void store(T item)
	{
		this.item = item;
	}
	public T pullOut()
	{
		return item;
	}
}

public class GenericBaseFruitBox {

	public static void main(String[] args) 
	{
		FruitBox2<Orange> orBox = new FruitBox2<Orange>(new Orange(10));
		//orBox.store(new Orange(10));
		Orange org = orBox.pullOut();
		org.showSugarContent();
		
		FruitBox2<Apple> apBox = new FruitBox2<Apple>(new Apple(20));
		//apBox.store(new Apple(20));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
	}

}
