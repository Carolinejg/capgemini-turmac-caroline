package com.br.orientacao.desafio;



public class Consulta {
	private Paciente paciente;
	private Dentista dentista;
	private String data;
	
	
	public Consulta(Paciente paciente, Dentista dentista, String data) {
		this.paciente = paciente;
		this.dentista = dentista;
		this.data = data;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Dentista getDentista() {
		return dentista;
	}
	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Consulta [paciente=" + paciente.getNome() + ", dentista=" + dentista.getNome() + ", data=" + data + "]";
	}
	
	
	
	

}
