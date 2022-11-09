/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.Aula2;

/**
 *
 * @author erick.nsilva2
 */
public class FuncionarioHorista extends Funcionario {

    private String nome, estilo = "horista";
    private double qtdHora;

    public FuncionarioHorista(String nome, double h) {
        super(nome);
        this.estilo = estilo;
        this.qtdHora = h;
    }

    public void showDim() {
        System.out.println("Tipo de contrato: " + estilo + " \nNome: "
                + super.getNome() + " \nQuantidade horas horas " + qtdHora);
    }

    public double getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

}
