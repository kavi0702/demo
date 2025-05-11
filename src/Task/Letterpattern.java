package Task;

public class Letterpattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(char j='A';j<'A'+i;j++) {
				System.out.print(j + " ");
			}
			System.out.println( );
		}
		
		//EDCBA
		for(int i=5;i>=1;i--) {
			for(char j=(char)('A'+i-1);j>='A';j--) {
			
				System.out.print(j + " ");
			}
			System.out.println( );
		}
	}

}
