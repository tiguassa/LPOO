import java.util.Scanner;

public class Exercicio_11 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String cargo;
		float sal, bonus;
		int aux;

		System.out.println("========= Calculo de Bônus Anual =========");
		System.out.println("Insira seu cargo: ");
		cargo = scan.nextLine().toLowerCase();
		System.out.println("Insira seu salário: ");
		sal = scan.nextFloat();

		switch (cargo) {
			case "diretor":
				System.out.println("Insira a quantidade de departamentos gerenciados: ");
				aux = scan.nextInt();
				bonus = (sal * 4f) + (aux * 3000f);
				break;
			case "gerente":
				System.out.println("Insira a quantidade de funcionários gerenciados: ");
				aux = scan.nextInt();
				bonus = (sal * 2f) + (aux * 100f);
				break;
			case "analista":
				bonus = sal;
				break;
			case "programador":
				bonus = (sal * 0.8f);
				break;
			case "auxiliar de limpeza":
				bonus = (sal * 0.5f);
				break;
			default:
				System.out.println("Problemas na leitura do cargo.");
				bonus = 0;
				break;
		}

		if(bonus > 0)
			System.out.printf("Bônus anual: R$ %.2f.", bonus);
	}
}