package com.br.orientacao.desafio.atividade_conta.dao;

import com.br.orientacao.desafio.atividade_conta.entity.Conta;

public class ContaDAO {
	
	public ContaDAO() {
		
	}
	
	public String cadastro(Conta conta) {
		return conta.toString();
	}
	
	public String alterarNome(Conta conta,String nome) {
		conta.setTitular(nome);
		return conta.toString();
	}
	
	public String depositar(Conta conta, double valor) {
		conta.setValor(conta.getValor()+valor);
		return "Dep�sito realizado com sucesso!\n"
				+ conta.toString();
		
	}
	
	public String sacar(Conta conta,double valor) {
		double diminuir = conta.getValor() - (valor + 5);
		if(conta.getValor()<valor) {
			return "Valor de saque inv�lido!\n"+
					"Saldo dispon�vel: " + conta.getValor();
		}
		conta.setValor(diminuir);
		return "Saque realizado com sucesso!\n"
		+ conta.toString();
		
	}

}
