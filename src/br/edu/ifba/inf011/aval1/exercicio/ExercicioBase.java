package br.edu.ifba.inf011.aval1.exercicio;

import java.util.List;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class ExercicioBase extends AbstractExercicio{

	public ExercicioBase(String nome, List<GruposMuscularesEnum> gruposMusculares,
			List<ExercicioEnum> tiposExercicios, List<Equipamento> equipamentos, Serie serie) {
		super(nome, gruposMusculares, tiposExercicios, equipamentos, serie);
	}

}
