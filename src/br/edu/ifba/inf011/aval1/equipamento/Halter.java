package br.edu.ifba.inf011.aval1.equipamento;

public final class Halter extends Equipamento {

	public Halter(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.HALTERES;
	}

}
