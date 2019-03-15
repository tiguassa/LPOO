//	9. (Tarefa 3) Faça um programa que leia uma frase e informe se ela é um palíndromo ou não.
//	Uma frase é um palíndromo quando pode ser lida tanto da forma usual, quanto de trás para
//	frente. O programa deve ignorar maiúsculas e minúsculas na avaliação. Insira as frases sem
//	acentuação;
//	Dica: será necessário verificar os métodos disponíveis na classe String;

import java.lang.String;
import java.util.Scanner;

public class Exercicio_09 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String frase, fraseRaw, esarf;

		System.out.println("Insira uma frase para verificar se trata-se de um palíndromo: ");
		frase = scan.nextLine();
		fraseRaw = frase.trim();
		fraseRaw = fraseRaw.toLowerCase();
		fraseRaw = fraseRaw.replaceAll("[, . ;]", "");

		//System.out.println(frase);
		//System.out.println(fraseRaw);

		esarf = new StringBuilder(fraseRaw).reverse().toString();

		if(fraseRaw.equals(esarf))
			System.out.println("É palíndromo.");
		else
			System.out.println("Não é palíndromo.");
	}
}