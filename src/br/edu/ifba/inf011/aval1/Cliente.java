package br.edu.ifba.inf011.aval1;

import static br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum.*;

import br.edu.ifba.inf011.aval1.equipamento.*;
import br.edu.ifba.inf011.aval1.exercicio.*;
import br.edu.ifba.inf011.aval1.factory.EquipamentoSingleton;
import br.edu.ifba.inf011.aval1.pessoas.Aluno;
import br.edu.ifba.inf011.aval1.pessoas.Instrutor;
import br.edu.ifba.inf011.aval1.programa.Programa;
import br.edu.ifba.inf011.aval1.programa.ProgramaBuilder;
import br.edu.ifba.inf011.aval1.programa.ProgramaEnum;
import br.edu.ifba.inf011.aval1.programa.Serie;
import br.edu.ifba.inf011.aval1.programa.SerieBuilder;

public class Cliente {

	static EquipamentoSingleton factory = EquipamentoSingleton.getInstance();

	public static void main(String[] args) throws Exception{

		Equipamento acessorio1 = null;
		try {
			acessorio1 =  factory.getConcreteFactory(ACESSORIOS, "A123", 2);	
			acessorio1.setDescricao("descricao teste A123");
			System.out.println(acessorio1.getEquipamento() + " " + acessorio1.getDescricao() + " " + acessorio1.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento acessorio2 = null;
		try {
			acessorio2 = factory.getConcreteFactory(ACESSORIOS, "A123", 4);	
			System.out.println(acessorio2.getEquipamento() + " " + acessorio2.getDescricao() + " " + acessorio2.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento acessorio3 = null;
		try {
			acessorio3 = (Acessorio) factory.getConcreteFactory(ACESSORIOS, "A987", 4);	
			acessorio3.setDescricao("descricao teste A987");
			System.out.println(acessorio3.getEquipamento() + " " + acessorio3.getDescricao() + " " + acessorio3.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento maquina1 = null;
		try {
			maquina1 = (Maquina) factory.getConcreteFactory(MAQUINAS, "B123", 2);	
			maquina1.setDescricao("descricao teste B123");
			maquina1.setMarca("teste marca B123");
			System.out.println(maquina1.getEquipamento() + " " + maquina1.getDescricao() + " " + maquina1.getMarca() + " " + maquina1.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento maquina2 = null;
		try {
			maquina2 = (Maquina) factory.getConcreteFactory(MAQUINAS, "B123", 6);	
			System.out.println(maquina2.getEquipamento() + " " + maquina2.getDescricao() + " " + maquina2.getMarca() + " " + maquina2.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento maquina3 = null;
		try {
			maquina3 = (Maquina) factory.getConcreteFactory(MAQUINAS, "B765", 3);	
			maquina3.setDescricao("descricao teste B765");
			maquina3.setMarca("teste marca B765");
			System.out.println(maquina3.getEquipamento() + " " + maquina3.getDescricao() + " " + maquina3.getMarca() + " " + maquina3.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento halter1 = null;
		try {
			halter1 = (Halter) factory.getConcreteFactory(HALTERES, "C123", 2);		
			halter1.setPeso(15);
			System.out.println(halter1.getEquipamento() + " " + halter1.getIdentificador() + " " + halter1.getPeso() + " " + halter1.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento halter2 = null;
		try {
			halter2 = (Halter) factory.getConcreteFactory(HALTERES, "C123", 9);		
			System.out.println(halter2.getEquipamento() + " " + halter2.getIdentificador() + " " + halter2.getPeso() + " " + halter2.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}
		Equipamento halter3 = null;
		try {
			halter3 = (Halter) factory.getConcreteFactory(HALTERES, "C145", 7);		
			halter3.setPeso(80);
			System.out.println(halter3.getEquipamento() + " " + halter3.getIdentificador() + " " + halter3.getPeso() + " " + halter3.getQuantidade());
		}catch(Exception e){
			e.printStackTrace();
		}


		ExercicioBuilder builderExercicio  = new ExercicioBuilder();

		ExercicioBase metalGearSolid = builderExercicio
				.reset("Rotina Solid Snake")
				.comEquipamento(acessorio1)
				.comEquipamento(maquina1)
				.comEquipamento(halter1)
				.comTipoExercicio(ExercicioEnum.RESISTENCIA)
				.comGruposMusculares(GruposMuscularesEnum.BICEPS)
				.build();
		System.out.println(metalGearSolid);

		ExercicioBase superMario = builderExercicio
				.reset("Rotina Super Mario Bros")
				.comEquipamento(maquina1)
				.comEquipamento(acessorio2)
				.comTipoExercicio(ExercicioEnum.FUNCIONAL)
				.comGruposMusculares(GruposMuscularesEnum.COSTAS)
				.build();
		System.out.println(superMario);

		ExercicioBase sprinterCell = builderExercicio
				.reset("Rotina Gary and his Demons")
				.comEquipamento(maquina2)
				.comEquipamento(halter3)
				.comTipoExercicio(ExercicioEnum.CARDIOVASCULAR)
				.comGruposMusculares(GruposMuscularesEnum.INFERIORES)
				.build();
		System.out.println(sprinterCell);


		SerieBuilder builderSerie = new SerieBuilder();
		Serie serie1 = builderSerie
				.reset()
				.setExercicio(sprinterCell)

				.setNumeroRepeticoes(15)
				.setQuantidade(4)
				.build();

		Serie serie2 = builderSerie
				.reset()
				.setExercicio(metalGearSolid)
				.setNumeroRepeticoes(15)
				.setQuantidade(4)
				.build();

		Serie serie3 = builderSerie
				.reset()
				.setExercicio(superMario)
				.setNumeroRepeticoes(15)
				.setQuantidade(4)
				.build();

		ProgramaBuilder programaBuilder = new ProgramaBuilder();

		Programa programa = programaBuilder.reset()
				.setTipo(ProgramaEnum.FullBody)
				.comSerie(serie1)
				.comSerie(serie2)
				.comSerie(serie3)
				.build();
		programa.executarProximaSerie().forEach(serie -> {
			System.out.println("\nSERIE : " + serie.getExercicio() + "\n" +
					"QUANTIDADE : " + serie.getQuantidade() + "\n" +
					"REPETIÇÕES : " + serie.getNumeroRepeticoes()); 
		});

		Aluno aluno = new Aluno("Janaína");
		aluno.setPrograma(programa);
		Instrutor instrutor = new Instrutor("Alberta");
		aluno.adicionaObserver(instrutor);
		aluno.removerSerieRealizada();


		ExercicioBase therapyGecko = builderExercicio
				.reset("Rotina Therapy Gecko")
				.comEquipamento(maquina1)
				.comEquipamento(halter1)
				.comTipoExercicio(ExercicioEnum.RESISTENCIA)
				.comGruposMusculares(GruposMuscularesEnum.COSTAS)
				.build();


		ExercicioBase exercicioAgregado1 = therapyGecko;

		ExercicioBaseDecorator exercicioDecorator = new ExercicioFuncionalDecorator(exercicioAgregado1);
		exercicioDecorator.comGrupoMuscular(GruposMuscularesEnum.INFERIORES);

		exercicioDecorator = new ExercicioMobilidadeDecorator(exercicioAgregado1);
		exercicioDecorator.comGrupoMuscular(GruposMuscularesEnum.PEITO);

		exercicioDecorator = new ExercicioResistenciaDecorator(exercicioAgregado1);
		exercicioDecorator.comGrupoMuscular(GruposMuscularesEnum.ABDOMINAL);

		exercicioDecorator = new ExercicioCardiovascularDecorator(exercicioAgregado1);
		exercicioDecorator.comGrupoMuscular(GruposMuscularesEnum.COSTAS);

		System.out.println("\nExercicio agregado:");
		exercicioAgregado1.getTiposExercicios().forEach(tipo -> {
			System.out.print(tipo + " ");
		});
		System.out.println("\nGrupos musculares agregados:");
		exercicioAgregado1.getGruposMusculares().forEach(grupo -> {
			System.out.print(grupo + " ");
		});
		
		VideoFlyweightFactory factory = new VideoFlyweightFactory();
		
		ExercicioBase usainBolt = builderExercicio
				.reset("Rotina Usain Bolt")
				.comEquipamento(maquina1)
				.comEquipamento(acessorio2)
				.comTipoExercicio(ExercicioEnum.FUNCIONAL)
				.comTipoExercicio(ExercicioEnum.CARDIOVASCULAR)
				.comTipoExercicio(ExercicioEnum.MOBILIDADE)
				.comTipoExercicio(ExercicioEnum.RESISTENCIA)
				.comGruposMusculares(GruposMuscularesEnum.COSTAS)
				.build();
		
		Serie serie4 = builderSerie
				.reset()
				.setExercicio(usainBolt)
				.setFactory(factory)
				.setNumeroRepeticoes(15)
				.setQuantidade(4)
				.build();
		System.out.println("\n");
		serie4.executar();
		
		
	}
}
