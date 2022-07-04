package br.edu.ifba.inf011.aval1.exercicio;

public class ExercicioDecorator implements Exercicio{

	protected ConcreteExercicio exercicio;

	public ExercicioDecorator(ConcreteExercicio exercicio) {
		this.exercicio = exercicio;
	}

	@Override
	public void adicionarTipo(ExercicioEnum tipo) {
		// TODO Auto-generated method stub
		
	}

}
