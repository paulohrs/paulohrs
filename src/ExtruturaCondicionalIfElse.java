

import java.util.Scanner;

public class ExtruturaCondicionalIfElse {
	
	public static void main(String[] args) {
		
		int hora;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Que Horas São: ");
		hora = entrada.nextInt();
		
		if (hora <= 12) {
			System.out.println("Bom dia");
		}
		else if (hora > 12 && hora <= 18) {
			System.out.println("Boa Tarde");
		}
		else {
			System.out.println("Boa Noite");
		}
		
		entrada.close();
	}

}
