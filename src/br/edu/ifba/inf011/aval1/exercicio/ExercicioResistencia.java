package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioResistencia extends ExercicioDecorator {
	
	public ExercicioResistencia(GruposMuscularesEnum grupo, AbstractExercicio exercicio) {
		super(getNome(), getGruposMusculares(), getTiposExercicios(), getEquipamentos());
		getGruposMusculares().add(grupo);
		getTiposExercicios().add(ExercicioEnum.RESISTENCIA);
		
	}
	
}
