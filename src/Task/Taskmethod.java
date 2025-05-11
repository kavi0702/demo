package Task;

public class Taskmethod {
	public void f1()
	{
		System.out.println("Apple");
		f4();
	}
	public void f2()
	{
		System.out.println("Orange");
		f1();
	}
	public static void f3()
	{
		System.out.println("Banana");
		//f4();
		Taskmethod r= new Taskmethod();
	    r.f1();
	}
	public static void f4()
	{
		System.out.println("Papaya");
	}
	

	public static void main(String[] args) {
		//f3();
		//f4();
		Taskmethod h=new Taskmethod();
		h.f1();
		//h.f2();	

}
}
