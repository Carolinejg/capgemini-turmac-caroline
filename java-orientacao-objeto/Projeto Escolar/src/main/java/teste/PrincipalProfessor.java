package teste;

import java.sql.SQLException;

import dao.ProfessorDAO;
import model.Professor;

public class PrincipalProfessor {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//incluir
		/*Professor professor = new Professor("Carlos",true);
		ProfessorDAO professorDAO = new ProfessorDAO();
		professorDAO.incluir(professor);*/
		
		//consulta todos 
		ProfessorDAO professorDAO = new ProfessorDAO();
		System.out.println(professorDAO.consultarTodos().toString());
				
	}

	

}
