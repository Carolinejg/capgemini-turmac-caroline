package com.br.orientacao.model.entity;

public class Morcego extends Animal{
	public Morcego(String nomeAnimal, String raca, String cor,String sexo) {
		super(nomeAnimal, "Morcego",raca,cor,sexo,true);
	}
	
	@Override // -- estou sobrescrevendo o metodo da minha SUPER CLASS | classe mae
    public String toString() {
        return "Morcego{" +
                " de raça " + this.raca +
                " e tem a cor " + this.cor +
                " com o nome de " + this.nomeAnimal +
                " }";
    }
	
	@Override
	 public String isAdulto() {
		if(isVivo()) {
			if(idadeMeses > 24){
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
