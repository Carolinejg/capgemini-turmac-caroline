package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;

import dao.AlunoDAO;




@WebServlet(urlPatterns = {"/cadAluno"})
public class ServletCadAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {
		
		String nomeAluno = request.getParameter("nome_aluno");
		String cpf = request.getParameter("cpf");
		
		String dataNasc = request.getParameter("dataNasc");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dataNascDate = formatter.parse(dataNasc);
	        
	    String dataMat = request.getParameter("dataMat");
	    Date dataMatDate = formatter.parse(dataMat);
	    
		String nomePai = request.getParameter("nome_pai");
		String nomeMae = request.getParameter("nome_mae");
		String responsavel = request.getParameter("nome_resp");
		String telefone = request.getParameter("celular");
		
		boolean matric = Boolean.parseBoolean((request.getParameter("matriculaddo")!=null?"true":"false"));
		Aluno aluno = new Aluno(nomeAluno,cpf,dataNascDate,dataMatDate,nomePai,nomeMae,responsavel,telefone,matric);
		AlunoDAO  alunoDAO = new AlunoDAO();
		
		alunoDAO.incluir(aluno);
		
		// mostrar alertas para ações executadas pelo servlet
		String html = "<script>alert(\"Você cadastro com sucesso!\");window.location.href =\"http://localhost:8080/Projeto_Escolar/\"</script>";
		response.getWriter().write(html);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}


	

}
