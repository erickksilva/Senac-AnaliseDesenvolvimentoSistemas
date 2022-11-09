/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_31_08_22;

import aula_24_08.*;

/**
 *
 * @author erick.nsilva2
 */
public class Pessoa {

    private String nome;
    private int idade;
    private int id;

    Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(int id, String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String toString() {
        return "ID: " + id + " Nome: " + nome + ", idade " + idade + " anos.";
    }

}
