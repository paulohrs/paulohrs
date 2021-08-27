package Vetores;

public class Empregado {

	private Integer id;
	private String nome;
	private double salario;

	public Empregado() {

	}

	public Empregado(Integer id, String nome, double salario) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	//public String toString() {
	//	return "Empregado [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	//}

	public void almentoDeSalario(double percentual) {
		salario += salario * percentual / 100;
	}
   public String toString() {
	   return "ID: " + id + " NOME: " + nome + " SALÁRIO: " + String.format(" R$ %.2f", salario);
   }
}