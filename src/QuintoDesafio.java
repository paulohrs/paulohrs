import java.util.Scanner;

public class QuintoDesafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a medida A: ");
		double A = entrada.nextDouble();
		
		System.out.print("Digite a medida A: ");
		double B = entrada.nextDouble();
		
		System.out.print("Digite a medida A: ");
		double C = entrada.nextDouble();
		
		double Triangulo = A * C / 2; // Largura x Altura / 2
		
		double Circulo = C * C * 3.14159; // Altura x Altura x PI 3.14159
		
		double Trapezio = (A + B) * C / 2;  // Base A + Base B x Altura C / 2
		
		double Quadrado = B * B; // Altura B x Largura B
		
		double retangulo = A * B; // Altura A x Largura B
		
		System.out.printf("A �rea do Tri�ngulo �: %.4f %n", Triangulo);
		System.out.printf("A �rea do C�rculo �: %.4f %n", Circulo);
		System.out.printf("A �rea do Trap�zio �: %.4f %n", Trapezio);
		System.out.printf("A �rea do Quadrado �: %.4f %n", Quadrado);
		System.out.printf("A �rea do Ret�ngulo �: %.4f %n", retangulo);
		
		
		
		entrada.close();
	}

}
