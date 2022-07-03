package br.edu.ifba.inf011.aval1.strategy;

import java.util.List;

import br.edu.ifba.inf011.aval1.programa.ProgramaEnum;
import br.edu.ifba.inf011.aval1.programa.Serie;

public interface SerieStrategy {
	public default List<Serie> executarListaSeriesPorTipo(ProgramaEnum tipo, List<Serie> listaSeries) throws Exception{
		
		List<Serie> listaSeriesPrograma = null;

		switch(tipo) {
		case FullBody:
			FullBodyStrategy fullBody = new FullBodyStrategy();
			System.out.println("DENTRO " + listaSeries);
			listaSeriesPrograma = fullBody.executarListaSeriesDoDia(listaSeries);
			break;
		case Cardio:
			CardioStrategy cardio = new CardioStrategy();
			listaSeriesPrograma = cardio.executarListaSeriesDoDia(listaSeries);
			break;
		case Legs:
			ABCDStrategy legs = new ABCDStrategy();
			listaSeriesPrograma = legs.executarListaSeriesDoDia(listaSeries);
			break;
		default:
			throw new Exception("Tipo invalido!");
		}

		return listaSeriesPrograma;
	}
}
