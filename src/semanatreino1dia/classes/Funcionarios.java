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
public class Funcionarios extends Pessoas {
    
  String morada;
  String cargo;
  Usuario Adiconado_por;

    public Funcionarios(String morada, String cargo, String nome, int idade) {
        super(nome, idade);
        this.morada = morada;
        this.cargo = cargo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getAdiconado_por() {
        return Adiconado_por;
    }

    public void setAdiconado_por(Usuario Adiconado_por) {
        this.Adiconado_por = Adiconado_por;
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
