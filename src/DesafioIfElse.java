

import java.util.Scanner;

public class DesafioIfElse {
	
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um n�mero de 0 � 10: ");
	int numero = entrada.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("O Numero � par");
	} else {
		System.out.println("O Numero � Negativo");
	}
	
	  entrada.close();
	}
}
