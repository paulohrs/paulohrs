package Matriz;

import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				//System.out.print("Digite a Sequência de números " + (i + 1) + ": ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Minha Diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		int contagem = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j]<0) {
					contagem++;
				}
			}
		}
		
		System.out.println("Numeros negativos: " + contagem);
		sc.close();
	}

}
