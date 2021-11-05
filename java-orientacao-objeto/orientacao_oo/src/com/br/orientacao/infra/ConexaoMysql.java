package com.br.orientacao.infra;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

public class ConexaoMysql {
	private Connection connection = null;
	private static final String USERNAME = "root";
	private static final String PASSWORD= "123456";
	//dados de caminho, porta e nome da base de dados que irá ser feita a conexão 
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/loja?useTimezone=true&serverTimezone=UTC";
	
	public ConexaoMysql() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		this.connection.setAutoCommit(false);
	}
	
	public Connection getConnetion() {//pegar conexao
		return this.connection;
	}
	
	public void close() {//fechar
		if(this.connection != null) {
			//tenta executar esse bloco de comando 
			try {
				this.connection.close();
			}catch(SQLException e) {
				Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null,e);
			}
		}
	}
	
	public void commit() throws SQLException{//confirmar
		this.connection.commit();
		this.close();
		
	}
	
	public void rollback() {//desfazer, não deixa inserir dados inconsistentes
		if(this.connection != null) {
			//tenta executar esse bloco de comando 
			try {
				this.connection.close();
			}catch(SQLException e) {
				Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null,e);
			}
		}
	}

}
