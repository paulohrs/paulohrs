import java.util.Scanner;

public class QuartoTeste {
	
	public static void main(String[] args) {
		
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		//decimais.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor digite o n�mero de funcion�rios que voc� tem: ");
		double funcionarios = entrada.nextDouble();
		
		System.out.print("Digite o n�mero de horas que eles trabalharam: ");
		double horas = entrada.nextDouble();
		
		System.out.print("Digite o valor da hora de seus funcion�rio: ");
		double salario = entrada.nextDouble();
		
		System.out.println("O N�mero de Funcion�rios �: " + funcionarios);
		System.out.println("A Quantidade de Horas trabalhadas �: " + horas);
		System.out.printf("O valor que seus funcion�rios ganham �: %.2f %n",  salario);
		
		double totalHoras = funcionarios * horas;
		double valorDevido = totalHoras * salario;
		
		System.out.printf("O valor que voc� deve aos seus funcion�rios � R$ %.2f %n" ,  valorDevido);
		System.out.printf("Cada funcion�rio granha: R$ %.2f %n ", valorDevido / funcionarios);
		
		
		
		entrada.close();
				
	}

}
