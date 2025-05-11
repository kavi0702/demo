package Task;

public class Taskconstructoroverloading {
	public Taskconstructoroverloading()
	{
		System.out.println("Java programming");
	}
	
	public int h1(int a, int b)
	{
		//this.h1(3.5f, 300.0);
		int c=a*b;
		System.out.println("The value is =" +c);
		Taskconstructoroverloading.h1(900.0, 56.5f, 40);
		return c;
	}
	public  double h1(float a, double b)
	{
	double c=a+b;
	
		System.out.println("The value is =" +c);
		return c;
	}
	public static String h1(String a)
	{
		System.out.println("The value is =" +a);
		return a;
	}
	public static double h1(double a, float b, int c)
	{
		double d=a*b-c;
		System.out.println("The value is =" +d);
		//Taskconstructoroverloading.h1("Kani");
		//Taskconstructoroverloading j= new Taskconstructoroverloading();
		//j.h1(60.5f, 200.0);
		return d;
	}

	public static void main(String[] args) {
		Taskconstructoroverloading g = new Taskconstructoroverloading();
		 int f=g.h1(50, 5);
		System.out.println(f);
		 
		 //double d=g.h1(55.5f, 10000.0);
		 //System.out.println(d);
		
		//String b=Taskconstructoroverloading.h1("Priya");
		//System.out.println(b);
		
		//double v=Taskconstructoroverloading.h1(3000.0, 4.5f, 390);
		//System.out.println(v);
		
		
		
		
	
	}

}
