import java.util.Scanner;

public class whilePratica {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por Favor digite um n�mero qualquer: ");
		int x = entrada.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = entrada.nextInt();
		}
		
		System.out.println("A Soma dos n�meros �: " + soma);
		
		entrada.close();
		
	}

}
