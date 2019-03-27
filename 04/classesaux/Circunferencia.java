package classesaux;

public class Circunferencia {
	private double raio;

	public Circunferencia(double raio){
		setRaio(raio);
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio(){
		return raio;
	}

	public double calcArea(){
		return (Math.PI * Math.pow(getRaio(), 2));
	}
}