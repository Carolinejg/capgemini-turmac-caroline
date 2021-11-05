package com.br.orientacao.model.entity;

public class Girafa extends Animal{
/*
a herança sempre extende de uma classe mais generico para um mais especifico, com o uso da heranca é possivel o uso de metodos da classe mais geral
 */
    // o construtor está setando um atributo para um valor padrao, que no caso é a espécie
    // o super será responsavel por fazer referencia a classe mais geral explicitando os atributos que serao reutilizados nessa classe
    
	public Girafa(String nomeAnimal, String raca, String cor, String sexo){
        super (nomeAnimal, "Girafa", raca, cor,sexo,true);

    }
    @Override
    public String toString() {
        return "O tostring da girafa";

    }
    @Override
	 public String isAdulto() {
		if(isVivo()) {
			if(sexo.equals("Femea" )&& idadeMeses >=36){
				return "Adulto";
			}else if(sexo.equals("Macho")&& idadeMeses >=48){
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
