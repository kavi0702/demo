package Advancejavatopic;

public class Javaforeach {

	public static void main(String[] args) {
		String a[]= {"Project Manager", "Teamleader", "Manual tester", "Automation tester", "Developer"};
		for(String cc:a)
		{
			System.out.println(cc);
		}
		
		System.out.println("-------decrement---------");
		for(int i=a.length-1;i>=0;--i)
		{
			System.out.println(a[i]);
		}

	}

}
