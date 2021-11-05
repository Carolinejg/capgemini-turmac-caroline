package com.br.orientacao.desafio.atividade_hotel.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hotel {
	private int numQuarto;
	private java.util.Date dataEntrada;
	private java.util.Date  dataSaida;
	
	public Hotel(int numQuarto, Date dataEntrada, Date dataSaida) {
		this.numQuarto = numQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public String getDataEntrada() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatadaAtual = dateFormat.format(dataEntrada);
	    return dataFormatadaAtual;
	}

	public void setDataEntrada(java.util.Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatadaAtual = dateFormat.format(dataSaida);
	    return dataFormatadaAtual;
	}

	public void setDataSaida(java.util.Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	@Override
	public String toString() {
		return "Hotel [numQuarto=" + numQuarto + ", dataEntrada=" + getDataEntrada() + ", dataSaida=" + getDataSaida() + "]";
	}
	
	
	
	
	
	
}
