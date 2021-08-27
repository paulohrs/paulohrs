import java.util.Scanner;

public class DesafioMesaTres {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de interações: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite um numero: ");
			int x = sc.nextInt();
			
			System.out.print("Digite um numero: ");
			int y = sc.nextInt();
			
			if ( y == 0 ) {
				System.out.println("Divisão Impossível! ");				
			} else {
					double div = (double) x / y;
					System.out.printf("%.1f%n", div);
			}
		}
		sc.close();
	}

}
