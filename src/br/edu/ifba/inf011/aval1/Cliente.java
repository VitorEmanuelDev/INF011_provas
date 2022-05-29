package br.edu.ifba.inf011.aval1;

import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.*;

import javax.management.InstanceNotFoundException;

import br.edu.ifba.inf011.aval1.equipamento.*;
import br.edu.ifba.inf011.aval1.factory.EquipamentoFactory;
import br.edu.ifba.inf011.aval1.exercicio.*;

public class Cliente {

	static EquipamentoFactory factory = EquipamentoFactory.getInstance();

	public static void main(String[] args) throws InstanceNotFoundException {
		// questão 1
		Acessorio acessorio1 = (Acessorio) factory.getConcreteFactory(ACESSORIOS, "A123", 2);	
		acessorio1.setDescricao("descricao teste A123");
		System.out.println(acessorio1.getEquipamento() + " " + acessorio1.getDescricao() + " " + acessorio1.getQuantidade());

		Acessorio acessorio2 = (Acessorio) factory.getConcreteFactory(ACESSORIOS, "A123", 4);	
		System.out.println(acessorio2.getEquipamento() + " " + acessorio2.getDescricao() + " " + acessorio2.getQuantidade());

		Acessorio acessorio3 = (Acessorio) factory.getConcreteFactory(ACESSORIOS, "A987", 4);	
		acessorio3.setDescricao("descricao teste A987");
		System.out.println(acessorio3.getEquipamento() + " " + acessorio3.getDescricao() + " " + acessorio3.getQuantidade());

		Maquina maquina1 = (Maquina) factory.getConcreteFactory(MAQUINAS, "B123", 2);	
		maquina1.setDescricao("descricao teste B123");
		maquina1.setMarca("teste marca B123");
		System.out.println(maquina1.getEquipamento() + " " + maquina1.getDescricao() + " " + maquina1.getMarca() + " " + maquina1.getQuantidade());

		Maquina maquina2 = (Maquina) factory.getConcreteFactory(MAQUINAS, "B123", 6);	
		System.out.println(maquina2.getEquipamento() + " " + maquina2.getDescricao() + " " + maquina2.getMarca() + " " + maquina2.getQuantidade());

		Maquina maquina3 = (Maquina) factory.getConcreteFactory(MAQUINAS, "B765", 3);	
		maquina3.setDescricao("descricao teste B765");
		maquina3.setMarca("teste marca B765");
		System.out.println(maquina3.getEquipamento() + " " + maquina3.getDescricao() + " " + maquina3.getMarca() + " " + maquina3.getQuantidade());

		Halter halter1 = (Halter) factory.getConcreteFactory(HALTERES, "C123", 2);		
		halter1.setPeso(15);
		System.out.println(halter1.getEquipamento() + " " + halter1.getIdentificador() + " " + halter1.getPeso() + " " + halter1.getQuantidade());

		Halter halter2 = (Halter) factory.getConcreteFactory(HALTERES, "C123", 9);		
		System.out.println(halter2.getEquipamento() + " " + halter2.getIdentificador() + " " + halter2.getPeso() + " " + halter2.getQuantidade());

		Halter halter3 = (Halter) factory.getConcreteFactory(HALTERES, "C145", 7);		
		halter3.setPeso(80);
		System.out.println(halter3.getEquipamento() + " " + halter3.getIdentificador() + " " + halter3.getPeso() + " " + halter3.getQuantidade());

		// questão 2
		Exercicio metalGearSolid = new Builder("Rotina Solid Snake")
				.comEquipamento(acessorio1)
				.comEquipamento(maquina1)
				.comEquipamento(halter1)
				.comTipoExercicio(ExercicioEnum.RESISTENCIA)
				.comGruposMusculares(GruposMuscularesEnum.A)
				.comGruposMusculares(GruposMuscularesEnum.B)
				.comGruposMusculares(GruposMuscularesEnum.C)
				.comGruposMusculares(GruposMuscularesEnum.D)
				.comGruposMusculares(GruposMuscularesEnum.E)
				.build();
		System.out.println(metalGearSolid);

		Exercicio superMario = new Builder("Rotina SUper Mario")
				.comEquipamento(maquina1)
				.comEquipamento(acessorio2)
				.comTipoExercicio(ExercicioEnum.FUNCIONAL)
				.comGruposMusculares(GruposMuscularesEnum.D)
				.comGruposMusculares(GruposMuscularesEnum.E)
				.build();
		System.out.println(superMario);

		Exercicio sprinterCell = new Builder("Rotina Tom Clancy")
				.comEquipamento(maquina2)
				.comEquipamento(halter3)
				.comTipoExercicio(ExercicioEnum.CARDIOVASCULAR)
				.comGruposMusculares(GruposMuscularesEnum.A)
				.comGruposMusculares(GruposMuscularesEnum.B)
				.build();
		System.out.println(sprinterCell);
	}
}
