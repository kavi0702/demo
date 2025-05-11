package Multilevel;

public class Parentmethod extends Grandparentmethod
{
	public void f1()
	{
		System.out.println("Forest");
		
		//Childmethod j=new Childmethod();
		//j.f1();
		Childmethod.f6();
		
		
		
		
	}
	public static void f7()
	{
		System.out.println("laptop");
		Childmethod.f6();
	}

}
