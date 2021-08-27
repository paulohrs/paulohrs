package curso;

import java.util.Scanner;

public class raio1 {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Imprima o raio da circunfer�ncia: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("O Raio da Circunfer�ncia �: %.2f %n", c);
		
		System.out.printf("O Volume da Circunfer�ncia �: %.2f %n", v);
		
		
		sc.close();
	}
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}

}
