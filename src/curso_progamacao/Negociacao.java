package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;

public class Negociacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do Produto: ");
		String nome = sc.nextLine();
				
		System.out.print("Digite o pre�o do Produto: ");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		
		produto.setNome(" Computador");
		
		System.out.println(produto);
		System.out.println("Atualiza��o de Nome: " + produto.getNome());
		
		produto.setPreco(5300);
		System.out.println("Pre�o atualizado: " + produto.getPreco());
		
		System.out.println("Entre com o n�mero de produtos � adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println("Atualiza��o do estoque: " + produto);
		
		System.out.println("Entre com a quantidade retirada do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("Segunda atualiza��o de estoque: " + produto);
		
		sc.close();
	}

}
