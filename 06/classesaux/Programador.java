package classesaux;

public class Programador extends Funcionario {

	public Programador(String nome, String cpf, float salario){
		super(nome, cpf, salario);		
	}

	public float getBonus(){
		return (getSalario() * 0.8f);
	}
}