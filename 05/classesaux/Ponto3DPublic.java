package classesaux;

public class Ponto3DPublic {

	public Ponto3DPublic(double x, double y, double z){
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

	public double calculaDistancia(Ponto3DPublic  p){
		double px = p.getX(), py = p.getY(), pz = p.getZ();
		
		/*
		return 
		(Math.sqrt(
			(Math.pow((px - this.getX()), 2))
			 + 
			(Math.pow((py - this.getY()), 2)) 
			 + 
			(Math.pow((pz - this.getZ()), 2))
			)
		);
		*/
		/*
		return 
		(Math.sqrt(
			(Math.pow((this.getX() - px), 2))
			 + 
			(Math.pow((this.getY() - py), 2)) 
			 + 
			(Math.pow((this.getZ() - pz), 2))
			)
		);
		*/
		//System.out.println(Math.sqrt(2));
		return 
		(Math.sqrt(
			((this.getX() - px) * (this.getX() - px))
			 + 
			((this.getY() - py) * (this.getY() - py)) 
			 + 
			((this.getZ() - pz) * (this.getZ() - pz))
			)
		);
	}
}