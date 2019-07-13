package com.danyllopenna.dominio;

public class Gerente extends Pessoa{
	
	
	
	
	
	public Gerente() {
		super();
	}
	public Gerente(String nome, String sobrenome, String endereco, String telefone, String email, String tipopessoa,
			String senha, String login, int idFuncionario) {
		super(nome, sobrenome, endereco, telefone, email, tipopessoa);
		this.senha = senha;
		this.login = login;
		this.idFuncionario = idFuncionario;
	}
	private String senha;
	private String login;
	private int idFuncionario;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

}
