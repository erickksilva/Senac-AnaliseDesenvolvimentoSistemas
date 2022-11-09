/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.meuteste;

/**
 *
 * @author erick.nsilva2
 */
public class Pessoa1 {

    private String nome;
    private String endereco;
    private int idade;

    Pessoa1(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    String getNome() {
        return this.nome;
    }

    String getEndereco() {
        return endereco;
    }

    int getIdade() {
        return idade;
    }

    void imprimirCaracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("Endereço: " + endereco);
    }

}
