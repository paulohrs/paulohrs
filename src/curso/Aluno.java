package curso;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;


	public double totalDasNotas() {
		return nota1 + nota2 + nota3;
	}
	
	public double passouDeAno() {
		if (totalDasNotas() <= 60) {
			return 60 - totalDasNotas();
		} else {
			return 0;
		}
	}
}
