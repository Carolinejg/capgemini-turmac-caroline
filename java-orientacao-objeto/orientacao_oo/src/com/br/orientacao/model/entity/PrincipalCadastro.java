package com.br.orientacao.model.entity;
import java.sql.SQLException;
import com.br.orientacao.model.dao.FornecedorDAO;




public class PrincipalCadastro {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		//Scanner src = new Scanner(System.in);
		
		//Produto p1 = new Produto("teste",8.50);
       

       //System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);
        //System.out.println(p4);

        //ProdutoDAO pDAO = new ProdutoDAO();
        //pDAO.salvarProduto(p1);
        
        Fornecedor f = new Fornecedor("testeatual","1234","719375438", null);
        FornecedorDAO fDAO= new FornecedorDAO();
        fDAO.update(f);
        //fDAO.save(f);
        //fDAO.delete("1234");
        //System.out.println(fDAO.findAll());
        
        
        
        //ProdutoDAO p = new ProdutoDAO();
        //p.delete("7684");
        //System.out.println(p.findAll());
        
        
       /* System.out.println("Antes do delete");
        pDAO.findAll();
        System.out.println();
      
        
        /*System.out.println("Qual deletar?\n");
        int item = src.nextInt();
        System.out.println("Depois do delete");
        pDAO.delete(item);//o array começa na posição 0 logo o elemento 2 será deletado
        pDAO.findAll();*/
        
        
        /*System.out.println("Qual pesquisar?\n");
        int item = src.nextInt();
        pDAO.pesquisaId(item);*/
        
        
        /*System.out.println("Qual alterar?\n");
        int item = src.nextInt();
        System.out.println("Qual código?\n");
        int codigoProduto = src.nextInt();
        System.out.println("Qual descricao?\n");
        String descricaoProduto = src.next();
        System.out.println("Qual preco?\n");
        double precoProduto = src.nextDouble();
        pDAO.alterarPorId(item,codigoProduto,descricaoProduto,precoProduto);*/
        //pDAO.alterarFixo();
        //src.close();
        
        
       

        

	}

}
