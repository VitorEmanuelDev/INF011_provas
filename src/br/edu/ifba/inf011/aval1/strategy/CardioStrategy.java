package br.edu.ifba.inf011.aval1.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.exercicio.ExercicioEnum;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class CardioStrategy implements ProgramaStrategy{

	@Override
	public List<Serie> executarListaSeriesDoDia(List<Serie> listaSeries) {
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = now.getDayOfWeek();     
		List<Serie> listaSeriesDia = new ArrayList<>();

		if(day == DayOfWeek.MONDAY || day == DayOfWeek.WEDNESDAY || day == DayOfWeek.FRIDAY){
			listaSeries.forEach(serie -> {	
				List<ExercicioEnum> listaExerciciosTipo = serie.getExercicio().getTiposExercicios();
				listaExerciciosTipo.forEach(tipo -> {
					if(tipo == ExercicioEnum.CARDIOVASCULAR)
						listaSeriesDia.add(serie);
				});

			});

		}

		return listaSeries;
	}
}
