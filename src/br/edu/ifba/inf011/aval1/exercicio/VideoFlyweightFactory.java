package br.edu.ifba.inf011.aval1.exercicio;

import java.util.HashMap;

import br.edu.ifba.inf011.aval1.strategy.ABCDStrategy;
import br.edu.ifba.inf011.aval1.strategy.CardioStrategy;
import br.edu.ifba.inf011.aval1.strategy.FullBodyStrategy;

public class VideoFlyweightFactory {

	private String DESCRICAO_CARDIOVASCULAR = "[VIDEO DO EXERCÍCIO CARDIO: Exercícios cardio são atividades que solicitam a \n"
			+ "função cardíaca, nomeadamente as funções respiratória e circulatória]\n";
	private String DESCRICAO_FUNCIONAL = "[VIDEO DO EXERCÍCIO FUNCIONAL: Os exercícios funcionais são aqueles que \n"
			+ "trabalham todos os músculos ao mesmo tempo]\n";
	private String DESCRICAO_MOBILIDADE = "[VIDEO DO EXERCÍCIO MOBILIDADE: Um exercício de mobilidade tem o objetivo de aquecer\n"
			+ "as articulações com movimentações estáticas ou dinâmicas a fim de aumentar\n"
			+ "a amplitude com que se realiza uma atividade.]\n";
	private String DESCRICAO_RESISTENCIA = "[VIDEO DO EXERCÍCIO RESISTENCIA: A resistência é a habilidade de poder exercer um\n"
			+ "esforço estático ou dinâmico prolongado, sem afetar a qualidade do exercício.]\n";

	private HashMap<ExercicioEnum, Video> mapVideos = new HashMap<>();

	public Video getVideo(ExercicioEnum tipo) throws Exception {

		Video video = null;

		if(!mapVideos.containsKey(tipo)) {
			switch(tipo) {
			case CARDIOVASCULAR:
				video = new Video(tipo, DESCRICAO_CARDIOVASCULAR);
				mapVideos.put(tipo, video);
				break;
			case FUNCIONAL:
				video = new Video(tipo, DESCRICAO_FUNCIONAL);
				mapVideos.put(tipo, video);
				break;
			case MOBILIDADE:
				video = new Video(tipo, DESCRICAO_MOBILIDADE);
				mapVideos.put(tipo, video);
				break;
			case RESISTENCIA:
				video = new Video(tipo, DESCRICAO_RESISTENCIA);
				mapVideos.put(tipo, video);
				break;
			default:
				throw new Exception("Tipo invalido!");
			}
		}
		
		if(mapVideos.containsKey(tipo)) {
			video = mapVideos.get(tipo);
		}

		return video;
	}   
}
