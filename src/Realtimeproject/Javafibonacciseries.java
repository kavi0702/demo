package Realtimeproject;

public class Javafibonacciseries {

	public static void main(String[] args) {
		//int num=21;
		int first=0;
		int second=1;
		 
		//while(first<=num)
		for(int i=1;i<=9; ++i)
		{
			System.out.println(first + "  ");
			int next=first+second;
			first=second;
			second=next;
		}  
		//
		//0+1=1
		//1+1=2
		//2+1=3
		
		
		
		

	}

}
