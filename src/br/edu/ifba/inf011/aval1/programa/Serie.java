package br.edu.ifba.inf011.aval1.programa;

import br.edu.ifba.inf011.aval1.exercicio.ExercicioBase;
import br.edu.ifba.inf011.aval1.exercicio.ExercicioBase;

public class Serie {
	
	private ExercicioBase exercicioBase;
	private int numeroRepeticoes;
	private int quantidade;
	boolean realizada;
	
	public Serie() {}
	
	public Serie(int numRepeticoes, int quantidade, ExercicioBase exercicioBase) {
		this.numeroRepeticoes = numRepeticoes;
		this.quantidade = quantidade;
		this.exercicioBase = exercicioBase;
	}

	public int getNumeroRepeticoes() {
		return numeroRepeticoes;
	}
	public void setNumeroRepeticoes(int numeroRepeticoes) {
		this.numeroRepeticoes = numeroRepeticoes;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public ExercicioBase getExercicio() {
        return exercicioBase;
    }
    public void setExercicio(ExercicioBase exercicioBase) {
        this.exercicioBase = exercicioBase;
    }

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada() {
		this.realizada = true;
	}

}
