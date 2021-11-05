package com.br.orientacao.model.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.br.orientacao.model.entity.Produto;
import com.br.orientacao.infra.ConexaoMysql;

public class ProdutoDAO implements DAOGenerico<Produto> {
	ArrayList<Produto>listaProdutos = new ArrayList<Produto>();
	private ConexaoMysql conexao;
	private String query= "";

	public ProdutoDAO() throws SQLException, ClassNotFoundException{
		conexao = new ConexaoMysql();
	}
    public void salvarProduto(Produto produto) throws SQLException{
       query = "insert into produto(descricao,valor,id_fornecedor)value(?,?,5)";
        try {
        	PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
        	
        	stmt.setString(1, produto.getDescricaoProduto());
        	stmt.setDouble(2, produto.getPrecoProduto());
        	stmt.execute();
        	this.conexao.commit();
        }catch(SQLException e){
        	this.conexao.rollback();
        	throw e;
        }
    }

    public void pesquisaId(int id) {
    	for(Produto item: listaProdutos) {
    		if(item.getCodigoProduto() == id) {
    			System.out.println(item.toString());
        		break;
    		}
    	}
    }

	public void alterarPorId(int id, int codigoProduto,String descricaoProduto,double precoProduto) {
		for(Produto item: listaProdutos) {
    		if(item.getCodigoProduto() == id) {
    			item.setCodigoProduto(codigoProduto);
    			item.setDescricaoProduto(descricaoProduto);
    			item.setPrecoProduto(precoProduto);
    			System.out.println(item.toString());
        		break;
    		}
    	}
	}
	
	public void alterarFixo() {
		for(Produto item: listaProdutos) {
    		if(item.getCodigoProduto() == 3) {
    			item.setCodigoProduto(2000);
    			item.setDescricaoProduto("mudando fixo");
    			item.setPrecoProduto(20.00);
    			System.out.println(item.toString());
        		break;
    		}
    	}
	}
	@Override
	public void save(Produto t) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Produto> findAll() throws SQLException {
		query = "select descricao,codigo_produto,valor from produto";
		try {
			PreparedStatement stmt = this.conexao.getConnetion().prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			
			List<Produto>listaPesquisada= new ArrayList<>();
			while(resultSet.next()) {
				Produto p = new Produto(resultSet.getInt("codigo_produto"),resultSet.getString("descricao"),resultSet.getDouble("valor"));
				p.setCodigoProduto(resultSet.getInt("codigo_produto"));
				listaPesquisada.add(p);
			}
			return listaPesquisada;
			
		}catch(SQLException e) {
			throw e;
		}
	}
	@Override
	public void delete(String id) throws SQLException {
		query = "delete  from produto where codigo_produto = ?";
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
	public void update(Produto t) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Produto findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
