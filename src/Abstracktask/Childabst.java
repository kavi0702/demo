package Abstracktask;

public class Childabst extends Parentabst
{

	public static void main(String[] args) 
	{
		n2();
		 
		Parentabst b=new Childabst();
		b.n1();
		b.get();
		b.getcurrentnull();
		b.getTitle();
		b.Maximizewindow();
		b.close();

	}

	

	@Override
	public void get() 
	{
		System.out.println("http://www.facebook.com");
		
		
	}

	@Override
	public void getTitle() 
	{
		System.out.println("facebook -  log in or sign up");
		
		
	}



	@Override
	public void getcurrentnull()
	{
		System.out.println("http:www.facebook.com/");
		
	}



	@Override
	public void Maximizewindow() 
	{
		System.out.println("The application maximize window");
		
	}



	@Override
	public void close()
	{
		System.out.println("close the browser");
		
	}

}
