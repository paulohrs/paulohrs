package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;


public class OperacaoRetanguloTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RetanguloTeste retangulo = new RetanguloTeste();
		
		System.out.print("Por favor digite a Altura do Retângulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.print("Por favor digite a largura do Retângulo: ");
		retangulo.largura = sc.nextDouble();
		
				
		System.out.println("A área do meu retângulo é: " + retangulo.area());
		System.out.println("A área do meu retângulo é: " + retangulo.perimetro());
		System.out.println("A área do meu retângulo é: " + retangulo.diagonal());
		
		
		
		sc.close();
		
	}

}
