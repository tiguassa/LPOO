import java.util.Scanner;
import classesaux.Circunferencia;

public class Exercicio_09 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double raio = 0;
		Circunferencia circ = new Circunferencia(raio);

		System.out.println("Please, type a value for the circumference's radius: ");
		raio = scan.nextDouble();

		circ.setRaio(raio);

		System.out.printf("\nCircumference's area: %.3f.", circ.calcArea());
	}
}