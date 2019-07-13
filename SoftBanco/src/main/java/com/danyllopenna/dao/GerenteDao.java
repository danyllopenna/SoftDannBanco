package com.danyllopenna.dao;

import java.sql.*;

import com.danyllopenna.dominio.Gerente;
import com.danyllopenna.factory.Conexao;

public class GerenteDao {
	
	StringBuilder sql = new StringBuilder();
	Connection conecta = Conexao.conectando();
	
	public void salvarGerente(Gerente g) {
		sql.append("insert into pessoa ");
		sql.append("(nomepessoa,sobrenomepessoa,enderecopessoa,telefonepessoa,emailpessoa,senhapessoa,tipopessoa,loginpessoa) ");
		sql.append("values(?,?,?,?,?,?,?,?)");
		
		try {
			PreparedStatement salvar = conecta.prepareStatement(sql.toString());
			salvar.setString(1,g.getNome());
			salvar.setString(2, g.getSobrenome());
			salvar.setString(3,g.getEndereco());
			salvar.setString(4,g.getTelefone());
			salvar.setString(5,g.getEmail());
			salvar.setString(6,g.getSenha());
			salvar.setString(7,g.getTipopessoa());
			salvar.setString(8, g.getLogin());
			salvar.executeUpdate();
			System.out.println("gravado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setEmail("dann@email.com");
		g1.setEndereco("passagem ali, 52");
		g1.setLogin("gerente");
		g1.setNome("dann");
		g1.setSenha("4521");
		g1.setSobrenome("penna");
		g1.setTelefone("32145");
		g1.setTipopessoa("gerente");
		
		GerenteDao dao = new GerenteDao();
		dao.salvarGerente(g1);
	}
}
