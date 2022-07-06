package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioMobilidade extends ExercicioDecorator {
	
	public ExercicioMobilidade(GruposMuscularesEnum grupo, AbstractExercicio exercicio) {
		super(getNome(), getGruposMusculares(), getTiposExercicios(), getEquipamentos());
		getGruposMusculares().add(grupo);
		getTiposExercicios().add(ExercicioEnum.MOBILIDADE);

	}
	
}
