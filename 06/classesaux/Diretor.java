package classesaux;

import java.util.ArrayList;

public class Diretor extends Funcionario {
	private ArrayList<Departamento> departamentos;

	public Diretor(String nome, String cpf, float salario){
		super(nome, cpf, salario);
		departamentos = new ArrayList<Departamento>();
	}

	public float getBonus(){
		return (4 * getSalario() + (300 * departamentos.size()));
	}
}