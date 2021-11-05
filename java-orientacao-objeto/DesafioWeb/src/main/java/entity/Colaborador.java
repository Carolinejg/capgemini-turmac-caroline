package entity;

public class Colaborador {
	 private int idColaborador;
	 private String nomeColaborador;
	 
	 
	public Colaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	
	public Colaborador(String nome, int id) {
		this.nomeColaborador=nome;
		this.idColaborador=id;
		
	}
	
	public Colaborador() {
		
		
	}

	public int getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getNomeColaborador() {
		return nomeColaborador;
	}

	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}

	@Override
	public String toString() {
		return "Colaborador [idColaborador=" + idColaborador + ", nomeColaborador=" + nomeColaborador + "]";
	}
	
	
	
	 
	 
	 

}
