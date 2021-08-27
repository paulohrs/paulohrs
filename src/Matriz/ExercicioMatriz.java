package Matriz;

import java.util.Scanner;

public class ExercicioMatriz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite por favor digite o primeiro n�mero: ");
		int m = sc.nextInt();
		
		System.out.print("Digite por favor digite o segundo n�mero: ");
		int n = sc.nextInt();
		
		int [][] mat = new int [m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("A posi��o " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					
					if (i>0) {
						System.out.println("Superior: " + mat[i-1][j]);
					}
					
					if (j<mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					
					if (i<mat.length-1) {
						System.out.println("Inferior: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();
	}

}
