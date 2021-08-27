import java.util.Scanner;

public class OperacaoSplit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 1� n�meros na sequ�ncia: ");
		int a = sc.nextInt();
		
		System.out.print("Digite 2� n�meros na sequ�ncia: ");
		int b = sc.nextInt();
		
		System.out.print("Digite 3� n�meros na sequ�ncia: ");
		int c = sc.nextInt();
		
	int higher = max(a, b, c);
	
	showResult(higher);
		
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
