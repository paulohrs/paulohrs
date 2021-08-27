package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;

public class OperacaoTriangulo {
	
	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			
			Scanner sc = new Scanner(System.in);
			
			Triangulo x, y;
			
			x = new Triangulo();
			y = new Triangulo();
			
			System.out.print("Entre com a medida do triângulo xA: ");
			x.a = sc.nextDouble();
			
			System.out.print("Entre com a medida do triângulo xB: ");
			x.b = sc.nextDouble();
			
			System.out.print("Entre com a medida do triângulo xC: ");
			x.c = sc.nextDouble();
			
			System.out.print("Entre com a medida do triângulo yA: ");
			y.a = sc.nextDouble();
			
			System.out.print("Entre com a medida do triângulo yB: ");
			y.b = sc.nextDouble();
			
			System.out.print("Entre com a medida do triângulo yC: ");
			y.c = sc.nextDouble();
			
			
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf( "A área do Triângulo X é: %.4f%n ", areaX);
			
			System.out.printf( "A área do Triângulo Y é: %.4f%n ", areaY);
			
			if (areaX > areaY) {
				System.out.println("A maior área : X");
			} else {
				System.out.println("A maior área é : Y");
			}
			
			sc.close();
	}

}
