package br.edu.ifba.inf011.aval1.programa;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.strategy.ProgramaStrategy;

public class ProgramaBuilder {

    private List<Serie> listaSeries;
    private ProgramaEnum tipo; 

	public ProgramaBuilder() {}

	public ProgramaBuilder reset() {
        this.listaSeries = new ArrayList<>();
        this.tipo = null;
        return this;
    }

    public ProgramaBuilder comSerie(Serie serie) {
        this.listaSeries.add(serie);
        return this;
    }

    public ProgramaBuilder setTipo(ProgramaEnum tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public Programa build() {
        return new Programa(this.listaSeries, this.tipo);
    }
    
}