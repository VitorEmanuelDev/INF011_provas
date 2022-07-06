package br.edu.ifba.inf011.aval1.strategy;

import java.util.List;
import br.edu.ifba.inf011.aval1.programa.Serie;

@FunctionalInterface
public interface ProgramaStrategy {
	public List<Serie> executarListaSeriesDoDia(List<Serie> listaSeries);
}
