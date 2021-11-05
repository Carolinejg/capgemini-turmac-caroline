package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ColaboradorDAO;
import entity.Colaborador;

@WebServlet(urlPatterns = {"/alterarColaborador"})
public class ServletAlterarColaborador extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
					
			int idColaborador= Integer.parseInt(request.getParameter("idColaborador"));
			String nome = request.getParameter("nome_cad");
			Colaborador colaborador = new Colaborador(nome,idColaborador);
			ColaboradorDAO colaboradorDAO;
			colaboradorDAO = new ColaboradorDAO();
			colaboradorDAO.alterar(colaborador);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		String html = "<script>alert(\"Você alterou com sucesso!\");window.location.href =\"http://localhost:8080/DesafioWeb/view/alterarColaborador.jsp\"</script>";
		response.getWriter().write(html);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
	}
	
}
