package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Acessorio;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum;

public interface EquipamentoFactoryInterface {
	
	Equipamento getfactory(String identificador, int quantidade);

}
