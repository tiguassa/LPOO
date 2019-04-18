import classesaux.Aluno;
import java.util.Scanner;
import java.util.Calendar;

//	SistemaAcademico
public class Exercicio_02 {

	public static Aluno[] alunos;
	public static int matricula, qtdEst;
	public static Boolean sucesso;

	// MAIN - START - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int qtdAlunos = 0, idadeAux, periodoAux;
		char op;
		String nomeAux, cursoAux, disciplinaAux;
		matricula = 0;
		qtdEst = 0;
		Aluno alunoAux;
		
		System.out.println("\n========== Sistema Academico ==========");

		while(qtdAlunos <= 0){
			System.out.printf("\nInsira a quantidade de alunos: ");
			qtdAlunos = scan.nextInt();
		}

		alunos = new Aluno[qtdAlunos];
		
		while(true){
			System.out.println("\n\tEntre com a opção desejada:");
			System.out.print("\n1 - Cadastrar Aluno\n2 - Excluir aluno por nome\n3 - Listar Alunos\n4 - Matricular Aluno em Disciplina\n5 - Cancelar Matricula\n6 - Imprimir lista Alunos e Disciplinas Matriculadas\n9 - Fim\nOpção: ");
			op = scan.next().charAt(0);			

			if(op == '9')
				break;
			switch (op) {
				case '1':
					sucesso = false;
					scan.nextLine();					
					if(alunos.length > 0){
						for(int cont = 0 ; cont < alunos.length ; cont++){
							if(alunos[cont] == null){

								System.out.print("\nInsira o nome do aluno: ");
								nomeAux = scan.nextLine();								
								scan.nextLine(); // Como resolver isso aqui?
								System.out.print("\nInsira a idade do aluno: ");
								idadeAux = Integer.parseInt(scan.nextLine());
								System.out.print("\nInsira o nome do curso: ");
								cursoAux = scan.next();
								scan.nextLine();
								System.out.print("\nInsira o periodo no curso: ");
								periodoAux = Integer.parseInt(scan.nextLine());								
								alunoAux = new Aluno(nomeAux, gerarMatricula(), cursoAux, periodoAux, idadeAux);
								
								cadastrarAluno(alunoAux);
								//System.out.println(alunos[0].imprime());
								break;
							}
						}	
						if(!sucesso)
							System.out.println(" - Todas as vagas já foram ocupadas.");
					} else {
						System.out.println(" - Não existem vagas disponíveis. Inicialize o programa novamente.");
					}
					break;
				case '2':
					sucesso = false;
					//scan.nextLine();					
					if(qtdEst > 0){
						System.out.print("\nInsira o nome do aluno: ");
						nomeAux = scan.next();								
						// scan.nextLine(); // Como resolver isso aqui?						
						excluirAlunoPorNome(nomeAux);								
						//break;
						/*
						for(int cont = 0 ; cont < alunos.length ; cont++){
							if(alunos[cont] == null){

								System.out.print("\nInsira o nome do aluno: ");
								nomeAux = scan.next();								
								// scan.nextLine(); // Como resolver isso aqui?								
								
								excluirAlunoPorNome(nomeAux);								
								break;
							}
						}	
						*/
						if(!sucesso)
							System.out.println(" - O nome inserido não foi encontrado.");
					} else {
						System.out.println(" - Ainda não existem alunos matriculados.");
					}
					break;
				case '3':
					Aluno[] alunosLista = listarAlunos();
					if(alunosLista != null){
						System.out.println("\nAlunos(" + qtdEst + "/" + qtdAlunos + ")");
						for(int cont = 0 ; cont < qtdEst ; cont++){
							System.out.println(alunosLista[cont].imprime());
						}
						//System.out.println("Listar Alunos:");						
					}
					break;
				case '4':
					if(qtdEst == 0){
						System.out.println(" - Ainda não existem alunos matriculados.");
					} else {
						System.out.print("\nInsira o nome do aluno: ");
						nomeAux = scan.next();
						scan.nextLine();
						System.out.print("\nInsira o nome da disciplina: ");
						disciplinaAux = scan.next();

						for(int cont = 0 ; cont < qtdEst ; cont++){
							if(alunos[cont] != null){
								if(alunos[cont].getNome().equals(nomeAux)){										
									if(alunos[cont].getDiscMat() == null){
										System.out.println("Quantas disciplinas o aluno pode cursar?");
										int qtdDisciplinasAux = scan.nextInt();
										alunos[cont].liberarDisciplinas(qtdDisciplinasAux);
									}
									System.out.println(matricularAlunoEmDisciplina(alunos[cont], disciplinaAux));	
								}				
							}
						}		

					}
					break;
				case '5':
					System.out.println("Cancelar Matricula:");
					break;
				case '6':
					System.out.println("Imprimir lista Alunos e Disciplinas Matriculadas:");
					break;
				case '8':
					System.out.println("\nVariaveis - - - - - ");
					System.out.println("matricula:" + matricula);
					System.out.println("qtdEst:" + qtdEst);					
					break;
				default:
					System.out.println(" - Opção inválida! Tente novamente.");
			}
		}		
	}
	// MAIN - END - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	
	public static void cadastrarAluno(Aluno aluno){
		if(alunos.length > 0){
			for(int cont = 0 ; cont < alunos.length ; cont++){
				if(alunos[cont] == null){
					alunos[cont] = aluno;
					System.out.println(" - O aluno " + aluno.getNome() + " foi matriculado.");	
					sucesso = true;
					qtdEst++;			
					return;
				}
			}			
		} else {
			System.out.println(" - Não existem vagas disponíveis. Inicialize o programa novamente.");
		}
	}

	public static void excluirAlunoPorNome(String nomeAluno){
		if(qtdEst == 0){
			System.out.println("Ainda não existem alunos matriculados.");
			return;
		} else {
			for(int cont = 0 ; cont < alunos.length ; cont++){
				if(alunos[cont] != null){
					if(alunos[cont].getNome().equals(nomeAluno)){
						alunos[cont] = null;
						for(int contA = cont ; contA < qtdEst ; contA++)
							alunos[contA] = alunos[contA + 1];
						alunos[qtdEst] = null;
					}
					System.out.println(" - Aluno excluido!");
					sucesso = true;	
					qtdEst--;			
					return;
				}					
			}
		}
	}
	
	public static Aluno[] listarAlunos(){
		if(qtdEst == 0){
			System.out.println(" - Ainda não existem alunos matriculados.");
			return null;
		}
		Aluno[] result = new Aluno[qtdEst];
		for(int cont = 0 ; cont < qtdEst ; cont++){
			result[cont] = alunos[cont];
		}
		return alunos;
	}

	public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina){		
		return aluno.fazMatricula(disciplina);
	}

	public static String gerarMatricula(){
		matricula++;
		return ("GRR" + String.valueOf(Calendar.getInstance().get(Calendar.YEAR)) + String.format("%04d", matricula));
		// https://stackoverflow.com/questions/275711/add-leading-zeroes-to-number-in-java
		// https://stackoverflow.com/questions/5071040/java-convert-integer-to-string/5071064
		// https://stackoverflow.com/questions/136419/get-integer-value-of-the-current-year-in-java
	}
}
