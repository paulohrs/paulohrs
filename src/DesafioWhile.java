import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = entrada.nextInt();
		
		
		while (senha != 2002) {
			
			System.out.println("\nSenha Invladia");
			senha = entrada.nextInt();
				
		}
		
		System.out.println("Acesso Permitido");
			entrada.close();
		
		
	}

}
