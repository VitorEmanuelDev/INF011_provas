package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.Halter;

public class HalterFactory implements EquipamentoFactoryInterface{
	
	@Override
	public Equipamento getfactory(String identificador, int quantidade) {
		return new Halter(identificador, quantidade);
	}

}
