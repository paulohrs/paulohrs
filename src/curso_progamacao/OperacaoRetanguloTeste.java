package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;


public class OperacaoRetanguloTeste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RetanguloTeste retangulo = new RetanguloTeste();
		
		System.out.print("Por favor digite a Altura do Ret�ngulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.print("Por favor digite a largura do Ret�ngulo: ");
		retangulo.largura = sc.nextDouble();
		
				
		System.out.println("A �rea do meu ret�ngulo �: " + retangulo.area());
		System.out.println("A �rea do meu ret�ngulo �: " + retangulo.perimetro());
		System.out.println("A �rea do meu ret�ngulo �: " + retangulo.diagonal());
		
		
		
		sc.close();
		
	}

}
