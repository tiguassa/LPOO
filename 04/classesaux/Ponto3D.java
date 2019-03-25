package classesaux;

public class Ponto3D {

	public Ponto3D(double x, double y, double z){
		setX(x);
		setY(y);
		setZ(z);
	}

	private double x, y, z;
	private String cor;
	private float intensidade;

	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return this.x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return this.y;
	}
	public void setZ(double z){
		this.z = z;
	}
	public double getZ(){
		return this.z;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return this.cor;
	}
	public void setIntensidade(float intensidade){
		this.intensidade = intensidade;
	}
	public float getIntensidade(){
		return this.intensidade;
	}

	public double calculaDistancia(Ponto3D  p){
		double px = p.getX(), py = p.getY(), pz = p.getZ();
		return Math.sqrt(Math.pow((px - getX()), 2) + Math.pow((py - getY()), 2) + Math.pow((pz - getZ()), 2));
	}
}