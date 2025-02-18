package funcoesCarro;

public class Carro {
	
	private boolean statusCarro = false;
	private String cambio = "N";
	private int velocidade = 0;
	
	
	public Carro(boolean statusCarro , String cambio, int velocidade) {
		this.statusCarro = statusCarro ;
		this.cambio = cambio ;
		this.velocidade =  velocidade ;		
	}
	
	
	public void ligarCarro() {
		
		
	}

	public boolean isStatusCarro() {
		return statusCarro;
	}

	public void setStatusCarro(boolean statusCarro) {
		this.statusCarro = statusCarro;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	// 	desligarCarro;
	//  acelerar;
	//  diminuirVelocidade;
	//  virar para esquerda/direita
	//  verificar velocidade;
	//  trocar a marcha
	

}
