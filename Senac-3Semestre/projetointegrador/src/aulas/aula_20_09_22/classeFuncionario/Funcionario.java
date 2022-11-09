/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22.classeFuncionario;

/**
 *
 * @author erick.nsilva2
 */
public class Funcionario {

    private String nome, telefone;
    private int idade;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Funcionario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //Toda vez que sobrescrever o metodo equals,
    //eh obrigado a sobrescrever o metodo hashCode
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Funcionario) {
//            Funcionario f = (Funcionario) obj;
//
//            if (this.getNome().equals(f.getNome())
//                    && this.getTelefone().equals(f.getTelefone())) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }
    //Deve ser rescrito toda vez que o metodo equals eh sobrescrito
//    @Override
//    public int hashCode() {
//        return this.telefone.hashCode() + this.nome.hashCode();
//    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome funcionario: " + nome + " Idade: " + idade;
    }

}
