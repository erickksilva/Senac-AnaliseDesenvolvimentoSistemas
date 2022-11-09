/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22;

/**
 *
 * @author erick.nsilva2
 */
public class Pessoa {

    private String nome, rg;

    public Pessoa(String nome, String id) {
        this.nome = nome;
        this.rg = id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pessoa) {
            Pessoa p = (Pessoa) obj;
            if (this.getNome().equals(p.getNome())
                    && this.getRg().equals(p.getRg())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String id) {
        this.rg = id;
    }

}
