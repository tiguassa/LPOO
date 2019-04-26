package classaux;

public class Bicicleta {
	private int cadencia;
	private int velocidade;
	private int marcha;
	private int maxMarchas;

	public Bicicleta(int maxMarchas){
		this.maxMarchas = maxMarchas;
		velocidade = 0;
		cadencia = 0;
	}

	public Bicicleta(){
		maxMarchas = 18;
		velocidade = 0;
		cadencia = 0;
	}

	public int getCadencia(){
		return cadencia;
	}

	public void setCadencia(int cadencia){
		this.cadencia = cadencia;
	}

	public int getVelocidade(){
		return velocidade;
	}

	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}

	public int getMarcha(){
		return marcha;
	}

	public void setMarcha(int marcha){
		if(marcha > maxMarchas || marcha < 1){
			System.out.println("Marcha inválida!");
		} else {
			this.marcha = marcha;
		}
	}

	public int getMaxMarchas(){
		return maxMarchas;
	}

	public void setMaxMarchas(int maxMarchas){
		if(maxMarchas < 1){
			System.out.println("Quantidade maxima de marchas é inválida!");
		} else {
			this.maxMarchas = maxMarchas;
		}
	}

	public void aumentarVelocidade(int incremento){
		velocidade += incremento;
	}

	public void acionarFreios(int decremento){
		if(decremento > velocidade){
			velocidade = 0;
		} else {
			velocidade -= decremento;
		}
	}

	public void printStates(){
		System.out.println("Cadencia: " + cadencia + ". Velocidade: " + velocidade + ". Marcha = " + marcha + ".");
	}
}