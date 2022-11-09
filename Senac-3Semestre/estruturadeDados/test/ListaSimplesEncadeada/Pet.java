/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimplesEncadeada;

/**
 *
 * @author erick.nsilva2
 */
public class Pet {

    // Atributos
    private String especie;
    private String nome;
    private int idade;

    public Pet() { // Contrutor 

    }

    public Pet(String nome) {
        this.nome = nome;
    }

    public Pet(String especie, String nome, int idade) {
        super();
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    // METODOS
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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

    // METODO
    @Override
    public String toString() {
        return "Classe Pet especie: " + especie + ", nome: " + nome + ","
                + " idade: " + idade;
    }

}
