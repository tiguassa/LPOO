import java.util.Scanner;

public class Exercicio_04 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		float km;
		float horas;
		System.out.println("===================== Calculo de velocidade média. =====================");
		System.out.println("Insira a distância percorrida em Km: ");
		km = scan.nextFloat();
		System.out.println("Insira o tempo decorrido em horas: ");
		horas = scan.nextFloat();
		System.out.printf("A velocidade média é %.2f Km/H.", (km/horas));
	}
}