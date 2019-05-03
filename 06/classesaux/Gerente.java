package classesaux;

import java.util.ArrayList;

public class Gerente extends Funcionario {
	private ArrayList<Funcionario> funcionarios;

	public Gerente(String nome, String cpf, float salario){
		super(nome, cpf, salario);
		funcionarios = new ArrayList<Funcionario>();
	}

	public float getBonus(){
		return (2f * getSalario() + (100f * funcionarios.size()));
	}
}