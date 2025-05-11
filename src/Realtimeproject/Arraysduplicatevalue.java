package Realtimeproject;


public class Arraysduplicatevalue {

	public static void main(String[] args) {
		char ch[]={'a','b','c','a','a','c','d','c','e','f','d','b','c','a','e','g','h'};
		for(int i=0;i<ch.length;i++)
			
		{
			for(int j=i+1;j<ch.length;j++)
		
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]);
				}
			
			}
		}
			
	
	
	}
		
}	
