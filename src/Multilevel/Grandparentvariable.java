package Multilevel;

public class Grandparentvariable
{
	int a=1000;
	static String b="Kavitha";
	
	public void r1()
	{
		System.out.println(this.a);
		System.out.println(Grandparentvariable.b);
	}
	public void r2()
	{
		int a=20;
		double b=200.0;
		double c=a+b;
		System.out.println(c);
	}
	public static void r3()
	{
		float a=3.5f;
		int b=50;
		float c=a-b;
		System.out.println(c);
	}

}
