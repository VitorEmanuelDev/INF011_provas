package br.edu.ifba.inf011.aval1.exercicio;

import java.util.HashMap;

public class VideoFactory {

	private String DESCRICAO_CARDIOVASCULAR = "CARDIO: Exercícios cardio são atividades que solicitam a \n"
			+ "função cardíaca, nomeadamente as funções respiratória e circulatória\n";
	private String DESCRICAO_FUNCIONAL = "FUNCIONAL: Os exercícios funcionais são aqueles que \n"
			+ "trabalham todos os músculos ao mesmo tempo\n";
	private String DESCRICAO_MOBILIDADE = "MOBILIDADE: Um exercício de mobilidade tem o objetivo de aquecer\n"
			+ "as articulações com movimentações estáticas ou dinâmicas a fim de aumentar\n"
			+ "a amplitude com que se realiza uma atividade.\n";
	private String DESCRICAO_RESISTENCIA = "RESISTENCIA: A resistência é a habilidade de poder exercer um\n"
			+ "esforço estático ou dinâmico prolongado, sem afetar a qualidade do exercício.\n";

	private HashMap<ExercicioEnum, Video> mapVideos = new HashMap<>();

	public Video getVideo(ExercicioEnum tipo) {

		Video video = null;

		if(!mapVideos.containsKey(tipo)) {
			if (tipo.equals(ExercicioEnum.CARDIOVASCULAR)) {
				video = new Video(tipo, DESCRICAO_CARDIOVASCULAR);
				mapVideos.put(tipo, video);
			} else if (tipo.equals(ExercicioEnum.FUNCIONAL)) {
				video = new Video(tipo, DESCRICAO_FUNCIONAL);
				mapVideos.put(tipo, video);
			} else if (tipo.equals(ExercicioEnum.MOBILIDADE)) {
				video = new Video(tipo, DESCRICAO_MOBILIDADE);
				mapVideos.put(tipo, video);
			}else if (tipo.equals(ExercicioEnum.RESISTENCIA)) {
				video = new Video(tipo, DESCRICAO_RESISTENCIA);
				mapVideos.put(tipo, video);
			}
		}
		
		if(mapVideos.containsKey(tipo)) {
			video = mapVideos.get(tipo);
		}

		return video;
	}   
}
