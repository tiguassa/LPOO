package classesaux;

public class Analista extends Funcionario {

	public Analista(String nome, String cpf, float salario){
		super(nome, cpf, salario);		
	}

	public float getBonus(){
		return getSalario();
	}
}