/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.interfacegrafica_27_09_22.criandoBotoes;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author erick.nsilva2
 */
public class TesteFlowLayout extends JFrame {

    public TesteFlowLayout() {
        setTitle("Teste FlowLayout");
        setSize(300, 120);
        getContentPane().setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT, 10, 10);
        getContentPane().setLayout(f1);
        JButton b1 = new JButton("Botao 1");
        JButton b2 = new JButton("Botao 2");
        JButton b3 = new JButton("Botao 3");
        JButton b4 = new JButton("Botao 4");
        JButton b5 = new JButton("Botao 5");
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TesteFlowLayout();
    }
}
