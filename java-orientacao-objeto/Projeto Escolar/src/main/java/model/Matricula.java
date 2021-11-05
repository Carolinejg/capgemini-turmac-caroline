package model;

import java.util.Date;

public class Matricula {
	private int codMatricula;
	private int codAluno;
	private int codDisciplina;
	private java.util.Date dataMatricula;
	
	//todos
	public Matricula(int codMatricula, int codAluno, int codDisciplina, Date dataMatricula) {
		this.codMatricula = codMatricula;
		this.codAluno = codAluno;
		this.codDisciplina = codDisciplina;
		this.dataMatricula = dataMatricula;
	}

	public int getCodMatricula() {
		return codMatricula;
	}

	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public java.util.Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(java.util.Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	@Override
	public String toString() {
		return "Matricula [codMatricula=" + codMatricula + ", codAluno=" + codAluno + ", codDisciplina=" + codDisciplina
				+ ", dataMatricula=" + dataMatricula + "]";
	}
	
	
}
