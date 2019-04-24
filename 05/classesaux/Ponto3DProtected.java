package classesaux;

public class Ponto3DProtected {

	public Ponto3DProtected(double x, double y, double z){
		setX(x);
		setY(y);
		setZ(z);
	}

	private double x, y, z;
	private String cor;
	private float intensidade;

	protected void setX(double x){
		this.x = x;
	}
	protected double getX(){
		return this.x;
	}
	protected void setY(double y){
		this.y = y;
	}
	protected double getY(){
		return this.y;
	}
	protected void setZ(double z){
		this.z = z;
	}
	protected double getZ(){
		return this.z;
	}
	protected void setCor(String cor){
		this.cor = cor;
	}
	protected String getCor(){
		return this.cor;
	}
	protected void setIntensidade(float intensidade){
		this.intensidade = intensidade;
	}
	protected float getIntensidade(){
		return this.intensidade;
	}

	protected double calculaDistancia(Ponto3DProtected p){
		double px = p.getX(), py = p.getY(), pz = p.getZ();
		return Math.sqrt(Math.pow((px - getX()), 2) + Math.pow((py - getY()), 2) + Math.pow((pz - getZ()), 2));
	}
}