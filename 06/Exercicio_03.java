import classesaux.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio_03 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		char op,  cargoAux	;
		String nomeAux = "", cpfAux = "";
		float salAux;
		
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
								nomeAux = "";
								scan.nextLine();
								System.out.print("\nNome: ");
								nomeAux = scan.nextLine();
								while(!SistemaRH.isNome(nomeAux)){
									System.out.print("\nInsira um nome valido: ");
									nomeAux = scan.nextLine();
								}
								System.out.println("Nome: " + nomeAux);
								cpfAux = "";
								//scan.nextLine();
								System.out.print("\nCPF(apenas numeros): ");
								cpfAux = scan.nextLine();
								while(!SistemaRH.isCPF(cpfAux)){
									System.out.print("\nInsira um CPF valido: ");
									cpfAux = scan.nextLine();
								}
								System.out.println("CPF: " + cpfAux);
								SistemaRH.imprimeCargos();
								
								cargoAux = scan.next().charAt(0);
								
								System.out.print("\nSalario: ");
								salAux = scan.nextFloat();
								Funcionario temp = SistemaRH.cadastrarFuncionario(cargoAux, nomeAux, cpfAux, salAux);
								if(temp != null){
									funcionarios.add(temp);									
								}
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
					System.out.println("asdf");
					SistemaRH.listarFuncionarios(funcionarios);
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