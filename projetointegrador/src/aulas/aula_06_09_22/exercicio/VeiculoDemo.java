/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_06_09_22.exercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class VeiculoDemo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Veiculo v;
        Onibus onb = null;
        Caminhao cm;

        String[] transport = {"Onibus", "Caminhao"};

        Object escolherTransporte
                = JOptionPane.showInputDialog(null,
                        "Escolha um Veiculo", "Cadastro de Veiculo",
                        JOptionPane.INFORMATION_MESSAGE, null, transport, transport[0]
                );

        if (escolherTransporte.equals("Onibus")) {
            String tipo = JOptionPane.showInputDialog(
                    "Insira o tipo do caminhão: ");

            String placa = JOptionPane.showInputDialog(
                    "Inisra a placa: ");

            int ano = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insira o ano: "));

            int passageiros = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insira a quantidade de passageiros: "));

            v = new Onibus(tipo, placa, ano, passageiros);
            v.informacoesDoVeiculo();

        } else {
            String tipo = JOptionPane.showInputDialog(
                    "Insira o tipo do caminhão: ");

            String placa = JOptionPane.showInputDialog(
                    "Inisra a placa: ");

            int ano = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insira o ano: "));

            int carga = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insira a carga: "));

            v = new Caminhao(tipo.toUpperCase(), placa.toUpperCase(), ano, carga);
            v.informacoesDoVeiculo();
        }

    }
}
