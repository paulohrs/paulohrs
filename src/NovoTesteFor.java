import java.util.Scanner;

public class NovoTesteFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		
		System.out.print("Digite um novo número: ");
		int y = sc.nextInt();
		
		int minimo, maximo;
		if ( x < y) {
			minimo = x;
			maximo = y;
		} else {
			minimo = y;
			maximo = x;
		}
		
		int soma = 0;
		for (int i = minimo + 1; i < maximo; i ++ ) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
			
			System.out.println(soma);
			sc.close();
		}
		
	}

}
