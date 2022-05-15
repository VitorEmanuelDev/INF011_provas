package br.edu.ifba.inf011.aval1.exercicio;

public enum GruposMuscularesEnum {
	A("TREINO A: PEITO / COSTAS"),
	AB("TREINO A: PEITO / COSTAS\n"
			+ "\n"
			+ "TREINO B: BÍCEPS / TRICEPS + ANTEBRAÇOS"),
	ABC("TREINO A: PEITO / COSTAS\n"
			+ "\n"
			+ "TREINO B: BÍCEPS / TRICEPS + ANTEBRAÇOS\n"
			+ "\n"
			+ "TREINO C: OMBROS / TRAPÉZIO+ ABDÔMEN"),
	ABCD("TREINO A: PEITO / COSTAS\n"
			+ "\n"
			+ "TREINO B: BÍCEPS / TRICEPS + ANTEBRAÇOS\n"
			+ "\n"
			+ "TREINO C: OMBROS / TRAPÉZIO+ ABDÔMEN\n"
			+ "\n"
			+ "TREINO D: PERNAS + PANTURRILHAS\n"
			+ "\n"
			+ "");

	public final String gruposMusculares;

	GruposMuscularesEnum(String gruposMusculares) {
		this.gruposMusculares = gruposMusculares;
	}

}
