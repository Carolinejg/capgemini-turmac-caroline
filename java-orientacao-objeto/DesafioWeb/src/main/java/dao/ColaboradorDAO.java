package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Colaborador;
import util.ConexaoMysql;

public class ColaboradorDAO implements DAOGenerico<Colaborador>{
	
	private ConexaoMysql conexao;
	private String query= "";
	
	public ColaboradorDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}

	@Override
	public void incluir(Colaborador t) throws SQLException {
		query = "insert into colaborador(nome)value(?)";
		try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setString(1, t.getNomeColaborador());
        	
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	
        }
		
	}

	@Override
	public void alterar(Colaborador t) throws SQLException {
		//pdate contatos set nome=? , email=?, endereco=?, dataNascimento=? where id=?
		query = "update colaborador set nome=? where id = ?";
		try{
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			
			stmt.setString(1, t.getNomeColaborador());
			stmt.setInt(2, t.getIdColaborador());
			
			
			stmt.executeUpdate();
			this.conexao.commit();
			}catch(SQLException e){
				this.conexao.rollback();
				throw e;
			}
		
	}

	@Override
	public List<Colaborador> consultarTodos() throws SQLException {
		query = "select id,nome from colaborador";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Colaborador>listaPesquisada= new ArrayList<>();
			while(resultSet.next()) {
				Colaborador colaborador = new Colaborador(resultSet.getString("nome"),resultSet.getInt("id"));
				listaPesquisada.add(colaborador);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
		
	}

	@Override
	public Colaborador Consultar(int id) throws SQLException {
		query = "select * from colaborador where id =?";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			
			resultSet.next(); 
			Colaborador colaborador = new Colaborador(resultSet.getString("nome"),resultSet.getInt("id"));
			
			
			return colaborador;
			
		}catch(SQLException e) {
			throw e;
		}
		
	}

	@Override
	public void excluir(int id) throws SQLException {
		query = "delete  from colaborador where id = ?";
		try{
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			this.conexao.commit();
			}catch(SQLException e){
				this.conexao.rollback();
				throw e;
			}
		
	}
	
	/*funcao criada para mostrar somente colaboradores sem tarefa com o 
	 * objetivo de chamá-la na tela de exclusão de colaborador
	 * porque não pode excluir um colaborador que tenha tarefa
	*/
	@Override
	public List<Colaborador> consultarTodosColaboradoresSemTarefa() throws SQLException {
		query = "select * from colaborador c where id not in (select idColaborador from tarefa t)";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Colaborador>listaPesquisada= new ArrayList<>();
			while(resultSet.next()) {
				Colaborador colaborador = new Colaborador(resultSet.getString("nome"),resultSet.getInt("id"));
				listaPesquisada.add(colaborador);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
		
	}

}
