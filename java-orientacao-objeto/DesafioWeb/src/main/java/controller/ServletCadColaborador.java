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

@WebServlet(name = "Cadastro", urlPatterns = {"/cadColaborador"})
public class ServletCadColaborador extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Colaborador colaborador = new Colaborador();
			colaborador.setNomeColaborador(request.getParameter("nome_cad"));
			ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
			colaboradorDAO.incluir(colaborador);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// mostrar alertas para ações executadas pelo servlet
		String html = "<script>alert(\"Você cadastro com sucesso!\");window.location.href =\"http://localhost:8080/DesafioWeb/\"</script>";
		response.getWriter().write(html);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
	}
	
	
	
}


