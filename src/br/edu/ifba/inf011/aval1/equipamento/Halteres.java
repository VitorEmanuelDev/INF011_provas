package br.edu.ifba.inf011.aval1.equipamento;

public final class Halteres extends Equipamento {
	
	private double peso;

	public Halteres(String identificador, int quantidade) {
		super(identificador, quantidade);
		this.identificador = identificador;
		this.quantidade = quantidade;
	}

	@Override
	public EquipamentoEnum getEquipamento() {
		return EquipamentoEnum.HALTERES;
	}

	public double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void determinarPeso(double peso) {
		setPeso(peso);
	}
	
}
