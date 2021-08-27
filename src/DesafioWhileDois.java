import java.util.Scanner;

public class DesafioWhileDois {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digiteo primeiro numero da coordenada: ");
		int x = sc.nextInt();
		
		System.out.println("Digiteo segundo numero da coordenada: ");
		int y = sc.nextInt();
		
		while ( x != 0 && y != 0) {
			
		 if( x > 0 && y > 0 ) {
			System.out.println("primeiro");
		} else if(x < 0 && y > 0 ) {
			System.out.println("segundo");
		} else if (x < 0 && y < 0 ) { 
			System.out.println("terceiro");
		} else {
			System.out.println("quarto");
		}
		x = sc.nextInt();
		y = sc.nextInt();
		
		}
		sc.close();
	
	}	
}
