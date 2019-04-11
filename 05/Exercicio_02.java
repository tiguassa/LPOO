import classesaux.Aluno;
import java.util.Scanner;

//	SistemaAcademico
public class Exercicio_02 {


	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int qtdAlunos = 0;
		char op;

		System.out.println("\n========== Sistema Academico ==========");

		while(qtdAlunos <= 0){
			System.out.printf("\nInsira a quantidade de alunos: ");
			qtdAlunos = scan.nextInt();
		}

		Aluno[] alunos = new Aluno[qtdAlunos];
		alunos[0] = new Aluno("Leonardo Wrobel", "20163134", "TADS", 1, 27, 3);
		System.out.println(alunos[0].imprime());
		System.out.println(alunos[0].fazMatricula("LPOO"));
		System.out.println(alunos[0].fazMatricula("REDES"));
		System.out.println(alunos[0].fazMatricula("LPOO"));
		System.out.println(alunos[0].fazMatricula("REDES"));
		System.out.println(alunos[0].imprime());

		/*
		while(true){
			System.out.println("Entre com a opção desejada:");
			System.out.println("\n1 - Cadastramento\n2 - Saque\n3 - Depósito\n9 - Fim\nOpção: ");
			op = scan.nextLine();

			if(op == '9')
				break;
			switch (op) {
				case '1':
					System.out.println("Opção 1!");
					break;
				case '2':
					System.out.println("Opção 2!");
					break;
				case '3':
					System.out.println("Opção 3!");
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		}
		*/
	}
}
