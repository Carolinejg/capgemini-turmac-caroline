package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.TarefaDAO;

@WebServlet(urlPatterns = {"/excluirTarefa"})
public class ServletExcluirTarefa extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entrou no servlet");
		try {
			int idTarefa= Integer.parseInt(request.getParameter("idTarefa"));
			TarefaDAO tarefaDAO = new TarefaDAO();
			tarefaDAO.excluir(idTarefa);
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String html = "<script>alert(\"Você excluiu com sucesso!\");window.location.href =\"http://localhost:8080/DesafioWeb/view/excluirTarefa.jsp\"</script>";
		response.getWriter().write(html);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
	}
	
}
