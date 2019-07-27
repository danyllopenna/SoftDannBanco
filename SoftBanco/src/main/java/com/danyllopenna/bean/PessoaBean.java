package com.danyllopenna.bean;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.danyllopenna.dao.GerenteDao;
import com.danyllopenna.dominio.Gerente;



@ManagedBean(name = "MBpessoa")
@ViewScoped
public class PessoaBean {
	private Gerente gerente;
	
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public void novo() {
		
		GerenteDao dao = new GerenteDao();
		dao.salvarGerente(gerente);
	}
	
	@PostConstruct
	public void preparanovo() {
		gerente = new Gerente();
	}
	
}
