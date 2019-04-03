package classesaux;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private int periodo;
	private int idade;
	private String[] disciplinasMatriculadas;
	private String endereco;

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
	
}