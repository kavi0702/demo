package Task;

public class Variables {
	public void f1()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		f3();
		Variables r= new Variables();
		//r.f3();
		//Variables.f3();
	}
	public void f2()
	{
		float a=10.5f;
		double b=300.0;
		double c=a/b;
		System.out.println(c);
		//f1();                 //instance----instance=direct
		
	}
	
	public static void f3()
	{
		double a=400.0;
		int b=5;
		double c=a*b;
		System.out.println(c);
		//f4();                   //static---static=direct
		Variables s=new Variables();
		//s.f2();                     //instance----static= object
	}
	public static void f4()
	{
		float a=8.5f;
		int b=25;
		double c=805.0;
		double d=a/b/c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		//f3();
		//f4();
		
		Variables j = new Variables();
		j.f1();
		//j.f2();
		
	

	}

}
