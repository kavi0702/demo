package Task;

public class Extramethod {
	public void w1()
	{
		System.out.println("Bus");
		//w3();
	}
	public void w2()
	{
		System.out.println("Train");
	}
	public void w3()
	{
		System.out.println("Car");
		w5();
		Extramethod e=new Extramethod();
		e.w5();
		Extramethod.w5();
	}
	public static void w4()
	{
		System.out.println("Bike");
		Extramethod b= new Extramethod();
		b.w1();
	}
	public static void w5()
	{
		System.out.println("Flight");
	}
	public static void w6()
	{
		System.out.println("Boat");
		//w5();
	}

	public static void main(String[] args) {
		//w4();
		//w5();
		//w6();
		
		Extramethod n=new Extramethod();
		//n.w1();
		//n.w2();
		n.w3();
		

	}

}
