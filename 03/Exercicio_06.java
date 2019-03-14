//		6. (Tarefa 3) Escreva um programa que leia do teclado 7 valores reais correspondentes ao
//		índice pluviométrico diário de uma semana. Após a leitura, o programa deve determinar o
//		índice pluviométrico médio, máximo e mínimo com o respectivo dia da ocorrência;

import java.util.Scanner;

public class Exercicio_06 {

	public static boolean isNumber(String input){
		try {
			Float.parseFloat(input);
			return true;
		} catch(Exception e){
			return false;
		}
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String input;
		int qtd = 0;
		float media = 0, val, tot = 0;
		float eixo[][] = new float[2][7];

		do {
			System.out.println("Insira um valor referente ao índice " + (qtd +1) + ": ");
			input = scan.nextLine();

			if(isNumber(input)){
				val = Float.parseFloat(input);
				eixo[1][qtd] = val;
				eixo[0][qtd] = qtd + 1;
				qtd++;

				
				
			} else {
				if(!input.equals("S"))
					System.out.println(input + " não é um número válido! Tente novamente.");
			}
		} while(qtd < 6);
		System.out.println("Deu boa, primeiro valor: " + eixo[0][1] + ".");
	}
}