/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula3;

/**
 *
 * @author erick.nsilva2
 */
public class Mensalista extends Colaborador {

    private double valorSalarioMensal;
    private int cargaDias;

    public Mensalista(String funcional, String nomeColab, String endereco,
            String dataAdmissao, double valorSalarioMensal, int cargaDias) //
    {
        super(funcional, nomeColab, endereco, dataAdmissao);
        this.valorSalarioMensal = valorSalarioMensal;
        this.cargaDias = cargaDias;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Tipo de contrato: Mensalista\n");
        super.calcularSalario();
        double salario = (valorSalarioMensal * 0.10) * cargaDias;

        double salarioFinal = valorSalarioMensal * cargaDias - salario;

        System.out.printf("Recebeu R$:%.2f, neste mês.\n", salarioFinal);
    }

}
