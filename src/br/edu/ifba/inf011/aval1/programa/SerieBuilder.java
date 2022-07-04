package br.edu.ifba.inf011.aval1.programa;

import br.edu.ifba.inf011.aval1.exercicio.ConcreteExercicio;
import br.edu.ifba.inf011.aval1.exercicio.Exercicio;

public class SerieBuilder {
	
	private ConcreteExercicio exercicio;
    private int numeroRepeticoes;
    private int quantidade;
    
    public SerieBuilder(){}
    
    public SerieBuilder reset(){
        this.numeroRepeticoes = 0;
        this.quantidade = 0;
        this.exercicio = null;
        return this;
    }

    public SerieBuilder setNumeroRepeticoes(int repeticoes) {
        this.numeroRepeticoes = repeticoes;
        return this;
    }

    public SerieBuilder setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Serie build() {
        return new Serie(this.numeroRepeticoes, this.quantidade, this.exercicio);
    }

    public SerieBuilder setExercicio(ConcreteExercicio exercicio) {
        this.exercicio = exercicio;
        return this;
    }
}
