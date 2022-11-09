/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.Aula2;

/**
 *
 * @author erick.nsilva2
 */
public class FuncionarioMensalista extends Funcionario {

    private double hora;

    public FuncionarioMensalista(String nome, double h) {
        super(nome);
        this.hora = h;
        System.out.println("Nome: " + super.getNome());
        System.out.println("Valor hora " + hora);
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

}
