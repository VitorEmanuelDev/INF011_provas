package br.edu.ifba.inf011.aval1.equipamento;

public final class Halter extends Equipamento {

	private double peso;

	public Halter(String identificador, int quantidade) {
		super(identificador, quantidade);
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.HALTERES;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("Peso não pode ser zero ou um número negativo");
		}
		this.peso = peso;
	}

}
