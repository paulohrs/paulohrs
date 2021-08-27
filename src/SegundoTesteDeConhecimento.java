import java.util.Scanner;

public class SegundoTesteDeConhecimento {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double  ValorMetroQuadrado = 200.00;
		
		System.out.print("Por favor diga a largura do terreno: ");
		double largura = entrada.nextDouble();
		System.out.printf("A Largura do Terreno é  %.1f m² %n", largura);
		
		System.out.print("Por favor diga a Comprimento do terreno:");
		double comprimento = entrada.nextDouble();
		System.out.printf("O Comprimento do Terreno é de:  %.1f m²%n", comprimento);
		
		double MedidaTerreno = largura * comprimento;
		System.out.printf("O terreno tem:  %.2f m² %n ", MedidaTerreno);
		
		double valorDoTerreno = MedidaTerreno * ValorMetroQuadrado;
		System.out.printf("O preço de venda do Terreno é de R$ %.2f%n", valorDoTerreno);
		
		
		
		entrada.close();
		
	}

}
