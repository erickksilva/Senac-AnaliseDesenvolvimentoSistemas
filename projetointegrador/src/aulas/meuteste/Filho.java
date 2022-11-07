/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.meuteste;

/**
 *
 * @author erick.nsilva2
 */
public class Filho extends Mae implements Pai {

    String namora;
    int qtdfilho;
    int idade;

    Filho(String nome, int i, String n, int filho) {
        super(nome, i);
        this.namora = n;
        this.qtdfilho = filho;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    

}
