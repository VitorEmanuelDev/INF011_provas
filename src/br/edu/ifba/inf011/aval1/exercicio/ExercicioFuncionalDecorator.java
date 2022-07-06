package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioFuncionalDecorator extends ExercicioBaseDecorator {

	public ExercicioFuncionalDecorator(AbstractExercicio exercicio) {
		super(exercicio);
	}

	public void comGrupoMuscular(GruposMuscularesEnum grupo) {
		exercicioWrapper.getTiposExercicios().add(ExercicioEnum.FUNCIONAL);
		super.comGrupoMuscular(grupo);
	}
}
