/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_06_09_22.exercicio;

/**
 *
 * @author erick.nsilva2
 */
public class Onibus extends Veiculo {

    private int passageiros;

    public Onibus(String tipo, String placa, int ano, int passageiros) {
        super(tipo, placa, ano);
        this.passageiros = passageiros;
    }

    int getPassageiros() {
        return this.passageiros;
    }

    public void setPassageiro(int p) {
        this.passageiros = p;
    }

    @Override
    public void informacoesDoVeiculo() {
        System.out.println("Informações do Ônibus.\n");
        System.out.println("Tipo: " + getTipo());
        super.informacoesDoVeiculo();
        System.out.println("Passageiro: " + getPassageiros());
        System.out.println(".....................................");
    }

}
