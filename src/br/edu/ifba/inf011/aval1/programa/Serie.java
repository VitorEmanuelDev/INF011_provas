package br.edu.ifba.inf011.aval1.programa;

import br.edu.ifba.inf011.aval1.exercicio.Exercicio;

public class Serie {
	
	private Exercicio exercicio;
	private int numeroRepeticoes;
	private int quantidade;

	
	public Serie() {
	
	}
	
	public Serie(int numRepeticoes, int quantidade, Exercicio exercicio) {
		this.numeroRepeticoes = numRepeticoes;
		this.quantidade = quantidade;
		this.exercicio = exercicio;
	}
	
	public int getNumRepeticoes() {
		return numeroRepeticoes;
	}
	public void setNumRepeticoes(int numRepeticoes) {
		this.numeroRepeticoes = numRepeticoes;
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

}
