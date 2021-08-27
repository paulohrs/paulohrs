import java.util.Scanner;

public class QuartoTeste {
	
	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor digite o número de funcionários que você tem: ");
		double funcionarios = entrada.nextDouble();
		
		System.out.print("Digite o número de horas que eles trabalharam: ");
		double horas = entrada.nextDouble();
		
		System.out.print("Digite o valor da hora de seus funcionário: ");
		double salario = entrada.nextDouble();
		
		System.out.println("O Número de Funcionários é: " + funcionarios);
		System.out.println("A Quantidade de Horas trabalhadas é: " + horas);
		System.out.printf("O valor que seus funcionários ganham é: %.2f %n",  salario);
		
		double totalHoras = funcionarios * horas;
		double valorDevido = totalHoras * salario;
		
		System.out.printf("O valor que você deve aos seus funcionários é R$ %.2f %n" ,  valorDevido);
		System.out.printf("Cada funcionário granha: R$ %.2f %n ", valorDevido / funcionarios);
		
		
		
		entrada.close();
				
	}

}
