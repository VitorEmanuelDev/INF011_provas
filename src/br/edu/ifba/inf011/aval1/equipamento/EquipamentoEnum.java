package br.edu.ifba.inf011.aval1.equipamento;

public enum EquipamentoEnum {

	MAQUINAS("br.edu.ifba.inf011.aval1.equipamento.Maquina"),
	HALTERES("br.edu.ifba.inf011.aval1.equipamento.Halter"),
	ACESSORIOS("br.edu.ifba.inf011.aval1.equipamento.Acessorio");

	public final String classe;

	EquipamentoEnum(String classe) {
		this.classe = classe;
	}

	public String getCaminho() {
		return this.classe;	
	}
}
