package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pensao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante[] vect = new Estudante[10];
		
		System.out.print("Digite quantos quartos você precisa? ");
		int n = sc.nextInt();
		
		
		for (int i=0; i<=n; i++) {
			System.out.println();
			System.out.println("A locação " + i + ":");
			
			System.out.print("Digite o nome do Estudante: ");
			
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Digite o e-mail do estudante: ");
			String email = sc.nextLine();
			
			System.out.print("Digite o quarto escolhido: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Estudante(nome, email);
		}
		
		System.out.println();
		System.out.println("A lista de quartos: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();
	}

}
