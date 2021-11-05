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

import dao.TarefaDAO;
import entity.Tarefa;


@WebServlet(urlPatterns = {"/cadTarefa"})
public class ServletCadTarefa extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			int idColaborador= Integer.parseInt(request.getParameter("colaborador_select"));
			String descricao = request.getParameter("nome_desc");
			
			
			String adataInicio = request.getParameter("dataInicio");
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		    Date inicioDate = formatter.parse(adataInicio);
		    
		    System.out.println("data inicio " + inicioDate);
		    
		    String adataFinal = request.getParameter("dataFinal");
			Date finalDate = formatter.parse(adataFinal);
			
			String status = request.getParameter("status_selected");
			String prioridade = request.getParameter("prioridade_select");
		    
			Tarefa tarefa = new Tarefa(idColaborador,descricao,inicioDate,finalDate,status,prioridade);
			TarefaDAO taredaDAO = new TarefaDAO();
			
			System.out.println("data inicio dentro de tarefa "+ tarefa.getDataHoraInicio());
			taredaDAO.incluir(tarefa);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
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
