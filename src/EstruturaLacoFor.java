import java.util.Scanner;

public class EstruturaLacoFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int n = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}

		System.out.println(soma);
		sc.close();

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);

			for (int e = 10; e >= 0; e--) {
				System.out.println("Valor de i: " + e);
			}
		}
	}
}
