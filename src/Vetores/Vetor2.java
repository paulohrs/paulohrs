package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de produtos a processar: ");
		int n = sc.nextInt();
		
		ProdutoVetor2[] vect = new ProdutoVetor2[n];
		
		for (int i=0; i<n; i++) {
			
			sc.nextLine();
			String nome = sc.nextLine();
			double valor = sc.nextDouble();
			
			vect[i] = new ProdutoVetor2(nome, valor);
		}
		
		double soma = 0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getValor();
		}
		
		double media = soma / vect.length;
		System.out.printf("A média dos produtos é: R$ %.2f %n ", media);
		
		sc.close();
	}
}
