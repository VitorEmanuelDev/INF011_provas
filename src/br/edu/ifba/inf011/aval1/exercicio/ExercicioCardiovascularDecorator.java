package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioCardiovascularDecorator extends ExercicioBaseDecorator {
	
	public ExercicioCardiovascularDecorator(AbstractExercicio exercicio) {
		super(exercicio);
	}

	@Override
	public void comGrupoMuscular(GruposMuscularesEnum grupo) {
		exercicioWrapper.getTiposExercicios().add(ExercicioEnum.CARDIOVASCULAR);
		super.comGrupoMuscular(grupo);
	}
}
