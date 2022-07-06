package br.edu.ifba.inf011.aval1.programa;

import br.edu.ifba.inf011.aval1.exercicio.ExercicioBase;
import br.edu.ifba.inf011.aval1.exercicio.VideoFlyweightFactory;

public class SerieBuilder {
	
	private ExercicioBase exercicioBase;
    private int numeroRepeticoes;
    private int quantidade;
    private VideoFlyweightFactory factory;
    
    public SerieBuilder(){}
    
    public SerieBuilder reset(){
        this.numeroRepeticoes = 0;
        this.quantidade = 0;
        this.exercicioBase = null;
        this.factory = null;
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
    
    public SerieBuilder setFactory(VideoFlyweightFactory factory) {
        this.factory = factory;
        return this;
    }

    public Serie build() {
        return new Serie(this.numeroRepeticoes, this.quantidade, this.exercicioBase, this.factory);
    }

    public SerieBuilder setExercicio(ExercicioBase exercicioBase) {
        this.exercicioBase = exercicioBase;
        return this;
    }
}
