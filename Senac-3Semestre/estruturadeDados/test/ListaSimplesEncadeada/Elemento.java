/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimplesEncadeada;

/**
 *
 * @author erick.nsilva2
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
