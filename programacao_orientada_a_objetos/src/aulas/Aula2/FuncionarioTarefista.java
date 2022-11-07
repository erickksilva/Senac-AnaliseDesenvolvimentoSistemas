/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.Aula2;

/**
 *
 * @author erick.nsilva2
 */
public class FuncionarioTarefista extends Funcionario {

    private double qtdHoras;

    public FuncionarioTarefista(String nome, double hora) {
        super(nome);
        this.qtdHoras = hora;
    }

    public void showDim() {
        System.out.println("Nome funcionario: " + super.getNome());
        System.out.println("Quantidade horas " + qtdHoras);
    }

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

}
