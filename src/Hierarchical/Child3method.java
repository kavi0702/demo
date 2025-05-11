package Hierarchical;

public class Child3method extends Parentmethod 
{
	public void e1()
	{
		System.out.println("Maldiv");
	}
	public void e9()
	{
		System.out.println("Iseland");
	}
	public static void e10()
	{
		System.out.println("Narvea");
	}

	public static void main(String[] args) 
	{
		e10();
		e3();
		Child2method.e7();
		Child2method.e8();
		Child1method.e4();
		Child1method.e5();
		
		Child3method d=new Child3method();
		d.e1();
		d.e9();
		d.e2();
		
		Child2method n=new Child2method();
		n.e1();
		n.e6();
		
		Child1method g=new Child1method();
		g.e1();
		
		Parentmethod h=new Parentmethod();
		h.e1();
	

	}

}
