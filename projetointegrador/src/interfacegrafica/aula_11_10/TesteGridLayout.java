/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.aula_11_10;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author erick.nsilva2
 */
public class TesteGridLayout extends JFrame {

    public TesteGridLayout() {
        setTitle("Teste GridLayou");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        GridLayout gl = new GridLayout(3, 2, 5, 5);
        getContentPane().setLayout(gl);

        JButton b1 = new JButton("Linha 1 - coluna 1");
        JButton b2 = new JButton("Linha 1 - coluna 2");
        JButton b3 = new JButton("Linha 2 - coluna 1");
        JButton b4 = new JButton("Linha 2 - coluna 2");
        JButton b5 = new JButton("Linha 3 - coluna 1");
        JButton b6 = new JButton("Linha 3 - coluna 2");
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TesteGridLayout();
    }
}
