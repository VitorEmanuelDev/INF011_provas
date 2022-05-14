package br.edu.ifba.inf011.aval1;

import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.ACESSORIOS;
import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.HALTERES;
import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.MAQUINAS;

import br.edu.ifba.inf011.aval1.equipamento.Acessorios;
import br.edu.ifba.inf011.aval1.equipamento.Halteres;
import br.edu.ifba.inf011.aval1.equipamento.Maquinas;
import br.edu.ifba.inf011.aval1.factory.EquipamentoFactory;

public class Client {
	public static void main(String[] args) {

		Halteres halteres;
		Acessorios acessorios;
		Maquinas maquinas;
		EquipamentoFactory equipamento = new EquipamentoFactory();
		
		acessorios = (Acessorios) equipamento.getConcreteFactory(ACESSORIOS, "A123", 2);	
		acessorios.criarDescricao("descricao teste A123");
		System.out.println(acessorios.getEquipamento() + " " + acessorios.getDescricao() + " " + acessorios.getQuantidade());
		acessorios = (Acessorios) equipamento.getConcreteFactory(ACESSORIOS, "A123", 4);	
		System.out.println(acessorios.getEquipamento() + " " + acessorios.getDescricao() + " " + acessorios.getQuantidade());
		
		acessorios = (Acessorios) equipamento.getConcreteFactory(ACESSORIOS, "A987", 4);	
		acessorios.criarDescricao("descricao teste A987");
		System.out.println(acessorios.getEquipamento() + " " + acessorios.getDescricao() + " " + acessorios.getQuantidade());
		
		maquinas = (Maquinas) equipamento.getConcreteFactory(MAQUINAS, "B123", 2);	
		maquinas.criarDescricao("descricao teste B123");
		maquinas.determinarMarca("teste marca B123");
		System.out.println(maquinas.getEquipamento() + " " + maquinas.getDescricao() + " " + maquinas.getMarca() + " " + maquinas.getQuantidade());		
		maquinas = (Maquinas) equipamento.getConcreteFactory(MAQUINAS, "B123", 6);	
		System.out.println(maquinas.getEquipamento() + " " + maquinas.getDescricao() + " " + maquinas.getMarca() + " " + maquinas.getQuantidade());
		
		maquinas = (Maquinas) equipamento.getConcreteFactory(MAQUINAS, "B765", 3);	
		maquinas.criarDescricao("descricao teste B765");
		maquinas.determinarMarca("teste marca B765");
		System.out.println(maquinas.getEquipamento() + " " + maquinas.getDescricao() + " " + maquinas.getMarca() + " " + maquinas.getQuantidade());
		
		halteres =  (Halteres) equipamento.getConcreteFactory(HALTERES, "C123", 2);		
		halteres.determinarPeso(15);
		System.out.println(halteres.getEquipamento() + " C123 " + halteres.getPeso() + " " + halteres.getQuantidade());
		
		halteres =  (Halteres) equipamento.getConcreteFactory(HALTERES, "C123", 9);		
		System.out.println(halteres.getEquipamento() + " C123 " + halteres.getPeso() + " " + halteres.getQuantidade());
		
		halteres =  (Halteres) equipamento.getConcreteFactory(HALTERES, "C1456", 7);		
		halteres.determinarPeso(80);
		System.out.println(halteres.getEquipamento() + " C123 " + halteres.getPeso() + " " + halteres.getQuantidade());

	}
}
