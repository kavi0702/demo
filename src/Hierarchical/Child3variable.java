package Hierarchical;

public class Child3variable extends Parentvariable

{
	float a=5.5f;
	int b=20;
	static String c="Vadivel";
	static double d=400.0;
	
	public void d1()
	{
		System.out.println("----child3----");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Child3variable.c);
		System.out.println(Child3variable.d);
		
		System.out.println("------parent------");
		System.out.println(super.a);
		System.out.println(Parentvariable.b);
		
		
		System.out.println("----child2-----");
		Child2variable t=new Child2variable();
		System.out.println(t.a);
		System.out.println(Child2variable.b);
		
		
		System.out.println("-----child1----");
		Child1variable e=new Child1variable();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(Child1variable.c);
	}
	
	public void d7()
	{
		float a=7.5f;
		int b=30;
		float c=a-b;
		System.out.println(c);
		
	}
	
	public static void d8()
	{
		double a=200.0;
		int b=5;
		double c=a*b;
		System.out.println(c);
		
	}
	
	

	public static void main(String[] args) 
	{
		
		//d8();
		//d2();
		//Child2variable.d5();
		//Child2variable.d6();
		//Child1variable.d4();
		
		Child3variable y=new Child3variable();
		y.d1();
		
		Parentvariable g=new Parentvariable();
		g.d1();
		
		Child2variable u=new Child2variable();
		u.d1();
		
		Child1variable v=new Child1variable();
		v.d1();
		v.d3();
		
		
	

	}

}
