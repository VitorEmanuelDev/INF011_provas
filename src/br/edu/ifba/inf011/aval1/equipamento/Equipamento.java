package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {

	private String identificador;
	private int quantidade;

	public Equipamento(String identificador, int quantidade) {
		this.identificador = identificador;
		this.atualizaQuantidade(quantidade);
	}

	abstract EquipamentoEnum getEquipamento();

	public String getIdentificador() {
		return this.identificador;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void atualizaQuantidade(int quantidade) {
		// se for negativo significa que podemos cair na situação onde o cliente terá uma quantidade negativa,
		// comportamento não permitido
		if ((quantidade < 0 && (this.quantidade + quantidade) <= 0)) {
			throw new IllegalArgumentException("Quantidade do equipamento não pode ser menor que 0");
		}

		this.quantidade += quantidade;
	}
}
