package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		int n, indiceLinha, indiceColuna;
		double somaPositivos;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double [][] matriz = new double[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++){
				System.out.printf("Elemento [%d,%d]:", i, j);
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		somaPositivos = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (matriz[i][j] > 0) {
					somaPositivos = somaPositivos + matriz[i][j];
				}
			}
		}
	    
		System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n\n", somaPositivos);
		
		System.out.print("Escolha uma linha: ");
		indiceLinha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", matriz[indiceLinha][i]);
		}
		
		System.out.printf("\n\nEscolha uma coluna: ");
		indiceColuna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", matriz[i][indiceColuna]);
		}
		
		System.out.printf("\n\nDIAGONAL PRINCIPAL: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", matriz[i][i]);
		}
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);
				}
			}
		}
		
		System.out.println("\n\nMATRIZ ALTERADAS:");
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("%.1f ", matriz[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
