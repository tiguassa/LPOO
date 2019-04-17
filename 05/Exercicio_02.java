import classesaux.Aluno;
import java.util.Scanner;
import java.util.Calendar;

//	SistemaAcademico
public class Exercicio_02 {

	public static Aluno[] alunos;
	public static int matricula;

	// MAIN - START - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int qtdAlunos = 0, idadeAux, periodoAux;
		char op;
		String nomeAux, cursoAux;
		matricula = 1;

		System.out.println(gerarMatricula());
		System.out.println("\n========== Sistema Academico ==========");

		while(qtdAlunos <= 0){
			System.out.printf("\nInsira a quantidade de alunos: ");
			qtdAlunos = scan.nextInt();
		}

		alunos = new Aluno[qtdAlunos];

		/*
		alunos[0] = new Aluno("Leonardo Wrobel", "20163134", "TADS", 1, 27, 3);
		System.out.println(alunos[0].imprime());
		System.out.println(alunos[0].fazMatricula("LPOO"));
		System.out.println(alunos[0].fazMatricula("REDES"));
		System.out.println(alunos[0].fazMatricula("LPOO"));
		System.out.println(alunos[0].fazMatricula("REDES"));
		System.out.println(alunos[0].imprime());
		System.out.println(alunos[0].cancelarMatricula("REDES"));
		System.out.println(alunos[0].imprime());
		*/
		
		while(true){
			System.out.println("\nEntre com a opção desejada:");
			System.out.println("\n1 - Cadastrar Aluno\n2 - Excluir aluno por nome\n3 - Listar Alunos\n4 - Matricular Aluno em Disciplina\n5 - Cancelar Matricula\n6 - Imprimir lista Alunos e Disciplinas Matriculadas\n9 - Fim\nOpção: ");
			op = scan.next().charAt(0);

			if(op == '9')
				break;
			switch (op) {
				case '1':
					System.out.println("Verificando...");
					if(alunos.length > 0){
						for(int cont = 0 ; cont < alunos.length ; cont++){
							if(alunos[cont] == null){
								System.out.println("Insira o nome do aluno: ");
								nomeAux = scan.nextLine();
								System.out.println("Insira a idade do aluno: ");
								idadeAux = scan.nextInt();
								System.out.println("Insira o nome do curso: ");
								cursoAux = scan.nextLine();
								System.out.println("Insira o periodo no curso: ");
								periodoAux = scan.nextInt();
								//alunos[cont] = new Aluno()
								System.out.println("Cadastrar Aluno:");
								break;
							}
						}
						System.out.println("Não existem mais vagas disponíveis.");
						break;
					} else {
						System.out.println("A quantidade de alunos não é válida.");
					}
					break;
				case '2':
					System.out.println("Excluir aluno por nome:");
					break;
				case '3':
					System.out.println("Listar Alunos:");
					break;
				case '4':
					System.out.println("Matricular Aluno em Disciplina:");
					break;
				case '5':
					System.out.println("Cancelar Matricula:");
					break;
				case '6':
					System.out.println("Imprimir lista Alunos e Disciplinas Matriculadas:");
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		}		
	}
	// MAIN - END - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	public static void cadastrarAluno(Aluno aluno){
		
	}

	public static String gerarMatricula(){
		return ("GRR" + String.valueOf(Calendar.getInstance().get(Calendar.YEAR)) + String.format("%04d", matricula));
		// https://stackoverflow.com/questions/275711/add-leading-zeroes-to-number-in-java
		// https://stackoverflow.com/questions/5071040/java-convert-integer-to-string/5071064
		// https://stackoverflow.com/questions/136419/get-integer-value-of-the-current-year-in-java
	}
}
