package curso;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	private double taxa = 5;
	
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
		
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}


	public int getNumero() {
		return numero;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + taxa;
	}
	
	public String toString() {
		return " Dados do CLiente: " 
	+ " Número da Conta: " 
	+ numero 
	+ " Titular " 
	+ titular 
	+ " Saldo em Conta: " 
	+ String.format("%.2f ", saldo);
	}
	
}
