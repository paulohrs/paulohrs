import java.util.Scanner;

public class OperadoresBitwise {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ) {
			System.out.println("6th bit � verdadeiro! ");
		} else {
			System.out.println("6th bit � falso");
		}
		
		sc.close();
	}

}
