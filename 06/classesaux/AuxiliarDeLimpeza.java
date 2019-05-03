package classesaux;

public class AuxiliarDeLimpeza extends Funcionario {

	public AuxiliarDeLimpeza(String nome, String cpf, float salario){
		super(nome, cpf, salario);		
	}

	public float getBonus(){
		return (getSalario() * 0.5f);
	}
}