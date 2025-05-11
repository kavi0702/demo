package Hierarchical;

public class Child1variable extends Parentvariable
{
	
	int a=1000;
	float b=8.5f;
	static String c="Swathi";
	
	public void d1()
	{
		System.out.println("----child-----");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Child1variable.c);
		
		System.out.println("-----parent-----");
		System.out.println(super.a);
		System.out.println(Parentvariable.b);
		
	}
	
	public void d3()
	{
		double a=700.0;
		float b=9.5f;
		double c=a-b;
		System.out.println(c);
	}
	
	public static void d4()
	{
		int a=80;
		float b=4.5f;
		float c=a/b;
		System.out.println(c);
	}

}
