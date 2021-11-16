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
public class Usuario extends Pessoas {
 
  String tipo_usuario;

    public Usuario(String tipo_usuario, String nome, int idade) {
        super(nome, idade);
        this.tipo_usuario = tipo_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
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
