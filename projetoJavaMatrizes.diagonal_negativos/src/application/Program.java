package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		int n, qtdNegativos;
		
		System.out.print("Qual a ordem da matriz?");
		n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elememto [%d,%d]: " , i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		
		qtdNegativos = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] < 0) {
					qtdNegativos++;
				}
			}
		}
		
		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtdNegativos);
	
		
		sc.close();

	}

}
