import java.util.Scanner;

public class DesafioMesaDois {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o n�mero de casos � avaliar: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite 1 n�meros com casa decimal: ");
			double a = sc.nextDouble();
			System.out.print("Digite 1 n�meros com casa decimal: ");
			double b = sc.nextDouble();
			System.out.print("Digite 1 n�meros com casa decimal: ");
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c*5.0) / 10.0;
			
			System.out.printf(" A m�dia �: %.1f%n", media);
		}
		
		sc.close();
	}

}
