package curso;

public class Empregado {
	
	public String nome;
	public double salario;
	public double impostos;
	public double percentual;
	
	
	public double salarioLiquido() {
		return salario - (salario * impostos / 100);
	}
	
	public double aumentoSalarial() {
		return salarioLiquido() * percentual / 100;
	}
	
	public String toString() {
		return nome + " O Valor do Salário é R$" + String.format(" %.2f ", salarioLiquido());

	}
	
	
		

	
	

}
