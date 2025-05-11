package Multilevel;

public class Childvariable extends Parentvariable 
{
	double a=200.0;
	static String b="Tester";
	
	public void r1()
	{
		
		System.out.println("-----child-----");
		System.out.println(this.a);
		System.out.println(Childvariable.b);
		
		System.out.println("------parent------");
		System.out.println(super.a);
		System.out.println(Parentvariable.b);
		System.out.println(Parentvariable.c);
		
		System.out.println("-----grandparent-------");
		Grandparentvariable g= new Grandparentvariable();
		System.out.println(g.a);
		System.out.println(Grandparentvariable.b);
	}
	
	public void r5()
	{
		int a=70;
		float b=4.5f;
		float c=a*b;
		System.out.println(c);
	}
	public static void r6()
	{
		float a=2.5f;
		double b=800.0;
		double c=a+b;
		System.out.println(c);
	}
	
	public static void r7()
	{
		double a=100.0;
		int b=70;
		float c=6.5f;
		double d=a+b+c;
		System.out.println(d);
	}
	

	public static void main(String[] args)
	{
		r6();
		r7();
		r4();
		r3();
		
		Childvariable k=new Childvariable();
		k.r1();
		k.r5();
		k.r2();
		
		Parentvariable t=new Parentvariable();
		t.r1();
		
		Grandparentvariable h=new Grandparentvariable();
		h.r1();


	}

}
