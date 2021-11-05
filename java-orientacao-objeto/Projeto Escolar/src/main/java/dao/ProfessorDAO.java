package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Professor;
import util.ConexaoMysql;

public class ProfessorDAO implements DAOGenerico<Professor> {
	private ConexaoMysql conexao;
	private String query= "";
	
	public ProfessorDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}
	@Override
	public void incluir(Professor t) throws SQLException {
		query = "insert into professor(nomeProfessor,ativo)value(?,?)";
		try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setString(1, t.getNomeProfessor());
            stmt.setBoolean(2, t.isAtivo());
        	
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	System.out.println(e);
        	
        }
		
	}

	@Override
	public void alterar(Professor t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> consultarTodos() throws SQLException {
		query = "select * from professor";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Professor>listaPesquisada= new ArrayList<>();
				
			while(resultSet.next()) {
				Professor professor = new Professor(resultSet.getInt("codigo"),resultSet.getString("nomeProfessor"),resultSet.getBoolean("ativo"));
				listaPesquisada.add(professor);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
	}

	@Override
	public Professor Consultar(int id) throws SQLException {
		query = "select * from professor where codigo =?";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			
			resultSet.next(); 
			Professor professor = new Professor(resultSet.getInt("codigo"),resultSet.getString("nomeProfessor"),resultSet.getBoolean("ativo"));
			
			
			return professor;
			
		}catch(SQLException e) {
			throw e;
		}
	}

	@Override
	public void excluir(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
