package Task;

public class Global {
	int a=100;
	float b=8.5f;
	static int c=200;
	static double d=500.0;
	
	public void w1()
	{
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Global.c);
		System.out.println(Global.d);
		
	}
	public void w2()
	{
		Global e=new Global();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(Global.c);
		System.out.println(Global.d);
		
	}
	
	public static void w3()
	{
		Global m=new Global();
		System.out.println(m.a);
		System.out.println(m.b);
		System.out.println(Global.c);
		System.out.println(Global.d);
	}

	public static void main(String[] args) {
	    w3();
		Global r=new Global();
		r.w1();
		r.w2();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(Global.c);
		System.out.println(Global.d);

	}

}
