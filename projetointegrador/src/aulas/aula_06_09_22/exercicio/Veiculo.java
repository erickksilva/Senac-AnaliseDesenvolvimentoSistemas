/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_06_09_22.exercicio;

/**
 *
 * @author erick.nsilva2
 */
public class Veiculo {

    private String tipo, placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String tipo, String placa, int ano) {
        this.tipo = tipo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void informacoesDoVeiculo() {
        String info = String.format("Placa caminhao: %S \nAno: %d", placa, ano);
        System.out.println(info);
    }

    public String getTipo() {
        return tipo;
    }

    public void settipo(String nome) {
        this.tipo = nome;
    }

}
