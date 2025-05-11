package Hierarchical;

public class Child2variable extends Parentvariable
{
	double a=200.0;
	static String b="Savitha";
	public void d1()
	{
		System.out.println("---child2----");
		System.out.println(this.a);
		System.out.println(Child2variable.b);
		
		System.out.println("----parent----");
		System.out.println(super.a);
		System.out.println(Parentvariable.b);
		
		System.out.println("-----child1-----");
		Child1variable r=new Child1variable();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(Child1variable.c);
		
	}
	
	public static void d5()
	{
		int a=90;
		double b=300.0;
		double c=a+b;
		System.out.println(c);
		
	}
	
	public static void d6()
	{
		float a=2.5f;
		int b=60;
		double c=500.0;
		double d=a/b/c;
		System.out.println(d);
		
		
	}

}
