package iPhone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	public static void main(String[] args) {
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		
		System.out.println("Tocando musica" + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Abrindo URL");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova Apa");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagin");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: "+ numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Ligação!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz.");
		
	}

}
