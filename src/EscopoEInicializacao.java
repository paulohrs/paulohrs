

public class EscopoEInicializacao {

	public static void main(String[] args) {
		
		double preco = 400.00;
		double desconto = 0;
		
		if (preco > 200.00) {
			desconto = preco * 0.1;
		}
		
		System.out.println("\n O preço do produto é " + preco + " \nO valor do desconto é de: R$ " + desconto + "\nE o preço final é: R$ " + (preco - desconto));
		
	}

}
