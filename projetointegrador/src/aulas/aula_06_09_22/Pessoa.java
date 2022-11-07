/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_06_09_22;

/**
 *
 * @author erick.nsilva2
 */
public class Pessoa {

    private String nome, endereco, telefone;
    private int idade;

    public Pessoa(String nome, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa " + "nome = " + nome + ", endereco = " + endereco
                + ", telefone = " + telefone + ", idade = " + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String args[]) {
        Pessoa p = new Pessoa("Leandro", 25, "Rua XV", "2586-3247");
        String str = p.toString();

        System.out.println(str + "\n");
//        System.out.println(p);
    }
}
