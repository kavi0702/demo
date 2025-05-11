package Task;

public class Constructoroverloading {
	
	public Constructoroverloading()
	{
		System.out.println("Good day");
	}
	public  float s1(int a, float b)
	{
		
		//this.s1(400.0, 50);
		float c=a+b;
		System.out.println("the value is="+c);
		Constructoroverloading.s1(23.5f, 300.0, 20);
		
		
		return c;
	}
	
	public double s1(double a, int b)
	{
		double c=a*b;
		System.out.println("the value is =" +c);
		//Constructoroverloading j=new Constructoroverloading();
	   // j.s1(55, 60.5f);
	
		return c;
		
	}
	
	public static String s1(String a )
	{
		System.out.println(a);
		//Constructoroverloading.s1(23.5f, 300.0, 20);
		return a;
		
	}
	
	public static  double s1(float a, double b, int c)
	{
		double d=a-b-c;
		System.out.println("the value is =" +d);
		//Constructoroverloading n=new Constructoroverloading();
		//n.s1(55,60.5f);
		return d;
		
		
	}

	public static void main(String[] args) {
		Constructoroverloading f=new Constructoroverloading();
		
		float g=f.s1(55, 60.5f);
		System.out.println(g);
		
		//double k=f.s1(400.0, 50);
		//System.out.println(k);
		
		
		//String h=Constructoroverloading.s1("Kavitha");
		//System.out.println(h);
		
		//double j=Constructoroverloading.s1(23.5f,300.0, 20);
		//System.out.println(j);
	
	
		
		
	

	}

}
