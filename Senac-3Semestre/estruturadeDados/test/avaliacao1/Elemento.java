/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacao1;

/**
 *
 * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class Elemento {

    private Object objeto;
    private Elemento proximo;

    public Elemento(Object objeto, Elemento proximo) {
        this.objeto = objeto;
        this.proximo = proximo;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
