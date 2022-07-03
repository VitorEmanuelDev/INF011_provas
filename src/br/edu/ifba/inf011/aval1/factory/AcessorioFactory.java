package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Acessorio;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public class AcessorioFactory implements EquipamentoFactoryInterface{

	@Override
	public Equipamento getfactory(String identificador, int quantidade) {
		return new Acessorio(identificador, quantidade);
	}
}
