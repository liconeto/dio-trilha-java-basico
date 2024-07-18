package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DE ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DE ITENS");
	}
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGRADIENTES ");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}

}
