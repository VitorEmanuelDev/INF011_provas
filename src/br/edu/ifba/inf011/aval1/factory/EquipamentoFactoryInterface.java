package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public interface EquipamentoFactoryInterface {
	Equipamento getfactory(String identificador, int quantidade);
}
