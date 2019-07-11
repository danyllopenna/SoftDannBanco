package com.danyllopenna.factory;

import java.sql.*;

public class Conexao {
	public static String CAMINHO = "jdbc:postgresql://localhost:5432/banco";
	public static String USUARIO = "postgres";
	public static String SENHA = "shevchenko";
	public static Connection conectar = null;
	
	public static Connection conectando() {
		try {
			conectar = DriverManager.getConnection(CAMINHO, USUARIO,SENHA);
			System.out.println("conectado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conectar;
	}
	public static void main(String[] args) {
		Connection conecte = Conexao.conectando();
		
	}

}
