package chap21;

interface SimpleInterface
{
	public void showYourName();
}

class UpperClass
{
	public void showYourAncestor()
	{
		System.out.println("UpperClass");
	}
}

class AA extends UpperClass implements SimpleInterface
{
	public void showYourName()
	{
		System.out.println("Class AA");
	}
}

class BB extends UpperClass implements SimpleInterface
{
	public void showYourName()
	{
		System.out.println("Class BB");
	}
}

public class BoundedTypeParam {
	
	public static <T> void showInstanceAncestor(T param)
	{
		
		((SimpleInterface)param).showYourName();
	}

	public static <T> void showInstanceName(T param)
	{
		
		((UpperClass)param).showYourAncestor();
	}
	
	public static void main(String[] args) 
	{
		AA aa = new AA();
		BB bb = new BB();

		showInstanceAncestor(aa);
		showInstanceName(aa);
		showInstanceAncestor(bb);
		showInstanceName(bb);
		
//		aa.showYourName();
//		aa.showYourAncestor();
//		bb.showYourName();
//		bb.showYourAncestor();
	}

}
