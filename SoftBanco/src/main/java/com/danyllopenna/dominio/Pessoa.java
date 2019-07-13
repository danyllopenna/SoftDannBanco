package com.danyllopenna.dominio;

public abstract class Pessoa {
	String nome, sobrenome, endereco,telefone,email,tipopessoa;

	public String getTipopessoa() {
		return tipopessoa;
	}

	public void setTipopessoa(String tipopessoa) {
		this.tipopessoa = tipopessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa(String nome, String sobrenome, String endereco, String telefone, String email, String tipopessoa) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.tipopessoa = tipopessoa;
	}

	public Pessoa() {
		super();
	}
	

}
