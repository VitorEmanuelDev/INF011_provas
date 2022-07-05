package br.edu.ifba.inf011.aval1.exercicio;

import java.util.List;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;

public class ExercicioBase extends AbstractExercicio{

	public ExercicioBase(String nome, List<GruposMuscularesEnum> gruposMusculares,
			List<ExercicioEnum> tiposExercicios, List<Equipamento> equipamentos) {
		super(nome, gruposMusculares, tiposExercicios, equipamentos);
	}

}
