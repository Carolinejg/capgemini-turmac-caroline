package com.br.orientacao.desafio.atividade_conta.entity;

public class Conta {
	private int numero;
	private String titular;
	private double valor;
	
	public Conta(int numero, String titular, double valor) {
		this.numero = numero;
		this.titular = titular;
		this.valor = valor;
	}
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.valor= 0.0;
	}
	
	public Conta() {
		
	}
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
	

}
