package Task;

public class Constructor 
{
	{
		
		System.out.println("Defalut");

	}
	public Constructor()
	{
		this(40,5.5f,345.0);
		//this(60, 50);
		System.out.println("Welcome Java");
	}
	
	public Constructor(int a, int b)
	{
		this("Kavitha");
		int c=a+b;
		System.out.println(c);
	}
	public Constructor(float a, double b)
	{
		this();
		double c=a/b;
		System.out.println(c);
	}
	public Constructor(double a, int b)
	{
		double c=a*b;
		System.out.println(c);
	}
	public Constructor(String a)
	{
		System.out.println(a);
	}
	public Constructor(int a, float b, double c)
	{
		//this(456.0, 45);
		double d=a-b-c;
		System.out.println(d);
	}
	
	
	
	public static void main(String[] args) {
		//new Constructor();
		//new Constructor(40, 80);
		//new Constructor(45.5f,407.0);
		//new Constructor(589.0, 54);
		//new Constructor("Kavitha");
		new Constructor(43, 6.5f, 607.0);


	}

}
