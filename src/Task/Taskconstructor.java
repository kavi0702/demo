package Task;

public class Taskconstructor {
	{

		System.out.println("Defalut constructor task");
	}
	public Taskconstructor()
	{
		this(60, 55.5f);
		System.out.println("Basket ball");
	}
	public Taskconstructor(int a, float b)
	{
		//this(300.0, 30, 4.5f);
		float c=a+b;
		System.out.println(c);
	}
	public Taskconstructor(String a)
	{
		//this(60, 67.5f);
		System.out.println(a);
	}
	public Taskconstructor(double a, int b, float c)
	{
		//this();
		double d=a*b*c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		new Taskconstructor();
		//new Taskconstructor(15, 55.5f);
		//new Taskconstructor("Kavitha");
		//new Taskconstructor(409.0, 54, 6.5f);
		
		

	}

}
