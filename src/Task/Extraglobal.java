package Task;

public class Extraglobal {
	int a=1000;              //global variable
	double b=200.0;
	static String c="Kavitha";
	static float d=8.5f;
	
	public void n1()         //local variable
	{
		
		System.out.println(this.a); 
		System.out.println(this.b);
		System.out.println(Extraglobal.c);   //class name.variable name
		System.out.println(Extraglobal.d);
	}
	
	public void n2()     //instance variable
	{
		Extraglobal r= new Extraglobal();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(Extraglobal.c);
		System.out.println(Extraglobal.d);
		
	}
	
	public static void n3()     //static instance variable
	{
		Extraglobal s=new Extraglobal();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(Extraglobal.c);
		System.out.println(Extraglobal.d);
	}

	public static void main(String[] args) {
		n3();	
		Extraglobal b=new Extraglobal();
		b.n1();
		b.n2();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(Extraglobal.c);
		System.out.println(Extraglobal.d);
		
	}

}
