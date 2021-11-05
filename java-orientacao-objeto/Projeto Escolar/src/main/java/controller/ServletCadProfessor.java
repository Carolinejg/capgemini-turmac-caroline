package controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProfessorDAO;
import model.Professor;


@WebServlet(urlPatterns = {"/cadProfessor"})
public class ServletCadProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String nomeProfessor = request.getParameter("nome_prof");
					
			boolean ativo = Boolean.parseBoolean((request.getParameter("ativo")!=null?"true":"false"));
			Professor professor = new Professor(nomeProfessor,ativo);
			ProfessorDAO  professorDAO = new ProfessorDAO();
			professorDAO.incluir(professor);
			// mostrar alertas para ações executadas pelo servlet
			String html = "<script>alert(\"Você cadastro com sucesso!\");window.location.href =\"http://localhost:8080/Projeto_Escolar/\"</script>";
			response.getWriter().write(html);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
			
			
	}

}
