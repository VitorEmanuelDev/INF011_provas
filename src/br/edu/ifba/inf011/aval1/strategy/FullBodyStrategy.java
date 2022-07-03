package br.edu.ifba.inf011.aval1.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.programa.ProgramaEnum;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class FullBodyStrategy implements ProgramaStrategy{

	@Override
	public List<Serie> executarListaSeriesDoDia(List<Serie> listaSeries) {
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = now.getDayOfWeek();
		//DayOfWeek day = DayOfWeek.MONDAY;
		List<Serie> listaSeriesDia = new ArrayList<>();

		if(day == DayOfWeek.MONDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.FRIDAY){
			listaSeries.forEach(serie -> {
				listaSeriesDia.add(serie);
			});
		}
		return listaSeriesDia;
	}
}
