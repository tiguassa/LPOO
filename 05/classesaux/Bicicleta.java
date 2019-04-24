package classaux;

public class Bicicleta {
	private int cadencia;
	private int velocidade;
	private int marcha;
	private int maxMarchas;

	public int getCadencia(){
		return cadencia;
	}

	public void setCadencia(int cadencia){
		this.cadencia = cadencia;
	}

	public int getVelocidade(){
		return velocidade;
	}

	public void setVelocidade(velocidade){
		this.velocidade = velocidade;
	}

	public int getMarcha(){
		return marcha;
	}

	public void setMarcha(int marcha){
		this.marcha = marcha;
	}

	public int getMaxMarcha(){
		return maxMarchas;
	}

	public void setMaxMarcha(int maxMarcha){
		this.maxMarcha = maxMarcha;
	}
}