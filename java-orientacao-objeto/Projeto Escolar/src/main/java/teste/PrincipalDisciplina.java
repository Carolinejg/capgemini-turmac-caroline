package teste;

import java.sql.SQLException;

import dao.DisciplinaDAO;
import model.Disciplina;

public class PrincipalDisciplina {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//private int codProfessor; private String descDisciplina; private int cargaHoraria;private boolean ativa;
		Disciplina disciplina = new Disciplina(1,"biologia",5,true);
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		disciplinaDAO.incluir(disciplina);

	}

}
