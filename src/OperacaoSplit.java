import java.util.Scanner;

public class OperacaoSplit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 1º números na sequência: ");
		int a = sc.nextInt();
		
		System.out.print("Digite 2º números na sequência: ");
		int b = sc.nextInt();
		
		System.out.print("Digite 3º números na sequência: ");
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
