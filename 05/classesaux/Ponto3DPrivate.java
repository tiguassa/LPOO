package classesaux;

public class Ponto3DPrivate {

	public Ponto3DPrivate(double x, double y, double z){
		setX(x);
		setY(y);
		setZ(z);
	}

	private double x, y, z;
	private String cor;
	private float intensidade;

	private void setX(double x){
		this.x = x;
	}
	private double getX(){
		return this.x;
	}
	private void setY(double y){
		this.y = y;
	}
	private double getY(){
		return this.y;
	}
	private void setZ(double z){
		this.z = z;
	}
	private double getZ(){
		return this.z;
	}
	private void setCor(String cor){
		this.cor = cor;
	}
	private String getCor(){
		return this.cor;
	}
	private void setIntensidade(float intensidade){
		this.intensidade = intensidade;
	}
	private float getIntensidade(){
		return this.intensidade;
	}

	private double calculaDistancia(Ponto3DPrivate p){
		double px = p.getX(), py = p.getY(), pz = p.getZ();
		return Math.sqrt(Math.pow((px - getX()), 2) + Math.pow((py - getY()), 2) + Math.pow((pz - getZ()), 2));
	}
}