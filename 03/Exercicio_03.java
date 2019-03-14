import java.util.Scanner;

public class Exercicio_03 {

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
		float val, tot = 0;

		for(int cont = 0 ; cont < 20 ; cont++){
			System.out.println("Insira um valor: ");
			input = scan.nextLine();

			if(isNumber(input)){
				val = Float.parseFloat(input);
				//System.out.println(val%2);
				if(val%2==0)
					tot += val;
			} else {
				System.out.println(input + " não é um número válido! Tente novamente. Restam " + ( 20 - cont ) + " tentativas.");
			}			
		}		
		System.out.println("Soma dos números pares: " + tot);
	}
}