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
		float eixo[] = new float[7];
		float minMax[][] = new float[2][2];
		String dSemana[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

		do {
			System.out.println("Insira um valor referente à " + dSemana[qtd] + ": ");
			input = scan.nextLine();

			if(isNumber(input)){
				val = Float.parseFloat(input);
				if(qtd == 0){
					minMax[0][0] = val;
					minMax[0][1] = qtd;
					minMax[1][0] = val;
					minMax[1][1] = qtd;
				}
				eixo[qtd] = val;
				qtd++;				
				if(val < minMax[0][0]){
					minMax[0][0] = val;
					minMax[0][1] = qtd;
				}
				if(val > minMax[1][0]){
					minMax[1][0] = val;
					minMax[1][1] = qtd;
				}
				tot += val;		
			} else {
				if(!input.equals("S"))
					System.out.println(input + " não é um número válido! Tente novamente.");
			}
		} while(qtd <= 6);

		System.out.println("Indice pluviométrico médio: " + tot/7);
		int aux;
		//System.out.println(minMax[1][0]);
		aux = Math.round( minMax[0][1] );
		System.out.println("Indice pluviométrico mínimo: " + minMax[0][0] + " - " + dSemana[aux]);
		aux = Math.round( minMax[1][1] ); 
		//System.out.println(aux);
		System.out.println("Indice pluviométrico máximo: " + minMax[1][0] + " - " + dSemana[aux-1]);
	}
}