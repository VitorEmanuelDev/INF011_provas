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
		Equipamento eqp = equipamentos.get(identificador);
		if (eqp == null) {
			if (tipo.equals(EquipamentoEnum.ACESSORIOS)) {
				eqp = acessoFactory.getfactory(identificador, quantidade);
			} else if (tipo.equals(EquipamentoEnum.MAQUINAS)) {
				eqp = maquinaFactory.getfactory(identificador, quantidade);
			} else if (tipo.equals(EquipamentoEnum.HALTERES)) {
				eqp = halterFactory.getfactory(identificador, quantidade);
			} else {
				throw new InstanceNotFoundException();
			}
			equipamentos.put(identificador, eqp);
		} else {
			eqp.atualizaQuantidade(quantidade);
		}

		return eqp;
	}

	public HashMap<String, Equipamento> getEquipamentos() {
		return equipamentos;
	}
}