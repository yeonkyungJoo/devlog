package chap21;

class Fruit
{
	public void showYou()
	{
		System.out.println("난 과일입니다.");
	}
}

class Banana extends Fruit
{
	public void showYou()
	{
		super.showYou();
		System.out.println("나는 노란 과일입니다.");
	}
}

class FruitBox3<T>
{
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

public class IntroWildCard {
	
	public static void openAndShowFruitBox(FruitBox3<? extends Fruit> box) 
	{
		Fruit fruit = box.pullOut();
		fruit.showYou();
	}

	public static void main(String[] args) 
	{
		FruitBox3<Fruit> box1 = new FruitBox3<Fruit>();
		box1.store(new Fruit());
		
		FruitBox3<Banana> box2 = new FruitBox3<Banana>();
		box2.store(new Banana());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
	}

}
