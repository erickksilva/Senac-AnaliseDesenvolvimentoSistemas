/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados.View;

import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class InteracaoUsuario {

    public void boasVindas() {
        System.out.println("Bem vindo ao Sistema");
    }

    public String entradaUsuario() {
        String nome = (JOptionPane.showInputDialog(null, "Insira o seu nome: "));
        return nome;
    }
}
