/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_06_09_22.exercicio;

/**
 *
 * @author erick.nsilva2
 */
public class Caminhao extends Veiculo {

    private int pesoCarga;

    public Caminhao(String tipo, String placa, int ano, int pesoCarga) {
        super(tipo, placa, ano);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void informacoesDoVeiculo() {
        System.out.println("Informações do Caminhão.\n");
        System.out.println("Tipo: " + getTipo());
        super.informacoesDoVeiculo();
        System.out.println("Peso da carga: " + this.pesoCarga);
        System.out.println(".....................................");
    }

}
