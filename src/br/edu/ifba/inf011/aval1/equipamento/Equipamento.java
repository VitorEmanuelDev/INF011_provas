package br.edu.ifba.inf011.aval1.equipamento;

public abstract class Equipamento {
	
	private String identificador;
	private int quantidade;
	
	public Equipamento(String identificador, int quantidade) {
		this.setIdentificador(identificador);
		this.setQuantidade(quantidade);
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

	private void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
