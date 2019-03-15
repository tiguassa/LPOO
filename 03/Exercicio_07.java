//	7. (Tarefa 3) Escreva um programa com os seguintes passos: 1) Peça ao usuário que informe
//	quantos funcionários existem na empresa. 2) Instancie um array de strings e um array de
//	doubles com o tamanho informado. 3) Peça ao usuário que informe o nome e o salário de
//	cada funcionário e armazene o nome no array de strings e o salário no array de doubles. 4)
//	Calcule a média salarial da empresa. 5) Imprima a lista de nomes/salários que estão acima
//	da média salarial. Obs.: Faça o tratamento das entradas de dados. Se o usuário informar um
//	salário inválido, peça para ele informar novamente. Imprima os salários com duas casas
//	decimais. Os nomes devem conter ao menos 3 caracteres.

import java.util.Scanner;

public class Exercicio_07 {

	// ================================================ FUNÇÕES AUXILIARES - inicio
	public static boolean isNumber(String input){
		try {
			Float.parseFloat(input);
			return true;
		} catch(Exception e){
			return false;
		}
	}

	public static boolean isNameValid(String input){
		try {
			if(input.length() >= 3)
				return true;				
		} catch(Exception e){
			return false;
		}
		return false;
	}
	// ================================================ FUNÇÕES AUXILIARES - fim

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int qtdFunc;
		float tot = 0, media;

		System.out.println("Insira a quantidade de funcionários da empresa: ");
		qtdFunc = scan.nextInt();

		try {
			String nomeFunc[] = new String[qtdFunc];
			Float salFunc[] = new Float[qtdFunc];

			for(int cont = 0 ; cont < qtdFunc ; cont++){
				do {
					scan.nextLine();
					System.out.println("N - " + (cont + 1) + ". Insira o nome do funcionário: ");
					nomeFunc[cont] = scan.nextLine();
				} while (isNameValid(nomeFunc[cont]) == false);
				Boolean valSal = false;
				do {
					System.out.println("Insira o salário do funcionário: ");
					String aux = scan.next();
					if (isNumber(aux)){
						salFunc[cont] = Float.parseFloat(aux);	
						valSal = true;					
					}
				} while (valSal == false);				
			}

			System.out.println("\n====================================================\n");
			System.out.println("Quantidade de funcionários: " + qtdFunc);

			for ( int cont = 0 ; cont < qtdFunc ; cont++ ) {
				tot += salFunc[cont];
			}
			media = tot/qtdFunc;

			System.out.printf("\nMédia salarial: R$ %.2f\n\n", media);
			System.out.println("Funcionários com salário acima da média: \n");

			for ( int cont = 0 ; cont < qtdFunc ; cont++ ) {
				if (salFunc[cont] > media) {
					System.out.printf(" - %s - R$ %.2f\n - - - - - - - - - - - - - - - - - - - - - - - - - - \n", nomeFunc[cont], salFunc[cont]);
				}
			}			
			System.out.println("\n====================================================\n");

		} catch(Exception e){
			// ERRO
			System.exit(-1);
		}


	}
}