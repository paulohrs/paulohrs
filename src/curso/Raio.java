package curso;

import java.util.Scanner;

public class Raio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio da circunfer�ncia: ");
		double raio = sc.nextDouble();
		
		double c = ApoioRaio.circunferencia(raio);
		
		double v = ApoioRaio.volume(raio);
		
		System.out.printf("O raio da circunfer�ncia �: %.2f %n ", c);
		System.out.printf("O volume da circunfer�ncia �: %.2f %n", v);
		System.out.printf("O valor de PI �: %.2f %n", ApoioRaio.PI);
		
		
		sc.close();
	}

}
