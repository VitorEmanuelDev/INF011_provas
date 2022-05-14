package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {
	
	protected String identificador;
	protected int quantidade;
	
	public Equipamento(String identificador, int quantidade) {
		this.identificador = identificador;
		this.quantidade = quantidade;
	}
	
	abstract EquipamentoEnum getEquipamento();

	public String getIdentificador() {
		return identificador;
	}

	public int getQuantidade() {
		return quantidade;
	}

	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void adicionarEquipamento(int quantidade) {
		int novaQuantidade = getQuantidade() + quantidade;
		setQuantidade(novaQuantidade);
	}

}
