package curso;

import java.util.Locale;
import java.util.Scanner;

public class Avaliacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Digite a primeira nota do Aluno: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota do Aluno: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota do Aluno: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("O aluno: " + aluno.nome + " Teve uma Nota total de: " + aluno.totalDasNotas() + " Sua média foi de: " + aluno.totalDasNotas()/3);
		
		if (aluno.totalDasNotas() < 60) {
			System.out.println("O Aluno: " + aluno.nome + " Não passou de ano");
			System.out.printf("Sua nota final foi: %.2f %n ", aluno.passouDeAno());
		} else {
			System.out.println("O Aluno Passou de ano");
		}
		
		sc.close();
	}

}
