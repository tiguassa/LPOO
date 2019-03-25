import classesaux.Ponto3D;
import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String args[]){
		String corAux = "";
		double x = 0, y = 0, z = 0;
		float intensidadeAux = 0f;
		Ponto3D a = new Ponto3D(x, y, z);
		Ponto3D b = new Ponto3D(x, y, z);
		Scanner scan = new Scanner(System.in);

		try{
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
	}
}