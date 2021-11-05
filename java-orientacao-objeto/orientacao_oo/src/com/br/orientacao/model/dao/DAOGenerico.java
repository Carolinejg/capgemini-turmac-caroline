package com.br.orientacao.model.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAOGenerico<T>{
	void save(T t) throws SQLException;
	List<T> findAll() throws SQLException;
	void delete(String id) throws SQLException;
	void update(T t) throws SQLException;
	T findById(int id) throws SQLException ;
}
