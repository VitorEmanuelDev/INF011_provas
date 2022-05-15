package br.edu.ifba.inf011.aval1.equipamento;

public final class Halteres extends Equipamento {

	private double peso;

	public Halteres(String identificador, int quantidade) {
		super(identificador, quantidade);
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
		if(peso > 0 && peso < 150) {
			this.setPeso(peso);
		}
		if(peso < 0) {
			this.setPeso(1);
		}
		if(peso > 150) {
			this.setPeso(150);
		}
	}

}
