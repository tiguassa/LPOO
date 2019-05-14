import classesaux.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio_03 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios;

		char op;
		
		while(true){
			SistemaRH.imprimeMenu();
			op = scan.next().charAt(0);
			if(op == '9')
				break;
			switch(op){
				case '1':
					while(true){
						SistemaRH.imprimeMenuFuncionario();
						op = scan.next().charAt(0);
						if(op == '9')
							break;
						switch(op){
							case '1':
								
								break;
							case '2':

								break;
							case '3':

								break;
							case '4':

								break;
							default:
								System.out.println("        # Opcao invalida!");
								break;
						}
					}
					break;
				case '2':

					break;
				case '3':

					break;
				case '4':

					break;
				case '5':

					break;
				default:
					System.out.println("        # Opcao invalida!");
					break;
			}
		}
	}
}