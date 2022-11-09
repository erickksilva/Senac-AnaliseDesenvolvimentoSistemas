/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author erick.nsilva2
 */
public class Pessoa {

     String nome;
     String endereco;
     int idade;
     
     Pessoa(){
         
     }

    Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void getNome() {
        System.out.println("Nome: " + this.nome);
    }

}
