package dao;

import java.sql.SQLException;
import java.util.List;



public interface DAOGenerico<T> {
	void incluir(T t) throws SQLException;
	void alterar(T t) throws SQLException;
	List<T> consultarTodos() throws SQLException;
	T Consultar(int id) throws SQLException ;
	void excluir(int id) throws SQLException;
	List<T> consultarTodosColaboradoresSemTarefa() throws SQLException;
}
