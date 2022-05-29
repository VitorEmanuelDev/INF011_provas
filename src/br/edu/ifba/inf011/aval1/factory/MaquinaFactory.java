package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.Maquina;

public class MaquinaFactory  implements EquipamentoFactoryInterface{

	@Override
	public Equipamento getfactory(String identificador, int quantidade) {
		return new Maquina(identificador, quantidade);
	}
}
