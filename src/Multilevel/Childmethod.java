package Multilevel;

public class Childmethod extends Parentmethod
{
	public void f1()
	{
		System.out.println("Temple");
	}
	public void f4()
	{
		System.out.println("Football");
	}
	public static void f5()
	{
		System.out.println("Vallyball");
		Parentmethod b=new Parentmethod();
		b.f1();
	}
	public static void f6()
	{
		System.out.println("Hokey");
	}

	public static void main(String[] args) 
	{
		//f5();
		//f6();
		//f3();
		//f7();
		
		Childmethod r=new Childmethod();
		//r.f1();
		//r.f4();	
		//r.f2();
		
		
		Parentmethod t=new Parentmethod();
		t.f1();
		
		Grandparentmethod y=new Grandparentmethod();
		//y.f1();
		

	}

}
