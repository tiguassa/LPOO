//	12. (Tarefa 3) Escreva um programa que calcule a soma das diagonais principal e
//	secundária. O programa deve perguntar ao usuário a dimensão da matriz. Baseado na
//	dimensão da matriz o programa deve pedir ao usuário para preencher os valores da matriz
//	(faça um método estático que receba a referência de uma matriz e a preencha). Com a matriz
//	preenchida faça outro método estático que calcule a soma das diagonais. Imprima o
//	resultado.

import java.util.Scanner;

public class Exercicio_12 {

	public static void preencherMatriz( float matriz[][], Scanner scan ){
		for (int y = 0 ; y < matriz.length ; y++ ) {
			for ( int x = 0 ; x < matriz[0].length ; x++ ) {
				System.out.printf("\nInsira o valor referente a posição [%d][%d]: ", y, x);
				matriz[y][x] = scan.nextFloat();
			}
		}
	}

	public static void showFMatriz( float matriz[][]){
		for (int y = 0 ; y < matriz.length ; y++ ) {
			System.out.printf("\n");
			for (int x = 0 ; x < matriz[0].length ; x++){
				System.out.printf("[ %.2f ]   ", matriz[y][x]);
			}
		}
	}

	public static float somarFDiagonais( float matriz[][] ){
		float diagonalP = 0f;
		float diagonalS = 0f;

		for (int y = 0 ; y < matriz.length ; y++){
			for (int x = 0 ; x < matriz[0].length ; x++){
				if( x == y)
					diagonalP += matriz[y][x];
				if( (x + y) == (matriz.length - 1) )
					diagonalS += matriz[y][x];
			}
		}

		System.out.printf("\n\nA diagonal principal é igual à %.2f. ", diagonalP);
		System.out.printf("A diagonal secundária é igual à %.2f.\n", diagonalS);

		return (diagonalS + diagonalP);
	}

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int ordem = 0;

		System.out.println("Insira a ordem da matriz que deve ser calculada: ");
		
		try {
			ordem = scan.nextInt();
		} catch (Exception e){
			System.out.println("Ocorreu um erro!");
			System.exit(-1);
		}

		float matriz[][] = new float[ordem][ordem];
		preencherMatriz(matriz, scan);
		System.out.println("Matriz: ");
		showFMatriz(matriz);
		System.out.printf("\nA soma das duas diagonais resulta em %.2f.\n", somarFDiagonais(matriz));
	}
}


/*
	

*/