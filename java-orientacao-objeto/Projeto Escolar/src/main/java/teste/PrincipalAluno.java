package teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.AlunoDAO;
import model.Aluno;

public class PrincipalAluno {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		// int codAluno,String nomeAluno,String cpfAluno,java.util.Date dataNascimento,java.util.Date dataMatricula
		//String nomePai,String nomeMae,String responsavel,String foneResponsavel,boolean matriculado */
		
		//INCLUIR
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataNascimento,dataMatricula;
		
		dataNascimento = "13/12/2021";
		dataMatricula= "14/12/2021";
		java.util.Date dataFormatadaNascimento = formato.parse(dataNascimento);
		java.util.Date dataFormatadaMatricula = formato.parse(dataMatricula);
		
		
		Aluno aluno = new Aluno("infenro",null,dataFormatadaNascimento,dataFormatadaMatricula,
				"gildasio","jucirene","mae","7437434734",true);
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.incluir(aluno);
		
		//ALTERAR
		/*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataNascimento,dataMatricula;
		
		dataNascimento = "15/04/1996";
		dataMatricula= "20/12/2021";
		java.util.Date dataFormatadaNascimento = formato.parse(dataNascimento);
		java.util.Date dataFormatadaMatricula = formato.parse(dataMatricula);
		
		Aluno aluno = new Aluno(1,"caroline","7777",dataFormatadaNascimento,dataFormatadaMatricula,
				"gildasio fernandes","jucirene souza","mainha","71082609599",false);
		
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.alterar(aluno);*/
		
		//CONSULTAR TODOS
		/*AlunoDAO alunoDAO = new AlunoDAO();
		System.out.println(alunoDAO.consultarTodos().toString());*/
		
		//Alterar status aluno
		
		//AlunoDAO alunoDAO = new AlunoDAO();
		//alunoDAO.alterarStatusAluno(1, true);//true salva como 1 no banco
		
	}

}
