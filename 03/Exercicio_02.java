import java.util.Scanner;

public class Exercicio_02 {

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

		do {
			System.out.println("Insira um valor: ");
			input = scan.nextLine();

			if(isNumber(input)){
				val = Float.parseFloat(input);
				qtd++;
				tot += val;
				media = tot/qtd;
				System.out.println("Total de elementos: " + qtd + ".\nValor total: " + tot);
				System.out.println("Média: " + media + ".");
			} else {
				if(!input.equals("S"))
					System.out.println(input + " não é um número válido! Tente novamente. [S] para sair.");
			}
		} while(!input.equals("S"));		
	}
}