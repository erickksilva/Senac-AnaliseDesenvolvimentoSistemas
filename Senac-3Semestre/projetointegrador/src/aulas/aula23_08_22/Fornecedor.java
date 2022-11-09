/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula23_08_22;

/**
 *
 * @author erick.nsilva2
 */
public class Fornecedor {

    private String nome;
    private String fone;

    Fornecedor() {

    }

    Fornecedor(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
}
