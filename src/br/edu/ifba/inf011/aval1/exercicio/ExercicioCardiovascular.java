package br.edu.ifba.inf011.aval1.exercicio;


public class ExercicioCardiovascular extends ExercicioDecorator {
	
	public ExercicioCardiovascular(GruposMuscularesEnum grupo, AbstractExercicio exercicio) {
		super(getNome(), getGruposMusculares(), getTiposExercicios(), getEquipamentos());
		getGruposMusculares().add(grupo);
		getTiposExercicios().add(ExercicioEnum.CARDIOVASCULAR);
		
	}
	
}