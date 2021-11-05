package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import util.ConexaoMysql;

public class AlunoDAO implements DAOGenerico<Aluno> {
	private ConexaoMysql conexao;
	private String query= "";
	
	public AlunoDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}
	@Override
	public void incluir(Aluno t) throws SQLException {
		query = "insert into aluno(nome,cpf,dataNascimento,dataMatricula,nomePai,nomeMae,responsavel,"
				+ "foneResponsavel,matriculado)value(?,?,?,?,?,?,?,?,?)";
		try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setString(1, t.getNomeAluno());
        	stmt.setString(2, t.getCpfAluno());
        	stmt.setDate(3, new java.sql.Date(t.getDataNascimento().getTime()));
        	stmt.setDate(4, new java.sql.Date(t.getDataMatricula().getTime()));
        	stmt.setString(5, t.getNomePai());
        	stmt.setString(6, t.getNomeMae());
        	stmt.setString(7, t.getResponsavel());
        	stmt.setString(8, t.getFoneResponsavel());
        	stmt.setBoolean(9, t.isMatriculado());
        	
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	System.out.println(e);
        	
        }
		
	}

	@Override
	public void alterar(Aluno t) throws SQLException {
		query = "update aluno set nome=?, cpf= ?,dataNascimento= ?,dataMatricula=?,"
				+ "nomePai = ?,nomeMae=?,responsavel=?,foneResponsavel=?,matriculado=? where codigo = ?";
		try{
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			
			stmt.setString(1, t.getNomeAluno());
        	stmt.setString(2, t.getCpfAluno());
        	stmt.setDate(3, new java.sql.Date(t.getDataNascimento().getTime()));
        	stmt.setDate(4, new java.sql.Date(t.getDataMatricula().getTime()));
        	stmt.setString(5, t.getNomePai());
        	stmt.setString(6, t.getNomeMae());
        	stmt.setString(7, t.getResponsavel());
        	stmt.setString(8, t.getFoneResponsavel());
        	stmt.setBoolean(9, t.isMatriculado());
        	stmt.setInt(10, t.getCodAluno());
        	
			stmt.executeUpdate();
			this.conexao.commit();
			}catch(SQLException e){
				this.conexao.rollback();
				throw e;
			}
		
	}

	@Override
	public List<Aluno> consultarTodos() throws SQLException {
		query = "select * from aluno";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Aluno>listaPesquisada= new ArrayList<>();
				
			while(resultSet.next()) {
				Aluno aluno = new Aluno(resultSet.getInt("codigo"),resultSet.getString("nome"),
						resultSet.getString("cpf"),resultSet.getDate("dataNascimento"),
						resultSet.getDate("dataMatricula"),resultSet.getString("nomePai"),
						resultSet.getString("nomeMae"),resultSet.getString("responsavel"),
						resultSet.getString("foneResponsavel"),resultSet.getBoolean("matriculado"));
				listaPesquisada.add(aluno);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
	}

	@Override
	public Aluno Consultar(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
}
