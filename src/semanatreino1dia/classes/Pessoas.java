/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semanatreino1dia.classes;

/**
 *
 * @author evandroarmando
 */
public abstract class Pessoas {
    
   String nome;
   int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   
   
   
    
}
