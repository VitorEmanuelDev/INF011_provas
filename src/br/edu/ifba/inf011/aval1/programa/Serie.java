package br.edu.ifba.inf011.aval1.programa;

import br.edu.ifba.inf011.aval1.exercicio.Exercicio;

public class Serie {
	
	private Exercicio exercicio;
	private int numeroRepeticoes;
	private int quantidade;
	boolean realizada;
	
	public Serie() {}
	
	public Serie(int numRepeticoes, int quantidade, Exercicio exercicio) {
		this.numeroRepeticoes = numRepeticoes;
		this.quantidade = quantidade;
		this.exercicio = exercicio;
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
	public Exercicio getExercicio() {
        return exercicio;
    }
    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada() {
		this.realizada = true;
	}

}
