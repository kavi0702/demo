package Task;

public class Newmethods {
	
	public void s1()    //instance method
	{
		System.out.println("Newyark");
	
		
		
	}
	 public void s2()    //instance--instance= direct calling
	 {
		 System.out.println("America");  
		 //s1();
		s4();   //static---instance=direct
		Newmethods.s4();    //class name called.method name
		Newmethods u = new Newmethods(); 
		u.s4(); 
	 }
	
	 public static void s3()   //static method
	 {
		 System.out.println("France");
	 }
	 public static void s4()     //static---static= direct calling
	 {
		 System.out.println("spain");
		// s3();
		 
		 Newmethods j = new Newmethods();   //static--instance = object created
		// j.s1();
		 
		 
	 }

	public static void main(String[] args) 
	{
		//s3();
		//s4();
		
		Newmethods k = new Newmethods();
		//k.s1();
		k.s2();
		

	}

}
