package model;

public class Professor {
	private int codProfessor;
	private String nomeProfessor;
	private boolean ativo;
	
	//todos
	public Professor(int codProfessor, String nomeProfessor, boolean ativo) {
		this.codProfessor = codProfessor;
		this.nomeProfessor = nomeProfessor;
		this.ativo = ativo;
	}
	
	public Professor() {
		
	}
	
	public Professor(String nomeProfessor, boolean ativo) {
		this.nomeProfessor = nomeProfessor;
		this.ativo = ativo;
	}

	public int getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(int codProfessor) {
		this.codProfessor = codProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Professor [codProfessor=" + codProfessor + ", nomeProfessor=" + nomeProfessor + ", ativo=" + ativo
				+ "]";
	}
	
	
	
	

}
