package oopsconcept;

public class Childvariable extends Parentvariable {
	int a=10000;
	static String b="Developer";
	public void n1()
	{
		System.out.println("------child------");
		System.out.println(this.a);
		System.out.println(Childvariable.b);
		
		System.out.println("------parent-------");
		System.out.println(super.a);
		System.out.println(Parentvariable.b);
	}
	public void n4()
	{
		float a=7.5f;
		int b=40;
		float c=a-b;
		System.out.println(c);
		
	}
	public static void n5()
	{
		double a=500.0;
		float b=4.5f;
		double c=a/b;
		System.out.println(c);
		
		//Parentvariable t=new Parentvariable();
		//t.n2();
	}
	public static void n6()
	{
		float a=9.5f;
		int b=70;
		double c=400.0;
		double d=a*b*c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		//n6();
		//n5();
		//n3();
		Childvariable r=new Childvariable();
		//r.n1();
		r.n2();
		//r.n4();
		Parentvariable g=new Parentvariable();
		//g.n1();

	}    

}
