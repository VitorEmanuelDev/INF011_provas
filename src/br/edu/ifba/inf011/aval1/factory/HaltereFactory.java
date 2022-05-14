package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Acessorios;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum;
import br.edu.ifba.inf011.aval1.equipamento.Halteres;

public class HaltereFactory  implements EquipamentoFactoryInterface{
	
	@Override
	public Equipamento getfactory(String identificador, int quantidade) {
		return new Halteres(identificador, quantidade);
	}

}
