package Realtimeproject;

public class ArrayBetweenValues {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60};
		if(array.length>=4) {
			for(int i=2;i<array.length-2;i++) {
				System.out.print(array[i]+" ");
			}
			
		
	
	}
		else {
		System.out.println("Array is too small  to have 'between' values.");
	}

 		
	}

}
