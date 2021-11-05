package teste;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.TarefaDAO;
import entity.Tarefa;

public class PrincipalTarefa {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		//idColaborador,descrTarefa,dataHoraInicio,	dataHoraFim,statusTarefa,prioridadeTarefa
		//
		//TESTANDO INCLUIR
		
		/*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataEntrada,dataSaida;
		
		dataEntrada = "13/12/2021";
		dataSaida= "14/12/2021";
		java.util.Date dataFormatadaEntrada = formato.parse(dataEntrada);
		java.util.Date dataFormatadaSaida = formato.parse(dataSaida);
		//Tarefa tarefa = new Tarefa(3,"analisar",dataFormatadaEntrada,dataFormatadaSaida,"pendente","alta");
		Tarefa tarefa = new Tarefa(4,"analisar",dataFormatadaEntrada,dataFormatadaSaida,"pendente","alta");
		TarefaDAO tarefaDAO = new TarefaDAO();
		tarefaDAO.incluir(tarefa);*/
		
		/*//TESTANDO UPDATE
		//idColaborador,descrTarefa,dataHoraInicio,	dataHoraFim,statusTarefa,prioridadeTarefa
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataEntrada,dataSaida;
		dataEntrada = "20/12/2021";
		dataSaida= "21/12/2021";
		java.util.Date dataFormatadaEntrada = formato.parse(dataEntrada);
		java.util.Date dataFormatadaSaida = formato.parse(dataSaida);
		Tarefa tarefa = new Tarefa(1,4,"analisar a tarefa",dataFormatadaEntrada,dataFormatadaSaida,"feito","pouca");
		TarefaDAO tarefaDAO = new TarefaDAO();
		tarefaDAO.alterar(tarefa);*/
		
		//deletando
		//TarefaDAO tarefaDAO = new TarefaDAO();
		//tarefaDAO.excluir(1);
		
		//consultando todos 
		/*TarefaDAO tarefaDAO = new TarefaDAO();
		System.out.println(tarefaDAO.consultarTodos());*/
		
		// consultar um 
		TarefaDAO tarefaDAO = new TarefaDAO();
		System.out.println(tarefaDAO.Consultar(2));
		Tarefa tarefa = new Tarefa();
		tarefa.getIdColaborador();
	}

}
