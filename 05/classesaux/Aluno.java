package classesaux;

import java.util.Arrays;

public class Aluno{
	
	private String nome;
	private String matricula;
	private String curso;
	private int periodo;
	private int idade;
	private String[] disciplinasMatriculadas;
	private String endereco;
	//	Constructor
	public Aluno(String nome, String matricula, String curso, int periodo, int idade, int qtdDisciplinas){
		setNome(nome);
		setMatricula(matricula);
		setCurso(curso);
		setPeriodo(periodo);
		setIdade(idade);
		this.disciplinasMatriculadas = new String[qtdDisciplinas];
		for(int cont = 0 ; cont < qtdDisciplinas ; cont++)
			disciplinasMatriculadas[cont] = "";
	}
	//	Setters & Getters
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getMatricula(){
		return matricula;
	} 
	public void setMatricula(String matricula){
		this.matricula = matricula;
	} 
	public String getCurso(){
		return curso;
	}
	public void setCurso(String curso){
		this.curso = curso;
	}
	public int getPeriodo(){
		return periodo;
	}
	public void setPeriodo(int periodo){
		this.periodo = periodo;
	}
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String[] getDiscMat(){
		return disciplinasMatriculadas;
	}
	public void setDiscMat(String... disciplinasMatriculadas){
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}

	public String fazMatricula(String disciplina){
		if(this.disciplinasMatriculadas.length == 0){
			return "Este aluno não pode  ser  matriculado  em  nenhuma  disciplina,  por  favor,  fale  com  a secretaria.";
		} else if(Arrays.asList(this.disciplinasMatriculadas).contains("")){				
			for(int cont = 0 ; cont < this.disciplinasMatriculadas.length ; cont++){					
				if (this.disciplinasMatriculadas[cont].equals("")){							
					this.disciplinasMatriculadas[cont] = disciplina;
					return "Matrícula na disciplina " + this.disciplinasMatriculadas[cont] + " executada.";
				}
			}	
		} else {
			return "Quantidade  de  disciplinas  excedida.  O  limite  de disciplinas  para  este  aluno  é  de " + this.disciplinasMatriculadas.length + " disciplina(s).  Se  desejar,  cancele a matrícula de uma das disciplinas e faça a nova matrícula·";
		}
		return "Alguma coisa de errada aconteceu!";
	}

	public String cancelarMatricula(String disciplina){
		
	}

	public String imprime(){
		String dados = "-----------------------------------------------------------------";
		dados += "\nNome do Aluno: " + getNome();
		dados += "\nMatricula: " + getMatricula();
		dados += "\nCurso: " + getCurso();
		dados += "\nPeriodo: " + getPeriodo();
		dados += "\nDisciplinas Matriculadas: ";		

		for(String s: this.disciplinasMatriculadas){
			if(!(s.equals("")))
				dados += (s + " - ");
		}

		dados += "\n-----------------------------------------------------------------";
		
		return dados;
	}
	
}