package oopsconcept;

public class Childmethod extends Parentmethod
{
	public void v1()
	{
		System.out.println("child instace");
	}
	public void v4()
	{
		System.out.println("Java");
	}
	public static void v5()
	{
		System.out.println("child static method");
	}
	public static void v6()
	{
		System.out.println("Linux");
	}

	public static void main(String[] args) {
		v5();
		v6();
		v3();
		Parentmethod i=new Parentmethod();
		i.v1();
		i.v2();
		
		
		

	}

}
