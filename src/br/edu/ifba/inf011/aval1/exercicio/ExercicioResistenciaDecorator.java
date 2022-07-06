package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioResistenciaDecorator extends ExercicioBaseDecorator {
	
	public ExercicioResistenciaDecorator(AbstractExercicio exercicio) {
		super(exercicio);
	}

	public void comGrupoMuscular(GruposMuscularesEnum grupo) {
		exercicioWrapper.getTiposExercicios().add(ExercicioEnum.RESISTENCIA);
		super.comGrupoMuscular(grupo);
	}
}
