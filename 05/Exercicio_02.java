import classesaux.Aluno;
import java.util.Scanner;

//	SistemaAcademico
public class Exercicio_02 {

	Aluno[] alunos; // Atributo problematico

	public static void cadastrarAluno(Aluno aluno){
		if(alunos.length > 0) // É possível fazer essa verificação? Como eu acesso o array?
			System.out.println("Deu boa");
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int qtdAlunos = 0;
		char op;


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
								System.out.println("Cadastrar Aluno:");
								break;
							}
						}
						System.out.println("Não existem mais vagas disponíveis.");
						break;
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
}
