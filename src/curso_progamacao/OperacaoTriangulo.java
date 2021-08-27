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
			
			System.out.print("Entre com a medida do tri�ngulo xA: ");
			x.a = sc.nextDouble();
			
			System.out.print("Entre com a medida do tri�ngulo xB: ");
			x.b = sc.nextDouble();
			
			System.out.print("Entre com a medida do tri�ngulo xC: ");
			x.c = sc.nextDouble();
			
			System.out.print("Entre com a medida do tri�ngulo yA: ");
			y.a = sc.nextDouble();
			
			System.out.print("Entre com a medida do tri�ngulo yB: ");
			y.b = sc.nextDouble();
			
			System.out.print("Entre com a medida do tri�ngulo yC: ");
			y.c = sc.nextDouble();
			
			
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf( "A �rea do Tri�ngulo X �: %.4f%n ", areaX);
			
			System.out.printf( "A �rea do Tri�ngulo Y �: %.4f%n ", areaY);
			
			if (areaX > areaY) {
				System.out.println("A maior �rea : X");
			} else {
				System.out.println("A maior �rea � : Y");
			}
			
			sc.close();
	}

}
