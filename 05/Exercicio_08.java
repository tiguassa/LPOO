import classesaux.Conversor;
import java.util.Scanner;

public class Exercicio_08 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double val = 0;
		char op;

		System.out.println("= = = = = = = Sistema para Conversões = = = = = = = ");
		while(true){
			System.out.println("\n\tEntre com a opção desejada:");
			System.out.println("1. Celsius -> Fahrenheit\n2. Celsius -> Kelvin");
			System.out.println("3. Fahrenheit -> Celsius\n4. Fahrenheit -> Kelvin");
			System.out.println("5. Kelvin -> Celsius\n6. Kelvin -> Fahrenheit");
			System.out.println("9. Sair");
			op = scan.next().charAt(0);
			if(op == '9')
				break;
			else {
				System.out.println("Insira o valor que deseja converter: ");
				val = scan.nextDouble();
			}
			switch (op) {
				case '1':
					System.out.println(val + "C = " + Conversor.c2f(val) + "F");
					break;
				case '2':
					System.out.println(val + "C = " + Conversor.c2k(val) + "K");
					break;
				case '3':
					System.out.println(val + "F = " + Conversor.f2c(val) + "C");
					break;
				case '4':
					System.out.println(val + "F = " + Conversor.f2k(val) + "K");
					break;
				case '5':
					System.out.println(val + "K = " + Conversor.k2c(val) + "C");
					break;
				case '6':
					System.out.println(val + "K = " + Conversor.k2f(val) + "F");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
	}
}