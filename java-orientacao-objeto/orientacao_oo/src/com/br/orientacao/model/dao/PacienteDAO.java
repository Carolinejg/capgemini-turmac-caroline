package com.br.orientacao.model.dao;

import java.util.ArrayList;
import com.br.orientacao.desafio.Consulta;




public class PacienteDAO {
	ArrayList<Consulta>listaConsultas = new ArrayList<Consulta>();
	
	
	
	public PacienteDAO() {
		
	}



	public void marcarConsulta(Consulta consulta) {
		this.listaConsultas.add(consulta);
	}
	
	public void pesquisarPorPaciente(int id) {
		
         for(Consulta item:listaConsultas) {
        	 if(item.getPaciente().getCodigo() == id) {
        		System.out.println(item);
         		break;
     		}
    		
    	}
    }

}
