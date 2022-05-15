package br.edu.ifba.inf011.aval1.factory;

import br.edu.ifba.inf011.aval1.equipamento.Acessorios;
import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum;
import br.edu.ifba.inf011.aval1.equipamento.Halteres;
import br.edu.ifba.inf011.aval1.equipamento.Maquinas;
import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.ACESSORIOS;
import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.HALTERES;
import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.MAQUINAS;

import java.util.HashMap;

public class EquipamentoFactory {
	
	private HashMap<String, Acessorios> acessorios = new HashMap<>();
	private HashMap<String, Maquinas> maquinas = new HashMap<>();
	private HashMap<String, Halteres> halteres = new HashMap<>();
	
	AcessorioFactory acessoFactory = new AcessorioFactory();
	MaquinaFactory maquinaFactory = new MaquinaFactory();
	HaltereFactory halteresFactory = new HaltereFactory();

	public EquipamentoFactory() {
		
	}

	public Equipamento getConcreteFactory(EquipamentoEnum tipo, String identificador, int quantidade) {
		
		if(tipo.equals(ACESSORIOS)) {
			if(!acessorios.containsKey(identificador)){
				acessorios.put(identificador, (Acessorios) acessoFactory.getfactory(identificador, quantidade));
				return acessorios.get(identificador);
			}else {
				acessorios.get(identificador).adicionarEquipamento(quantidade);
				return acessorios.get(identificador);
			}
			
		}
		if(tipo.equals(MAQUINAS)) {
			if(!maquinas.containsKey(identificador)){
				maquinas.put(identificador, (Maquinas) maquinaFactory.getfactory(identificador, quantidade));
				return maquinas.get(identificador);
			}else {
				maquinas.get(identificador).adicionarEquipamento(quantidade);
				return maquinas.get(identificador);
			}
		}
		if(tipo.equals(HALTERES)) {
			if(!halteres.containsKey(identificador)){
				halteres.put(identificador, (Halteres) halteresFactory.getfactory(identificador, quantidade));
				return halteres.get(identificador);
			}else {
				halteres.get(identificador).adicionarEquipamento(quantidade);
				return halteres.get(identificador);
			}
		}
		return null;
		
	}

	public HashMap<String, Acessorios> getAcessorios() {
		return acessorios;
	}


	public HashMap<String, Maquinas> getMaquinas() {
		return maquinas;
	}


	public HashMap<String, Halteres> getHalteres() {
		return halteres;
	}


}