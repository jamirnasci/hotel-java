package com.jamir.hoteljava.model;

public class Quarto {
	private String nome;
	private String disponiveis;
	private String descricao;
	private String preco;
	
	public Quarto(String nome, String disponiveis, String descricao, String preco) {
		this.nome = nome;
		this.disponiveis = disponiveis;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisponiveis() {
		return disponiveis;
	}

	public void setDisponiveis(String disponiveis) {
		this.disponiveis = disponiveis;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Quarto [nome=" + nome + ", disponiveis=" + disponiveis + ", descricao=" + descricao + ", preco=" + preco
				+ "]";
	}
	
	
}
