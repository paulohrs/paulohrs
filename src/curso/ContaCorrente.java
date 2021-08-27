package curso;

import java.util.Locale;
import java.util.Scanner;

public class ContaCorrente {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o numero da conta do cliente: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite o nome do Titular da conta para cadastro: ");
		sc.nextLine();
		String titular = sc.nextLine();
				
		System.out.print("Voc� vai fazer um deposito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);	
		
		if (resposta == 'y') {
			System.out.print("Diga o valor a ser deposita: ");
			double depositoInicial = sc.nextDouble();
			
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Voc� quer fazer um dep�sito? Digite o valor: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Atualiza��o de dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Quer fazer um saque em conta? Digite o valor do saque: ");
		double saqueConta = sc.nextDouble();
		conta.saque(saqueConta);
		
		System.out.println("Atualiza��o de dados da conta: ");
		System.out.println(conta);
		
		sc.close();
	}

}
