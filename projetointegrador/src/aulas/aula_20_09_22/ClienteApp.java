/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22;

import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class ClienteApp {

    private static ClienteBanco[] lista = new ClienteBanco[5];

    public static void main(String[] args) {

        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

        ClienteBanco clienteBanco[] = new ClienteBanco[qtd];

        for (int i = 0; i < qtd; i++) {
            clienteBanco[i] = new ClienteBanco();
            clienteBanco[i].setNome(JOptionPane.showInputDialog("Digite o Nome"));
            clienteBanco[i].setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
            clienteBanco[i].setCpf(JOptionPane.showInputDialog("Digite o CPF"));
        }

        for (int i = 0; i < qtd; i++) {
            System.out.println(clienteBanco[i]);
            System.out.println();
        }

    }

}
