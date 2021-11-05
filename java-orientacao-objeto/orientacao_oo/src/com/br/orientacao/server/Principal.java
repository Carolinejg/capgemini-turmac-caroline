package com.br.orientacao.server;
import com.br.orientacao.model.entity.Animal;
import com.br.orientacao.model.entity.Girafa;


public class Principal {

    /*caracteristicas de objetos:
        inicia com letra MAIUSCULA e em caso de nome composto separa por CamelCase (ex: AlunoEndereco)
        propriedades|atributos
        possui metodos (funcoes ou procedimentos)
        pode criar novos objetos sem sobreescrever os atuais
        convencao de nomeacao de variaveis: incia com letra minuscula e caso seja nome composto usar a inicial maiuscula para cada nome (ex: nomeAnimal)
        convencao de criacao de pacotes: na pasta src > com > br > nomeprojeto
      *O padrão de projetos que será usado será o MVC (model-view-controller)
        o model|enities|entidades pode ser uma classe que espelha uma tabela no banco, serao classes que armazenam dados e sao persistidas no banco


     */
    public static void main(String[] args) {
        
        //System.out.println("Eu tenho um "+ especie+" o nome dele é: "+nomeAnimal+", ele é um " + raca + " e sua cor é "+cor);

        // aqui ao invés de declarar a variavel e executar, foi criada uma variavel do tipo animal que é uma classe
       /*Animal novoAnimal = new Animal();
        novoAnimal.setNomeAnimal ("bob");
        novoAnimal.setEspecie("cachorro");
        novoAnimal.setEspecie("vira lata");
        novoAnimal.setCor("caramelo");

        Animal novoAnimal2 = new Animal();
        novoAnimal2.setNomeAnimal("Gigi");
        novoAnimal2.setEspecie("girafa");
        novoAnimal2.setRaca("pinscher");
        novoAnimal2.setCor("malhadinha");*/

        //instanciando o objetos com o uso de construtor personalizado
        /*Animal gato = new Animal("Gilbert", "gato", "vira-lata", "amarelo");
        Animal rato = new Animal ("Jerry", "rato", "gabiru", "cinza");

        //System.out.println(novoAnimal2);
        //System.out.println(novoAnimal);
        //System.out.println(gato);
        //System.out.println(rato);

        
        Animal g3 = new Girafa("Girassol", "Girafa do sul", "Amarela e marrom");
        //g2.setNomeAnimal("Nelman");
        //g2.setEspecie("Masai");
        //System.out.println(g2);
        //System.out.println(g3);

        Animal gatoNovo = new Gato("Vinicius", "Cinza");
        System.out.println(gatoNovo);
        Animal gatinhoFilhote = new Gato("Oliver", "Branco");
        System.out.println(gatinhoFilhote);*/
        Animal g2 = new Girafa("Melman", "Masai", "Amarelo e marrom","Femea");
        System.out.println(g2.emitirSom());
        System.out.println(g2.toString());
        g2.setIdadeMeses(14);
        
        /*Animal m = new Morcego("nome","raca","cor");
        g2.setIdadeMeses(12);
        System.out.println("Idade:"+ g2.getIdadeMeses());*/
        
        
    }
}