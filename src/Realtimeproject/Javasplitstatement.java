package Realtimeproject;

public class Javasplitstatement {

	public static void main(String[] args) {
		String statement ="It is an automation testing";
		String[] words=statement.split(" ");
		for(String word: words) 
		{
			System.out.println(word+ " ");
		}
		

	}

}
