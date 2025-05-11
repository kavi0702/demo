package Multilevel;

public class Parentvariable extends Grandparentvariable
{
	float a=8.5f;
	static String b="Priya";
	static double c=100.0;

	public void r1()
	{
		System.out.println("-----parent-----");
		System.out.println(this.a);
		System.out.println(Parentvariable.b);
		System.out.println(Parentvariable.c);
		
		System.out.println("-----grandparent------");
		System.out.println(super.a);
		System.out.println(Grandparentvariable.b);
		
	}
	public static void r4()
	{
		double a=300.0;
		float b=7.5f;
		double c=a/b;
		System.out.println(c);
	}

}
