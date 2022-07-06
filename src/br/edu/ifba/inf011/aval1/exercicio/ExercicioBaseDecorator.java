package br.edu.ifba.inf011.aval1.exercicio;

public abstract class ExercicioBaseDecorator {
	
	protected AbstractExercicio exercicioWrapper;

	public ExercicioBaseDecorator(AbstractExercicio exercicio) {
		this.exercicioWrapper = exercicio;
	}
	
	public void comGrupoMuscular(GruposMuscularesEnum grupo) {
		exercicioWrapper.getGruposMusculares().add(grupo);
	}

}
