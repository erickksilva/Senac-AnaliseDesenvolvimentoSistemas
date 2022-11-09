/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import java.util.Scanner;
import java.lang.Integer.*;
import static java.lang.Integer.*;
import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class PessoaDemo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Erick Silva", 23, "Centro universitario Senac");

        String nome = JOptionPane.showInputDialog("Insira o nome: ");

        int idade = parseInt(JOptionPane.showInputDialog("Insira a idade"));

        String endereco = JOptionPane.showInputDialog("Insira o endereço: ");

        Pessoa p2 = new Pessoa(nome, idade, endereco);

        System.out.println(p2.nome);
        System.out.println(p2.idade);
        System.out.println(p2.endereco);
        
        Pessoa maria = new Pessoa();
        
        System.out.println(maria.nome);
        System.out.println(maria.idade);
        System.out.println(maria.endereco);
        entrada.close();
    }

}
