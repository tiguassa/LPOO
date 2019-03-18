//	11. (Tarefa 3) Construa um programa que calcule o determinante de uma matriz 3 x 3
//	fornecida pelo usuário;

import java.util.Scanner;

public class Exercicio_11 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Float mat[][] = new Float[3][3];
		Float determinante = 0f;

		for(int y = 0 ; y < mat.length ; y++){
			for(int x = 0 ; x < mat[0].length ; x++){
				System.out.printf("\nInsira o calor referente a posição %d, %d da matriz: ", x, y);
				mat[y][x] = scan.nextFloat();
			}
		}

		for(int y = 0 ; y < mat.length ; y++){
			System.out.printf("\n");
			for(int x = 0 ; x < mat[0].length ; x++){
				System.out.printf("%.2f\t", mat[y][x]);
			}
		}

		determinante = 
		((mat[0][0] * mat[1][1] * mat[2][2]) + 
		(mat[0][1] * mat[1][2] * mat[2][0]) + 
		(mat[0][2] * mat[1][0] * mat[2][1])) -
		((mat[0][2] * mat[1][1] * mat[2][0]) +
		(mat[0][0] * mat[1][2] * mat[2][1]) +
		(mat[0][1] * mat[1][0] * mat[2][2]));

		System.out.printf("\nA determinante da matriz é %.2f.", determinante);
	}
}