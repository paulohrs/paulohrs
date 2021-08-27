import java.util.Scanner;

public class TerceitoTeste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int A = entrada.nextInt();
		
		System.out.print("Digite o valor B: ");
		int B = entrada.nextInt();
		
		System.out.print("Digite o valor C: ");
		int C = entrada.nextInt();
		
		System.out.print("Digite o valor D: ");
		int D = entrada.nextInt();
		
		int DIFERENCA = A*B-C*D;
		System.out.println(DIFERENCA);
		
		entrada.close();
	}

}
