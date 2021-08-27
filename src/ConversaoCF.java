import java.util.Scanner;

public class ConversaoCF {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		
		do {
		System.out.print("Digite a temperatura em Celcuius: ");
		double c = sc.nextDouble();
		
		double f = 9.0 * c / 5.0 + 32.0;
				
		System.out.printf("A temperatura em Fahrenheit é: %.1f%n ",  f );
		
		System.out.printf("Deseja repetir a operação (s/n)? ");
		
		resp = sc.next().charAt(0);
		
		} while (resp != 'n');
		
		
		
		
		sc.close();
	}

}
