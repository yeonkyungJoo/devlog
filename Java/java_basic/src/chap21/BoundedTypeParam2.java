package chap21;

public class BoundedTypeParam2 {
	
	public static <T extends SimpleInterface> void showInstanceAncestor(T param)
	{
		
		param.showYourName();
	}

	public static <T extends UpperClass> void showInstanceName(T param)
	{
		
		param.showYourAncestor();
	}
	
	public static void main(String[] args) 
	{
		AA aa = new AA();
		BB bb = new BB();

		showInstanceAncestor(aa);
		showInstanceName(aa);
		showInstanceAncestor(bb);
		showInstanceName(bb);

	}

}
