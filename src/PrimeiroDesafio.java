
public class PrimeiroDesafio {
	
	public static void main(String[] args) {
		
		String produto1 = "Notbook";
		String produto2 = "Offide Not";
		
		int validade = 30;
		int codigo = 5290;
		char tipo = 'F';
		
		double preco1 = 2100.00;
		double preco2 = 340.50;
		double peso = 53.23457;
		
		System.out.println("Lista de Produtos: ");
		System.out.printf("O Pre�o do %s � de R$ %.2f %n" , produto1, preco1);
		
		System.out.printf("O Pre�o do %s � de R$ %.2f %n", produto2, preco2);
		
		System.out.printf("O C�digo do Produto � %d a validade � de %d anos e o tipo � %s ", codigo, validade, tipo);
		System.out.printf("O peso do produto � de %f Kg", peso);
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
	}

}
