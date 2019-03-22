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

	public setNome(String nome){
		this.nome = nome;
	}
	public setEndereco(String endereco){
		this.endereco = endereco;
	}
	public setIdade(int idade){
		this.idade = idade;
	}
	public getNome(){
		return this.nome;
	}
	public getEndereco(){
		return this.endereco;
	}
	public getIdade(){
		return this.idade;
	}
}