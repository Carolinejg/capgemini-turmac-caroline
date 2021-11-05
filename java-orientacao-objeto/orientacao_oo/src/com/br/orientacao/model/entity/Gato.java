package com.br.orientacao.model.entity;

public class Gato extends Animal{

    public Gato (String nomeAnimal, String cor,String sexo){
        super(nomeAnimal,"Gato","Siames",cor,sexo,true);
    }
    
    @Override
	 public String isAdulto() {
		if(isVivo()) {
			if(idadeMeses > 12){
				return "Adulto";
			}
			return "Filhote";
		}
		return "Animal morto";
	 }
    
    @Override
    public String emitirSom() {
    	if(isVivo()) {
    		return "cof cof";
    	}
    	else return "Animal morto";
    }
    
    
}