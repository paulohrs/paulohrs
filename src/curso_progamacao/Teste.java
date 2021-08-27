package curso_progamacao;

public class Teste {
	
	public static void main(String[] args) {
		
		double salarioBruto = 7000;
		double impostos = 10;
		
		double imposto = salarioBruto * impostos / 100;
		
		double salarioLiquido = salarioBruto - imposto;
		
		System.out.println(imposto);
		System.out.println(salarioLiquido);
		
	}
	

}
