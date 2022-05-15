package br.edu.ifba.inf011.aval1;

import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.*;

import br.edu.ifba.inf011.aval1.exercicio.ExercicioEnum.*;
import br.edu.ifba.inf011.aval1.exercicio.GruposMuscularesEnum.*;

import br.edu.ifba.inf011.aval1.equipamento.*;
import br.edu.ifba.inf011.aval1.factory.EquipamentoFactory;
import br.edu.ifba.inf011.aval1.exercicio.*;



public class Client {
	
	static Halteres halteres;
	static Acessorios acessorios;
	static Maquinas maquinas;
	static EquipamentoFactory factory = new EquipamentoFactory();
	
	public static void main(String[] args) {
		questao01();
		questao02();

	}

	private static void questao01() {
		
		
		acessorios = (Acessorios) factory.getConcreteFactory(ACESSORIOS, "A123", 2);	
		acessorios.criarDescricao("descricao teste A123");
		System.out.println(acessorios.getEquipamento() + " " + acessorios.getDescricao() + " " + acessorios.getQuantidade());
		acessorios = (Acessorios) factory.getConcreteFactory(ACESSORIOS, "A123", 4);	
		System.out.println(acessorios.getEquipamento() + " " + acessorios.getDescricao() + " " + acessorios.getQuantidade());
		
		acessorios = (Acessorios) factory.getConcreteFactory(ACESSORIOS, "A987", 4);	
		acessorios.criarDescricao("descricao teste A987");
		System.out.println(acessorios.getEquipamento() + " " + acessorios.getDescricao() + " " + acessorios.getQuantidade());
		
		maquinas = (Maquinas) factory.getConcreteFactory(MAQUINAS, "B123", 2);	
		maquinas.criarDescricao("descricao teste B123");
		maquinas.determinarMarca("teste marca B123");
		System.out.println(maquinas.getEquipamento() + " " + maquinas.getDescricao() + " " + maquinas.getMarca() + " " + maquinas.getQuantidade());		
		maquinas = (Maquinas) factory.getConcreteFactory(MAQUINAS, "B123", 6);	
		System.out.println(maquinas.getEquipamento() + " " + maquinas.getDescricao() + " " + maquinas.getMarca() + " " + maquinas.getQuantidade());
		
		maquinas = (Maquinas) factory.getConcreteFactory(MAQUINAS, "B765", 3);	
		maquinas.criarDescricao("descricao teste B765");
		maquinas.determinarMarca("teste marca B765");
		System.out.println(maquinas.getEquipamento() + " " + maquinas.getDescricao() + " " + maquinas.getMarca() + " " + maquinas.getQuantidade());
		
		halteres =  (Halteres) factory.getConcreteFactory(HALTERES, "C123", 2);		
		halteres.determinarPeso(15);
		System.out.println(halteres.getEquipamento() + " C123 " + halteres.getPeso() + " " + halteres.getQuantidade());
		
		halteres =  (Halteres) factory.getConcreteFactory(HALTERES, "C123", 9);		
		System.out.println(halteres.getEquipamento() + " C123 " + halteres.getPeso() + " " + halteres.getQuantidade());
		
		halteres =  (Halteres) factory.getConcreteFactory(HALTERES, "C145", 7);		
		halteres.determinarPeso(80);
		System.out.println(halteres.getEquipamento() + " C145 " + halteres.getPeso() + " " + halteres.getQuantidade());
		
	}
	
	private static void questao02() {
		
		Exercicio metalGearSolid =  new Builder("Rotina Solid Snake", factory)
				.comEquipamento(ACESSORIOS, "A123")
				.comTipoExercicio(ExercicioEnum.RESISTENCIA)
				.comGruposMusculares("ABCD")
				.build();
		System.out.println(metalGearSolid.toString());

		
		Exercicio superMario =  new Builder("Rotina SUper Mario", factory)
				.comEquipamento(MAQUINAS, "B765")
				.comTipoExercicio(ExercicioEnum.FUNCIONAL)
				.comGruposMusculares("ABC")
				.build();
		System.out.println(superMario.toString());
		
		Exercicio sprinterCell =  new Builder("Rotina Tom Clancy", factory)
				.comEquipamento(HALTERES, "C145")
				.comTipoExercicio(ExercicioEnum.CARDIOVASCULAR)
				.comGruposMusculares("AB")
				.build();
		System.out.println(sprinterCell.toString());
	}
}
