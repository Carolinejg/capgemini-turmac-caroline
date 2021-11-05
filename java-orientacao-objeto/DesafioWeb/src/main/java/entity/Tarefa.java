package entity;

import java.util.Date;

public class Tarefa {
	public int id;
    public int idColaborador;
    public String descrTarefa;
    public java.util.Date dataHoraInicio;
    public java.util.Date dataHoraFim;
    public String statusTarefa;
    public String prioridadeTarefa;
    
    
	public Tarefa(int idColaborador, String descrTarefa, Date dataHoraInicio, Date dataHoraFim,
			String statusTarefa, String prioridadeTarefa) {
		
		this.idColaborador = idColaborador;
		this.descrTarefa = descrTarefa;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.statusTarefa = statusTarefa;
		this.prioridadeTarefa = prioridadeTarefa;
	}
	
	public Tarefa(int id,int idColaborador, String descrTarefa, Date dataHoraInicio, Date dataHoraFim,
			String statusTarefa, String prioridadeTarefa) {
		
		this.idColaborador = idColaborador;
		this.descrTarefa = descrTarefa;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.statusTarefa = statusTarefa;
		this.prioridadeTarefa = prioridadeTarefa;
		this.id=id;
	}
	
	public Tarefa() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getDescrTarefa() {
		return descrTarefa;
	}

	public void setDescrTarefa(String descrTarefa) {
		this.descrTarefa = descrTarefa;
	}

	public java.util.Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(java.util.Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public java.util.Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(java.util.Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public String getStatusTarefa() {
		return statusTarefa;
	}

	public void setStatusTarefa(String statusTarefa) {
		this.statusTarefa = statusTarefa;
	}

	public String getPrioridadeTarefa() {
		return prioridadeTarefa;
	}

	public void setPrioridadeTarefa(String prioridadeTarefa) {
		this.prioridadeTarefa = prioridadeTarefa;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", idColaborador=" + idColaborador + ", descrTarefa=" + descrTarefa
				+ ", dataHoraInicio=" + dataHoraInicio + ", dataHoraFim=" + dataHoraFim + ", statusTarefa="
				+ statusTarefa + ", prioridadeTarefa=" + prioridadeTarefa + "]";
	}
	
	    
    

}
