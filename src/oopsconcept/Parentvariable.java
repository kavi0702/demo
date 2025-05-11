package oopsconcept;

public class Parentvariable {
	int a=1000;
	static String b="Kavitha";
	public void n1()
	{
		//System.out.println(this.a);
		//System.out.println(Parentvariable.b);
		
		//Childvariable n=new Childvariable();
		//n.n4();
		Childvariable.n5();
	}
	public void n2()
	{
		double a=600.0;
		int b=100;
		double c=(a+b);
		System.out.println(c);
		
		Childvariable.n5();
	}
	public static void n3()
	{
		float a=8.5f;
		double b=300.0;
		double c=a*b;
		System.out.println(c);
	}

}
