/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author erick.nsilva2
 */
public class Computador {

    private String marcar;
    private int memoriaRam, velocidadeProcessador;
    private double preco;

    public Computador(String marcar, int memoriaRam, int velocidadeProcessador, double preco) {
        this.marcar = marcar;
        this.memoriaRam = memoriaRam;
        this.velocidadeProcessador = velocidadeProcessador;
        this.preco = preco;
    }

    public String getMarcar() {
        return marcar;
    }

    public int getVelocidadeProcessador() {
        return velocidadeProcessador;
    }

    public double getPreco() {
        return preco;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void infoComputador(Computador ob) {
        System.out.println("Marcar: " + ob.getMarcar());
        System.out.println("Memoria Ram: " + ob.getMemoriaRam() + "GB");
        System.out.println("Velocidade Processador: " + ob.getVelocidadeProcessador());
        System.out.println("Preco: R$ " + ob.getPreco());
    }

}
