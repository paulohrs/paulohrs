package Vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SalarioList {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Por favor digite o n�mero de funcin�rios: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Funcion�rio: " + (i + 1) + ":");
			
			System.out.print("Digite o nome do ID do funcion�rio: ");
			Integer id = sc.nextInt();
			
			System.out.print("Digite o nome do Funcion�rio: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Digite o sal�rio do funcion�rio: ");
			double salario = sc.nextDouble();
			
			Empregado emp = new Empregado(id, nome, salario);	
			
			list.add(emp);
		}
		System.out.println();
		System.out.print("Entre com o ID do funcion�rio promovido: ");
		int idPromo = sc.nextInt();
		
		Integer pos = posicao(list, idPromo);
		if (pos == null) {
			System.out.println("Este ID n�o existe!");
		} else {
			System.out.print("Qual o percentual de aumento do funcion�rio? ");
			double percentual = sc.nextDouble();
			
			list.get(pos).almentoDeSalario(percentual);
		}
		
		System.out.println();
		System.out.println("Lista do funcion�rio: ");
		for (Empregado emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

	public static Integer posicao(List<Empregado> list, int id) { 
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
