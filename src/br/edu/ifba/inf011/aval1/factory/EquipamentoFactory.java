package br.edu.ifba.inf011.aval1.factory;


import java.util.HashMap;

import javax.management.InstanceNotFoundException;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum;

public class EquipamentoFactory {

	private static EquipamentoFactory instancia;

	private HashMap<String, Equipamento> equipamentos;

	AcessorioFactory acessoFactory = new AcessorioFactory();
	MaquinaFactory maquinaFactory = new MaquinaFactory();
	HalterFactory halterFactory = new HalterFactory();

	public static EquipamentoFactory getInstance() {
		if (instancia == null) {
			instancia = new EquipamentoFactory();
		}
		return instancia;
	}

	private EquipamentoFactory() {
		this.equipamentos = new HashMap<>();
	}

	public Equipamento getConcreteFactory(EquipamentoEnum tipo, String identificador, int quantidade) throws InstanceNotFoundException {
		Equipamento equipamento = equipamentos.get(identificador);

		if (equipamento == null) {
			if (tipo.equals(EquipamentoEnum.ACESSORIOS)) {
				equipamento = acessoFactory.getfactory(identificador, quantidade);
			} else if (tipo.equals(EquipamentoEnum.MAQUINAS)) {
				equipamento = maquinaFactory.getfactory(identificador, quantidade);
			} else if (tipo.equals(EquipamentoEnum.HALTERES)) {
				equipamento = halterFactory.getfactory(identificador, quantidade);
			} else {
				throw new InstanceNotFoundException();
			}
			equipamentos.put(identificador, equipamento);
		} else {
			equipamento.atualizaQuantidade(quantidade);
		}

		return equipamento;
	}

	public HashMap<String, Equipamento> getEquipamentos() {
		return equipamentos;
	}
}