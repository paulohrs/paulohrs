package curso;

import java.util.Locale;
import java.util.Scanner;

public class Rh {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	Empregado emp = new Empregado();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o nome do funcionário: ");
	emp.nome = sc.nextLine();
	
	System.out.print("Digite o salário do funcionário: ");
	emp.salario = sc.nextDouble();
	
	System.out.print("Digite a taxa de imposto a ser descontado: ");
	emp.impostos = sc.nextDouble();
	
	System.out.print("Digite o percentual de almento de Salário: ");
	emp.percentual = sc.nextDouble();
	
	
	
	
	System.out.println(" O nome do funconário é: " + emp);
	System.out.println("O Salário depois do almento é de : R$" + (emp.salarioLiquido() + emp.aumentoSalarial()));
	
	
	
	sc.close();
	
	}

}
