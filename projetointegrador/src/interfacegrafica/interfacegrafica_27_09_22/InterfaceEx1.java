/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.interfacegrafica_27_09_22;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class InterfaceEx1 extends JFrame {

    public static void main(String[] args) {

        new InterfaceEx1();
    }

    public InterfaceEx1() {
        Scanner entrada = new Scanner(System.in);

        Container c = getContentPane();
        //titutlo da janela
        setTitle("Primeira janela Swing");

        int largura = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura da janela."));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura da janela."));
        //tamanho da janela - width - largura, heigth - altura
        setSize(largura, altura);

        //        setLayout(null);
        getContentPane().setLayout(null);

        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira a cor 1 do RGB."));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira a cor 2 do RGB."));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Insira a cor 3 do RGB."));
        c.setBackground(new Color(a, b, d));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        centralizar(); // vai ser substituido por setLocationRelativeTo que tem a mesma funcao
        setLocationRelativeTo(null);//para centralizar a tela
    }
//     getContentPane().setLayout(null);
//        c.setBackground(new Color(51, 0, 85));
//         rotulo.setBackground(new Color(51, 0, 85));
//        rotulo.setForeground(new Color(0, 0, 0));

    public void centralizar() {
        //obtem a altura e largura da resoluçao video
        Dimension screm
                = Toolkit.getDefaultToolkit().getScreenSize();
        // obtem a Altura e largura da minha janela
        Dimension janela = getSize();
        if (janela.height > screm.height) {
            setSize(janela.width, screm.height);
        }
        if (janela.width > screm.width) {
            setSize(screm.width, janela.height);
        }
        setLocation((screm.width - janela.width) / 2,
                (screm.height - janela.height) / 2);
    }

}
