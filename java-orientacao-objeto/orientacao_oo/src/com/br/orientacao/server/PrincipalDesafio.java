package com.br.orientacao.server;

import java.util.Scanner;

import com.br.orientacao.desafio.Consulta;
import com.br.orientacao.desafio.Dentista;
import com.br.orientacao.desafio.Paciente;
import com.br.orientacao.model.dao.PacienteDAO;


public class PrincipalDesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int opcao = -1;
		int opcaoSub = -1;
	
			
			do {
				System.out.println("\n\n##########################################################");
				System.out.println("\n                  =========================");
				System.out.println("                  |     1 - Paciente         |");
				System.out.println("                  |     2 - Dentista         |");
				System.out.println("                  |     0 - Sair             |");
				System.out.println("                  =========================\n");

				opcao = src.nextInt();
				System.out.print("\n");
				PacienteDAO pacienteDAO = new PacienteDAO();
				switch (opcao) {
				case 1:
					System.out.println("\n\n#########################################################");
					System.out.println("\n                  =========================  |");
					System.out.println("                  |     1 - Marcar Consulta    |");
					System.out.println("                  |     2 - Consultar consultas|");
					System.out.println("                  |     0 - Sair             |");
					opcaoSub = src.nextInt();
					
					if(opcaoSub==1) {
						//criando um paciente 
						System.out.println("Nome do paciente\n");
						String nomePaciente = src.next();
						System.out.println("Código do paciente\n");
						int codigo = src.nextInt();
						System.out.println("Sobrenome do paciente\n");
						String sobrenomePaciente = src.next();
						System.out.println("Idade do paciente\n");
						int idade = src.nextInt();
						System.out.println("Sexo do paciente\n");
						char sexo = src.next().charAt(0);
						System.out.println("Telefone do paciente\n");
						int telefone = src.nextInt();
						System.out.println("Endereço do paciente\n");
						String endereco= src.next();
						
						Paciente paciente = new Paciente(nomePaciente,codigo,sobrenomePaciente,idade,sexo,telefone,endereco);
						
						System.out.println("Nome do dentista\n");
						String nomeDentista = src.next();
						System.out.println("Sobrenome do dentista\n");
						String sobrenomeDentista = src.next();
						System.out.println("Especialidade do dentista\n");
						String especialidade = src.next();
						System.out.println("Registro do dentista\n");
						int registro = src.nextInt();
						System.out.println("Ativo?\n");
						boolean ativo = src.nextBoolean();
						
						Dentista dentista = new Dentista(nomeDentista,sobrenomeDentista,especialidade,registro,ativo);
						System.out.println("Data da consulta\n");
						String data = src.next();
						Consulta consulta= new Consulta(paciente,dentista,data);
						
						
						pacienteDAO.marcarConsulta(consulta);
						System.out.println("Consulta marcada com sucesso!\n");
						break;
					}
				if(opcaoSub==2) {
					System.out.println("Código do paciente\n");
					int codigo = src.nextInt();
					pacienteDAO.pesquisarPorPaciente(codigo);
					System.out.println("Pesquisa realizada com sucesso!\n");
					break;
					
				}
					
				case 2:
					
					break;
		                   
				case 5:
					
					break;
				case 0:
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
				}
			} while (opcao != 0);
		
		
		
		
		
		src.close();

	}

}
