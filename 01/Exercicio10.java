import java.lang.String;
import java.lang.Integer;

class Exercicio10 {
	public static void main(String args[]){
		String strA, strB;
		int intA, intB, intC;
		strA = args[0];
		strB = args[1];
		intA = Integer.parseInt(strA);
		intB = Integer.parseInt(strB);
		System.out.println(strA + strB);
		System.out.println(intA + intB);
	}
}