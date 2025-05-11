package Realtimeproject;

//import java.util.ArrayList;

public class VowelArray{

	public static void main(String[] args) {
		String input = "it is a manual tester";
		char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
		char[] inputChars=input.toCharArray();
		System.out.println("Vowels in the given string:");
		for(char ch : inputChars) {
			for(char vowel:vowels) {
			if(ch == vowel){
				System.out.print(ch+" ");
				break;
			}
		}
		//input = input.toLowerCase();
		//ArrayList<Character>   vowels= new ArrayList<>();
		//for(char c:input.toCharArray()) {
			//if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				//vowels.add(c);
		//	}
		//}
			
		
		
		//System.out.println("Vowels in the input:" + vowels);

	}

}
}





