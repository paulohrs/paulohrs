import java.util.Scanner;

public class Desafiotres {
	
	public static void main(String[] args) {
		
		int Alcool   = 0;
		int Gasolina = 0;
		int Diesel   = 0;
		
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite pelo número o tipo de gasolina: ");
		int combustivel = entrada.nextInt();
		
		while ( combustivel != 4 ) {
				if (combustivel == 1) {
						Alcool += 1 ;
				} else if (combustivel == 2) {
						Gasolina += 1;
				} else if (combustivel == 3) {
						Diesel += 1;
				}
			
				
			combustivel = entrada.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool " + Alcool);
		System.out.println("Gasolina " + Gasolina);
		System.out.println("Diesel " + Diesel);
		
		
		entrada.close();
	}
	
}
