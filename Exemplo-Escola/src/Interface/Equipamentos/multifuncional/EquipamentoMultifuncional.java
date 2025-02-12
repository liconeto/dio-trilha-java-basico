package Interface.Equipamentos.multifuncional;

import Interface.Equipamentos.copiadora.Copiadora;
import Interface.Equipamentos.digitalizadora.Digitalizadora;
import Interface.Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional  implements Copiadora, Impressora, Digitalizadora{

	public void copiar() {
		System.out.println("COPIANDO");
	}
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
	}
	public void digitalizar() {
		System.out.println("DIGITALIZANDO");
	}
}
