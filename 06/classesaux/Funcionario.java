package classesaux;

public class Funcionario {
	private String nome;
	private String cpf;
	private float salario;

	public Funcionario(String nome, String cpf, float salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public float getSalario(){
		return salario;
	}

	public void setSalario(float salario){
		this.salario = salario;
	}

	public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Funcionario that = (Funcionario) other;
        return (this.nome.equals(that.nome)) && (this.cpf == that.cpf);
    }

}