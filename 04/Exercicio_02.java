import classesaux.Pessoa;
import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String args[]){

		String nomeAux = "", endAux = "";
		int idadeAux = 0;
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa01 = new Pessoa(nomeAux, endAux, idadeAux);

		try{
			System.out.println("Qual o seu nome?");
			nomeAux = scan.nextLine();
			pessoa01.setNome(nomeAux);
			System.out.println("Qual o seu endereço?");
			endAux = scan.nextLine();
			pessoa01.setEndereco(endAux);
			System.out.println("Qual a sua idade?");
			idadeAux = scan.nextInt();			
			pessoa01.setIdade(idadeAux);
		} catch (Exception e){
			System.exit(1);
		}

		try {
			System.out.println("Olá, " + pessoa01.getNome() + "!");
			System.out.println("Endereco: " + pessoa01.getEndereco() + ".");
			System.out.println("Idade: " + pessoa01.getIdade() + ".");
		} catch (Exception e){
			System.exit(1);
		}
	}
}