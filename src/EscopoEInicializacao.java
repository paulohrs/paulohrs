

public class EscopoEInicializacao {

	public static void main(String[] args) {
		
		double preco = 400.00;
		double desconto = 0;
		
		if (preco > 200.00) {
			desconto = preco * 0.1;
		}
		
		System.out.println("\n O pre�o do produto � " + preco + " \nO valor do desconto � de: R$ " + desconto + "\nE o pre�o final �: R$ " + (preco - desconto));
		
	}

}
