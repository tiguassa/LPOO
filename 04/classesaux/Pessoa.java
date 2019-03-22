package classesaux;

public class Pessoa{
	
	public Pessoa(String nome, String endereco, int idade) {
		setNome(nome);
		setEndereco(endereco);
		setIdade(idade);
	}

	private String nome;
	private String endereco;
	private int idade;

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getNome(){
		return this.nome;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public int getIdade(){
		return this.idade;
	}

	public void fazAniversario(){
		System.out.println("Feliz aniversário, " + getNome() + "!");
		this.idade++;
	}

	public void imprime(){
		System.out.printf("\nNome: %s\nEndereco: %s.\nIdade: %d\n", getNome(), getEndereco(), getIdade());
	}
}