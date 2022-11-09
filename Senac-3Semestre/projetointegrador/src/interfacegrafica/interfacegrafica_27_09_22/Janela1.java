/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.interfacegrafica_27_09_22;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author erick.nsilva2
 */
public class Janela1 extends JFrame {

    public Janela1() {
        Container c = getContentPane();

        //titutlo da janela
        setTitle("Primeira janela Swing");

        //tamanho da janela - width - largura, heigth - altura
        setSize(500, 500);

        //anula o padrao
        setLayout(null);

        //cor de fundo da janela no padrao rg ( red green blue)
        c.setBackground(new Color(140, 253, 249));
        //prova o termino da execucao(encerra o programa)
        //se nao colocar exit on close quando fechar o swing a janela vai continuar funcionando
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        centralizar();

    }

    public static void main(String[] args) {
        new Janela1();

    }

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

//    public void centralizar() {
//        //obtem a altura e largura da resolucao video do computador do usuario
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        
//        Dimension janela = getSize();
//        
//         if (janela.height > screen.height) {
//            setSize(janela.width, screen.height);
//        }
//        if (janela.width > screen.getHeight()) {
//            setSize(screen.width, janela.height);
//            setLocation(;screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
//        }
//       
//    }

