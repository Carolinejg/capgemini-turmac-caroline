package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Tarefa;
import util.ConexaoMysql;

public class TarefaDAO implements DAOGenerico<Tarefa>{
	ArrayList<Tarefa>listaTarefas = new ArrayList<Tarefa>();
	private ConexaoMysql conexao;
	private String query= "";
	
	public TarefaDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}

	@Override
	public void incluir(Tarefa t) throws SQLException {
		query = "insert into tarefa(idColaborador,descrTarefa,dataHoraInicio,dataHoraFim,statusTarefa,prioridadeTarefa)value(?,?,?,?,?,?)";
		try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setInt(1, t.getIdColaborador());
        	stmt.setString(2, t.getDescrTarefa());
        	stmt.setDate(3, new java.sql.Date(t.getDataHoraInicio().getTime()));
        	stmt.setDate(4, new java.sql.Date(t.getDataHoraFim().getTime()));
        	stmt.setString(5, t.getStatusTarefa());
        	stmt.setString(6, t.getPrioridadeTarefa());
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	
        }
		
	}

	@Override
	public void alterar(Tarefa t) throws SQLException {
		//idColaborador,descrTarefa,dataHoraInicio,dataHoraFim,statusTarefa,prioridadeTarefa
				query = "update tarefa set idColaborador=?, descrTarefa= ?,dataHoraInicio= ?,dataHoraFim=?,"
						+ "statusTarefa = ?,prioridadeTarefa=? where id = ?";
				try{
					PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
					
					stmt.setInt(1, t.getIdColaborador());
					stmt.setString(2, t.getDescrTarefa());
					stmt.setDate(3, new java.sql.Date(t.getDataHoraInicio().getTime()));
		        	stmt.setDate(4, new java.sql.Date(t.getDataHoraFim().getTime()));
		        	stmt.setString(5, t.getStatusTarefa());
		        	stmt.setString(6, t.getPrioridadeTarefa());
		        	stmt.setInt(7, t.getId());
		        	
					stmt.executeUpdate();
					this.conexao.commit();
					}catch(SQLException e){
						this.conexao.rollback();
						throw e;
					}
		
	}

	@Override
	public List<Tarefa> consultarTodos() throws SQLException {
		query = "select * from tarefa";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Tarefa>listaPesquisada= new ArrayList<>();
			//idColaborador,descrTarefa,dataHoraInicio,dataHoraFim,statusTarefa,prioridadeTarefa
			while(resultSet.next()) {
				Tarefa tarefa = new Tarefa(resultSet.getInt("id"),resultSet.getInt("idColaborador"),
						resultSet.getString("descrTarefa"),resultSet.getDate("dataHoraInicio"),
						resultSet.getDate("dataHoraFim"),resultSet.getString("statusTarefa"),
						resultSet.getString("prioridadeTarefa"));
				listaPesquisada.add(tarefa);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
	}

	@Override
	public Tarefa Consultar(int id) throws SQLException {
		query = "select * from tarefa where id =?";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			
			resultSet.next(); 
			Tarefa tarefa = new Tarefa(resultSet.getInt("id"),resultSet.getInt("idColaborador"),
					resultSet.getString("descrTarefa"),resultSet.getDate("dataHoraInicio"),
					resultSet.getDate("dataHoraFim"),resultSet.getString("statusTarefa"),
					resultSet.getString("prioridadeTarefa"));
			
			
			return tarefa;
			
		}catch(SQLException e) {
			throw e;
		}
	}

	@Override
	public void excluir(int id) throws SQLException {
		query = "delete  from tarefa where id = ?";
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

	@Override
	public List<Tarefa> consultarTodosColaboradoresSemTarefa() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}
