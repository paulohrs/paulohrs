import java.util.Scanner;

public class OperadoresDeAtribuicaoCumulativa {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para ver o dia: ");
		int x = entrada.nextInt();
		
		String dia;
		
		if (x == 1) {
			dia = "Domingo";
		} else if(x == 2) {
			dia = "Segunda";
		} else if(x == 3) {
			dia = "Ter�a";
		} else if(x == 4) {
			dia = "Quarta";
		} else if(x == 5) {
			dia = "Quinta";
		} else if(x == 6) {
			dia = "Sexta";
		} else if(x == 7) {
			dia = "S�bado";
		} else {
			dia = "N�mero digitado Errado, escolha outro";
		}
		
		System.out.println("Hoje � " + dia);
		
		switch (x){
			case 1 :
			dia = "Domingo";	
			break;
			case 2 :
				dia = "Segunda";	
				break;
			case 3 :
				dia = "Ter�a";	
				break;
			case 4 :
				dia = "Quarta";	
				break;
			case 5 :
				dia = "Quinta";	
				break;
			case 6 :
				dia = "Sexta";	
				break;
			default:
				dia = "O Dia Digitado est� errado";	
				break;
		}
		
		System.out.println("O Dia da semana �: " + dia);
		
		entrada.close();
	}

}
