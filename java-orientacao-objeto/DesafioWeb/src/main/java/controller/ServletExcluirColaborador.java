package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ColaboradorDAO;


@WebServlet(urlPatterns = {"/excluirColaborador"})
public class ServletExcluirColaborador extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int idColaborador= Integer.parseInt(request.getParameter("idColaborador"));
			ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
			colaboradorDAO.excluir(idColaborador);
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String html = "<script>alert(\"Você excluiu com sucesso!\");window.location.href =\"http://localhost:8080/DesafioWeb/view/excluirColaborador.jsp\"</script>";
		response.getWriter().write(html);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
	}
	

}
