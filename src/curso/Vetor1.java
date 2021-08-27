package curso;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double total = soma / n;
		
		System.out.printf("A m�dia dos valores �: %.2f%n", total);
		
		
		sc.close();
	}

}
