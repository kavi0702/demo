package Task;

public class Taskvariable {
	int a=1000;
	static String b="Kavitha";
	
	public void g1()
	{
		System.out.println(this.a);    //local variable
		System.out.println(Taskvariable.b);
	}
	public void g2()
	{
		int a=10;
		float b=8.5f;
		float c=a*b;
		System.out.println(c);     //instance variable
		Taskvariable s=new Taskvariable();
		System.out.println(s.a);
		System.out.println(Taskvariable.b);
	}
	public static void g3()
	{
		double a=100.0;
		int b=25;
		double c=a/b;	
		
		System.out.println(c);
		Taskvariable f=new Taskvariable();
		System.out.println(f.a);
		System.out.println(Taskvariable.b);
	}
	public static void g4()
	{
		float a=2.5f;
		double b=3000.0;
		int c=5;
		double d=(a-b-c);
		System.out.println(d);
		Taskvariable g=new Taskvariable();
		System.out.println(g.a);
		System.out.println(Taskvariable.b);
	}
	public static void main(String[] args) {
		g3();
		g4();
		Taskvariable v=new Taskvariable();
		v.g1();
		v.g2();
		System.out.println(v.a);
		System.out.println(Taskvariable.b);

	}

}
