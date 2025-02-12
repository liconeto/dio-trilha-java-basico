package Interface.estabelecimento;

import Interface.Equipamentos.impressora.DeskJet;
import Interface.Equipamentos.impressora.Impressora;
import Interface.Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora = new EquipamentoMultifuncional();
		
		impressora.imprimir();
		
	}
}
