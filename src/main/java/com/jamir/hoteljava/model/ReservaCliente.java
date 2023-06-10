package com.jamir.hoteljava.model;

public class ReservaCliente {
	
	private String nome;
	private String cpf;
	private String check_in_date;
	private String check_out_date;
	private int hospedes;
	
	public ReservaCliente(String nome, String cpf, String check_in_date, String check_out_date, int hospedes) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.hospedes = hospedes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCheck_in_date() {
		return check_in_date;
	}

	public void setCheck_in_date(String check_in_date) {
		this.check_in_date = check_in_date;
	}

	public String getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(String check_out_date) {
		this.check_out_date = check_out_date;
	}

	public int getHospedes() {
		return hospedes;
	}

	public void setHospedes(int hospedes) {
		this.hospedes = hospedes;
	}
	
	
}
