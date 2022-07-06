package br.edu.ifba.inf011.aval1.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.exercicio.GruposMuscularesEnum;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class ABCDStrategy implements ProgramaStrategy{

	@Override
	public List<Serie> executarListaSeriesDoDia(List<Serie> listaSeries) {

		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = now.getDayOfWeek();
		List<Serie> listaSeriesDia = new ArrayList<>();

		if(day.equals(DayOfWeek.MONDAY) || day.equals(DayOfWeek.TUESDAY) || day.equals(DayOfWeek.WEDNESDAY) || day.equals(DayOfWeek.THURSDAY)){

			listaSeries.forEach(serie -> {
				List<GruposMuscularesEnum> gruposMusculares = serie.getExercicio().getGruposMusculares();

				gruposMusculares.forEach(grupo -> {
					if((grupo.equals(GruposMuscularesEnum.OMBROS) ||grupo.equals(GruposMuscularesEnum.ABDOMINAL)) && day.equals(DayOfWeek.MONDAY)){
						listaSeriesDia.add(serie);
					}	            
					if((grupo.equals(GruposMuscularesEnum.INFERIORES)) && day.equals(DayOfWeek.TUESDAY)){
						listaSeriesDia.add(serie);
					}	                	
					if((grupo.equals(GruposMuscularesEnum.PEITO) || grupo.equals(GruposMuscularesEnum.TRICEPS)) && day.equals(DayOfWeek.WEDNESDAY)){
						listaSeriesDia.add(serie);
					}
					if((grupo.equals(GruposMuscularesEnum.COSTAS) || grupo.equals(GruposMuscularesEnum.BICEPS)) && day.equals(DayOfWeek.THURSDAY)){
						listaSeriesDia.add(serie);
					}   
				});
			});
		}
		return listaSeriesDia;
	}
}
