package curso;

import java.util.Locale;
import java.util.Scanner;

public class Rh {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	Empregado emp = new Empregado();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o nome do funcion�rio: ");
	emp.nome = sc.nextLine();
	
	System.out.print("Digite o sal�rio do funcion�rio: ");
	emp.salario = sc.nextDouble();
	
	System.out.print("Digite a taxa de imposto a ser descontado: ");
	emp.impostos = sc.nextDouble();
	
	System.out.print("Digite o percentual de almento de Sal�rio: ");
	emp.percentual = sc.nextDouble();
	
	
	
	
	System.out.println(" O nome do funcon�rio �: " + emp);
	System.out.println("O Sal�rio depois do almento � de : R$" + (emp.salarioLiquido() + emp.aumentoSalarial()));
	
	
	
	sc.close();
	
	}

}
