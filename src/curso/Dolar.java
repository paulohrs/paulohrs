package curso;

import java.util.Locale;
import java.util.Scanner;

public class Dolar {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação atual do Dolar? ");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos Dolares vai comprar? ");
		double compra  = sc.nextDouble();
		
		double c = CurrencyConvertet.conversaoReal(dolar);
		double d = CurrencyConvertet.taxaDolar(dolar);
		double total = c * compra;
		
		System.out.printf("O Dolar está custando $ %.2f %n ", dolar);
		System.out.printf("O valor que você vai pagar no Dolar é R$ %.2f %n ", total);
		System.out.printf("O valor final com taxas é de: R$ %.2f %n ", d + total);
		System.out.printf("O valor da taxa é de: R$ %.2f %n ", d);
		
		
		
		
		sc.close();
	}

}
