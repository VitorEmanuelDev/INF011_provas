package br.edu.ifba.inf011.aval1.programa;

import java.util.List;

import br.edu.ifba.inf011.aval1.strategy.SerieStrategy;

public class Programa implements SerieStrategy{

	private List<Serie> listaSeries;
	private ProgramaEnum tipo;

	public Programa(List<Serie> listaSeries, ProgramaEnum tipo) {
		this.listaSeries = listaSeries;
		this.tipo = tipo;
	}


	public List<Serie> executarProximaSerie() throws Exception {
		return executarListaSeriesPorTipo(this.tipo, this.listaSeries);
	}

	public List<Serie> getListaSeries() {
		return listaSeries;
	}

	public void setListaSeries(List<Serie> listaSeries) {
		this.listaSeries = listaSeries;
	}

	public ProgramaEnum getTipo() {
		return tipo;
	}

	public void setTipo(ProgramaEnum tipo) {
		this.tipo = tipo;
	}

}
