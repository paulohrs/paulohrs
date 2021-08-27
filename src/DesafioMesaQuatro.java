import java.util.Scanner;

public class DesafioMesaQuatro {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		
		int fator = 1;
		for(int i = 1; i <= n; i++) {
			fator = fator * i;
		}
		
		System.out.println(fator);
		
		sc.close();
	}

}
