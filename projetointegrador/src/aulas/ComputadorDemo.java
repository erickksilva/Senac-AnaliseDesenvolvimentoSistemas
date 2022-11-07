/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;
import static java.lang.Integer.*;

/**
 *
 * @author erick.nsilva2
 */
public class ComputadorDemo {

    public static void main(String[] args) {

        String a;
        int b, c;
        double d;

        a = JOptionPane.showInputDialog("Inisra a marca: ");
        b = parseInt(JOptionPane.showInputDialog("Inisra a Memoria Ram: "));
        c = parseInt(JOptionPane.showInputDialog("Insira a velocidade do processador: "));
        d = parseDouble(JOptionPane.showInputDialog("Insira o preço: "));

        Computador c1 = new Computador(a, b, c, d);
        System.out.println();

        c1.infoComputador(c1);

    }

}
