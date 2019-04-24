package classaux;

public class Bicicleta {
	private int cadencia;
	private int velocidade;
	private int marcha;
	private int maxMarchas;

	public Bicicleta(int maxMarchas){
		setMaxMarchas(maxMarchas);
		setVelocidade(0);
		setCadencia(0);
	}

	public Bicicleta(){
		setMaxMarchas(18);
		setVelocidade(0);
		setCadencia(0);
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
		this.maxMarchas = maxMarchas;
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