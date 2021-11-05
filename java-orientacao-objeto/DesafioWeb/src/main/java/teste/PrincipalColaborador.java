package teste;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ColaboradorDAO;
import entity.Colaborador;

public class PrincipalColaborador {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Colaborador>listaPesquisada= new ArrayList<>();
		
		//Colaborador colaborador = new Colaborador("jose");
		ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
		/*listaPesquisada=colaboradorDAO.consultarTodos();
		for(int i =0; i<listaPesquisada.size();i++){
			System.out.println(listaPesquisada.get(i).getNomeColaborador());
			 
		}*/
		
		//colaboradorDAO.incluir(colaborador);
		System.out.println(colaboradorDAO.consultarTodos());
		//colaboradorDAO.alterar(colaborador);
		//Colaborador colaborador = new Colaborador("carlos");
		//colaboradorDAO.incluir(colaborador);
		//System.out.println(colaboradorDAO.consultarTodos());
		//System.out.println(colaboradorDAO.Consultar(1));
		//colaboradorDAO.excluir(2);
		//System.out.println(colaboradorDAO.consultarTodos());

	}

}
