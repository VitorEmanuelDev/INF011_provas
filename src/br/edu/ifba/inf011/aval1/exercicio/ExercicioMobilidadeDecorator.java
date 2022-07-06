package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioMobilidadeDecorator extends ExercicioBaseDecorator {
	
	public ExercicioMobilidadeDecorator(AbstractExercicio exercicio) {
		super(exercicio);
	}

	public void comGrupoMuscular(GruposMuscularesEnum grupo) {
		exercicioWrapper.getTiposExercicios().add(ExercicioEnum.MOBILIDADE);
		super.comGrupoMuscular(grupo);
	}
}
