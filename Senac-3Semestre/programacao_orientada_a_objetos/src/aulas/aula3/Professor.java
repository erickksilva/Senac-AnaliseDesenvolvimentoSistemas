/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula3;

/**
 *
 * @author erick.nsilva2
 */
public class Professor extends Colaborador {

    private double valorHora;
    private int qtdAula;

    public Professor(String funcional, String nomeColab, String endereco,
            String dataAdmissao, double valorHora, int qtdAula)// 
    {
        super(funcional, nomeColab, endereco, dataAdmissao);
        this.valorHora = valorHora;
        this.qtdAula = qtdAula;
    }

    @Override
    public void calcularSalario() {
    }
    
    
}
