package com.br.orientacao.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.br.orientacao.model.entity.Fornecedor;
import com.br.orientacao.infra.ConexaoMysql;

public class FornecedorDAO implements DAOGenerico<Fornecedor>{
 
	ArrayList<Fornecedor>listaFornecedores = new ArrayList<Fornecedor>();
	private ConexaoMysql conexao;
	private String query= "";
	public FornecedorDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}
	
	@Override
	public void save(Fornecedor fornecedor) throws SQLException {
		query = "insert into fornecedor(nome,codigo_fornecedor,razao_social,telefone)value(?,?,?,?)";
		try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setString(1, fornecedor.getNome());
        	stmt.setString(2, fornecedor.getCodigo());
        	stmt.setString(3, fornecedor.getRazaoSocial());
        	stmt.setString(4, fornecedor.getTelefone());
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	
        }
	}

	@Override
	public List<Fornecedor>findAll() throws SQLException {
		query = "select nome,razao_social,codigo_fornecedor from fornecedor";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Fornecedor>listaPesquisada= new ArrayList<>();
			while(resultSet.next()) {
				Fornecedor f = new Fornecedor(resultSet.getString("nome"),resultSet.getString("razao_social"));
				f.setCodigo(resultSet.getString("codigo_fornecedor"));
				listaPesquisada.add(f);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
		
	}

	
	@Override
	public void delete(String id) throws SQLException {
		query = "delete  from fornecedor where codigo_fornecedor = ?";
		try{
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			stmt.setString(1, id);
			stmt.executeUpdate();
			this.conexao.commit();
			}catch(SQLException e){
				this.conexao.rollback();
				throw e;
			}
	}

	
	
	@Override
	public void update(Fornecedor fornecedor) throws SQLException {
		//pdate contatos set nome=? , email=?, endereco=?, dataNascimento=? where id=?
		query = "update fornecedor set nome=?,razao_social=?, telefone=? where codigo_fornecedor = ?";
		try{
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			
			stmt.setString(1, fornecedor.getNome());
			stmt.setString(2, fornecedor.getRazaoSocial());
			stmt.setString(3, fornecedor.getTelefone());
			stmt.setString(4, fornecedor.getCodigo());
			
			stmt.executeUpdate();
			this.conexao.commit();
			}catch(SQLException e){
				this.conexao.rollback();
				throw e;
			}
	}

	//implamentar depois (sexta) 
	@Override
	public Fornecedor findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
