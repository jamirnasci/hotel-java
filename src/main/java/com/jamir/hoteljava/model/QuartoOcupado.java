package com.jamir.hoteljava.model;

public class QuartoOcupado {
	private String nomeCliente;
	private String quartoNome;
	private String checkin;
	private String checkout;
	private String numero;
	
	public QuartoOcupado(String nomeCliente, String quartoNome, String checkin, String checkout, String numero) {
		super();
		this.nomeCliente = nomeCliente;
		this.quartoNome = quartoNome;
		this.checkin = checkin;
		this.checkout = checkout;
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getQuartoNome() {
		return quartoNome;
	}

	public void setQuartoNome(String quartoNome) {
		this.quartoNome = quartoNome;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
