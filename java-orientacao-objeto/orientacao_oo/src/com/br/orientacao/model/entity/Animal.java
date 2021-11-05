package com.br.orientacao.model.entity;

public abstract class Animal implements IAnimal{
    /*
     * 
    os objetos sao melhorias que permite as propriedades do objeto e visibilidade, isso garante um determinado tipo de acesso para cada objeto
    os tipos de visibilidade sao utilizadas para encapsular os atributos das classes (public, private, protected, default)
    de preferencia a visibilidade deve ser privada!!!
     */
    protected  String nomeAnimal;
    protected String especie;
    protected String raca;
    protected String cor;
    protected int idadeMeses;
    protected String sexo;
    private boolean vivo;//valor default é false 

    //construtor personalizado que inicializa as variáveis
    public Animal (String nomeAnimal, String especie, String raca, String cor,String sexo,boolean vivo){
        this.nomeAnimal= nomeAnimal;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.vivo=true;
    }
    

    //construtor default | padrao | vazio
    public Animal(){
        System.out.println("objeto construído animal");
        this.vivo=true;
    }


    // criando metodos para acessar esses atributos que agora estao privados.
    // para saber se é um metodo é so observar se ele termina com parenteses, sejam vazios ou nao

    public void setNomeAnimal(String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void setRaca (String raca){
        this.raca = raca;
    }

    public void setCor (String cor){
        this.cor = cor;
    }

    // criar metodos para devolver(visualizar) valores dos atributos que estao privados
    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public String getEspecie(){
        return especie;
    }

    public String getRaca(){
        return raca;
    }

    public String getCor(){
        return cor;
    }
   
    

    public int getIdadeMeses() {
		return idadeMeses;
	}

	public void setIdadeMeses(int idadeMeses) {
		this.idadeMeses = idadeMeses;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
    public String toString() {
        return "Eu tenho um(a) "+ 
        		this.especie +" o nome dele(a) é: "
        		+this.nomeAnimal+", ele é um(a) " 
        		+ this.raca + " e sua cor é "
        		+this.cor;

    }
	public void morrer() {
		this.vivo=false;
	}
	
	public boolean isVivo() {
		return vivo;
	}
	 
	
}