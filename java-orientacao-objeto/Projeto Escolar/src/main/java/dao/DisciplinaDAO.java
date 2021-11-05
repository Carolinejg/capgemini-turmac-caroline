package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Disciplina;
import util.ConexaoMysql;

public class DisciplinaDAO implements DAOGenerico<Disciplina> {
	private ConexaoMysql conexao;
	private String query= "";
	
	public DisciplinaDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}

	@Override
	public void incluir(Disciplina t) throws SQLException {
		query = "insert into disciplina(codProfessor,descDisciplina,cargaHoraria,ativa)value(?,?,?,?)";
		try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setInt(1, t.getCodProfessor());
        	stmt.setString(2, t.getDescDisciplina());
        	stmt.setInt(3, t.getCargaHoraria());
        	stmt.setBoolean(4, t.isAtiva());
        	
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	System.out.println(e);
        	
        }
		
	}

	@Override
	public void alterar(Disciplina t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Disciplina> consultarTodos() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Disciplina Consultar(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	

}
