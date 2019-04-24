import classesaux.Ponto3DProtected;
import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String args[]){
		String corAux = "";
		double x = 0, y = 0, z = 0;
		float intensidadeAux = 0f;
		Ponto3DProtected a = new Ponto3DProtected(x, y, z);
		Ponto3DProtected b = new Ponto3DProtected(x, y, z);
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Insira as coordenadas do ponto A.");
			System.out.println("x: ");
			x = scan.nextDouble();
			a.setX(x);
			System.out.println("y: ");
			y = scan.nextDouble();
			a.setY(y);			
			System.out.println("z: ");
			z = scan.nextDouble();
			a.setX(z);

			System.out.println("Insira as coordenadas do ponto B.");
			System.out.println("x: ");
			x = scan.nextDouble();
			b.setX(x);
			System.out.println("y: ");
			y = scan.nextDouble();
			b.setY(y);			
			System.out.println("z: ");
			z = scan.nextDouble();
			b.setX(z);
		} catch (Exception e){
			System.exit(1);
		}

		try {
			System.out.println("A distância entre os dois pontos: " + a.calculaDistancia(b));
		} catch (Exception e) {
			System.exit(-1);
		}
	}
}

/*
	- Executar com a classe Ponto3DPublic não alterou em nada a compilação e a execução do programa.
	- Executar com a classe Ponto3DProtected gerou erros de compilação nos trechos de código onde se tenta fazer
	o acesso aos respectivos métodos.
*/