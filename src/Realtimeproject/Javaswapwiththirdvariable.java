package Realtimeproject;

public class Javaswapwiththirdvariable {

	public static void main(String[] args) {
		int a=10;
		float b=8.5f;
		System.out.println("Before swapping:");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		float temp=a;
		a=(int)b;
		b=temp;
		System.out.println("\nAfter swapping:");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		

	}

}
