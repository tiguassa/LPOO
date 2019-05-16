package classesaux;

import java.util.InputMismatchException;

public class SistemaRH {	

	public static void imprimeMenu(){
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.println("|                            RH - Menu                                |");
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.println("| Entre com a opção desejada:                                         |");
		System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - +");
		System.out.println("|                                                                     |");
		System.out.println("|      1 - Editar funcionarios                                        |");			
		System.out.println("|      2 - Editar departamentos                                       |");			
		System.out.println("|      3 - Listar Funcionarios                                        |");			
		System.out.println("|      4 - Listar departamentos                                       |");			
		System.out.println("|      5 - Imprimir relatorio                                         |");			
		System.out.println("|      9 - Fim                                                        |");			
		System.out.println("|                                                                     |");
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.print("        Opção: ");			
	}

	public static void imprimeMenuFuncionario(){
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.println("|                            RH - Menu [Funcionarios]                 |");
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.println("| Entre com a opção desejada:                                         |");
		System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - +");
		System.out.println("|                                                                     |");
		System.out.println("|      1 - Adicionar funcionario                                      |");			
		System.out.println("|      2 - Remover funcionario                                        |");			
		System.out.println("|      3 - Editar funcionario                                         |");			
		System.out.println("|      4 - Listar funcionarios                                        |");			
		System.out.println("|      9 - Voltar                                                     |");			
		System.out.println("|                                                                     |");
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.print("        Opção: ");		
	}

	public static void imprimeMenuDepartamento(){
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.println("|                          RH - Menu [Funcionarios]                   |");
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.println("| Entre com a opção desejada:                                         |");
		System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - +");
		System.out.println("|                                                                     |");
		System.out.println("|      1 - Adicionar departamento                                     |");			
		System.out.println("|      2 - Remover departamento                                       |");			
		System.out.println("|      3 - Editar departamento                                        |");			
		System.out.println("|      4 - Listar departamentos                                       |");			
		System.out.println("|      9 - Voltar                                                     |");			
		System.out.println("|                                                                     |");
		System.out.println("+ = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = +");
		System.out.print("        Opção: ");		
	}

	public static void imprimeCargos(){
		System.out.println("        Cargo:");			
		System.out.println("        1 - Analista");			
		System.out.println("        2 - Auxiliar de Limpeza");			
		System.out.println("        3 - Diretor");			
		System.out.println("        4 - Gerente");			
		System.out.println("        5 - Programador");			
	}

	
	public static Funcionario cadastrarFuncionario(char cargo, String nome, String cpf, float salario){
		Funcionario temp;
		switch(cargo){
			case '1':
				temp = new Analista(nome, cpf, salario);
				return temp;				
			case '2':
				temp = new AuxiliarDeLimpeza(nome, cpf, salario);
				return temp;				
			case '3':
				temp = new Diretor(nome, cpf, salario);
				return temp;				
			case '4':
				temp = new Gerente(nome, cpf, salario);
				return temp;			
			case '5':
				temp = new Programador(nome, cpf, salario);
				return temp;				
			default:
				System.out.println("Deu ruim!");
				return null;				
		}
	}
	
	public static void imprimeRelatorio(Funcionario[] listaFuncionarios){

	}

	// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
	public static boolean isNome(String nome){
		//String regex = "^[a-zA-Z]+$";	
		String regex = "^[\\p{L} .'-]+$"; // https://stackoverflow.com/questions/15805555/java-regex-to-validate-full-name-allow-only-spaces-and-letters
		if(!nome.matches(regex) || nome.length() < 3){
			return false;			
		} else {
			return true;
		}
	}

	public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
	    if (CPF.equals("00000000000") ||
	        CPF.equals("11111111111") ||
	        CPF.equals("22222222222") || CPF.equals("33333333333") ||
	        CPF.equals("44444444444") || CPF.equals("55555555555") ||
	        CPF.equals("66666666666") || CPF.equals("77777777777") ||
	        CPF.equals("88888888888") || CPF.equals("99999999999") ||
	        (CPF.length() != 11))
	        return(false);
	      
	    char dig10, dig11;
	    int sm, i, r, num, peso;
	      
	    // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
	    try {
	    // Calculo do 1o. Digito Verificador
	        sm = 0;
	        peso = 10;
	        for (i=0; i<9; i++) {              
	    // converte o i-esimo caractere do CPF em um numero:
	    // por exemplo, transforma o caractere '0' no inteiro 0         
	    // (48 eh a posicao de '0' na tabela ASCII)         
	        num = (int)(CPF.charAt(i) - 48); 
	        sm = sm + (num * peso);
	        peso = peso - 1;
	        }
	      
	        r = 11 - (sm % 11);
	        if ((r == 10) || (r == 11))
	            dig10 = '0';
	        else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
	      
	    // Calculo do 2o. Digito Verificador
	        sm = 0;
	        peso = 11;
	        for(i=0; i<10; i++) {
	        num = (int)(CPF.charAt(i) - 48);
	        sm = sm + (num * peso);
	        peso = peso - 1;
	        }
	      
	        r = 11 - (sm % 11);
	        if ((r == 10) || (r == 11))
	             dig11 = '0';
	        else dig11 = (char)(r + 48);
	      
	    // Verifica se os digitos calculados conferem com os digitos informados.
	        if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
	             return(true);
	        else return(false);
	    } catch (InputMismatchException erro) {
	        return(false);
	    }
	    // REF:
		// https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
	} 
}