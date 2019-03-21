import java.util.Scanner;

public class Exercicio_13 {

	public static boolean isNumeric(String val){
		try {
			Float.parseFloat(val);
			return true; 
		} catch (NumberFormatException e){
			return false;
		}
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int qtdAmostras = 0;
		float tot = 0f, media = 0f;
		
		Boolean val = false;
		do {
			System.out.println("Quantidade de amostras: ");
			String aux = scan.next();
			if (isNumeric(aux)){
				qtdAmostras = Integer.parseInt(aux);	
				val = true;					
			}
		} while (val == false);	

		float amostras[] = new float[qtdAmostras];

		
		for (int cont = 0 ; cont < qtdAmostras ; cont++ ) {	
			val = false;		
			do {
				System.out.printf("\nInsira o valor da amostra %d: ", cont+1);
				String aux = scan.next();
				if (isNumeric(aux)){
					amostras[cont] = Float.parseFloat(aux);
					val = true;					
				}
			} while (val == false);	
			tot += amostras[cont];
		}

		media = (tot/qtdAmostras);

		for (int cont = 0 ; cont < qtdAmostras ; cont++ ) {	
			System.out.printf("| %d -> %.2f ", cont+1, amostras[cont]);
		}
	}
}