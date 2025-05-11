package Task;

public class Methodoverloading {
	public Methodoverloading()
	{
		System.out.println("Userdefine methodoverloading");
	}
	public void n1(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		Methodoverloading.n1("Kavitha");
		
	}
	public void n1(float a, double b)
	{
		double c=a*b;
		System.out.println(c);
		//Methodoverloading r=new Methodoverloading();
		//r.n1(50, 60);
	}
	public static void n1(double a, int b)
	{
		double c=a/b;
		System.out.println(c);
		//Methodoverloading.n1("Kavitha");
		//Methodoverloading t= new Methodoverloading();
		//t.n1(30.5f, 2000.0);
	} 
	public static void n1(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Methodoverloading b= new Methodoverloading();
		b.n1(50, 40);
		//b.n1(45.5f, 100.0);
		
		//Methodoverloading.n1(450.0, 100);
		//Methodoverloading.n1("Kavitha");
		

	}

}
