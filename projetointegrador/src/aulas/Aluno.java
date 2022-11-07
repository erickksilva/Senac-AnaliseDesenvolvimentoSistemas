/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author erick.nsilva2
 */
public class Aluno {

    private String nome;
    private String turma;

    String getNome() {
        return this.nome;
    }

    String getTurma() {
        return this.turma;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setTurma(String turma) {
        this.turma = turma;
    }

    void boasvindas() {
        System.out.println("Seja Bem-vindo! " + getNome() + ", a sua turma é " + getTurma());
    }

}
