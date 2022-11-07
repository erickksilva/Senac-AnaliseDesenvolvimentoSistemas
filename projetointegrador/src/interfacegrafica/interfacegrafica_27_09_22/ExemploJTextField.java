/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.interfacegrafica_27_09_22;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ExemploJTextField extends JFrame {

    JLabel jl1, jl2;
    JTextField txtNome, txtTelefone;

    public static void main(String[] args) {
        new ExemploJTextField();
    }

    public ExemploJTextField() {

        Container c = getContentPane();

        setTitle("Primeira janela Swing");

        //tamanho da janela - width - largura, heigth - altura
        setSize(600, 400);

        // o mesmo comando
        getContentPane().setLayout(null);

        //cor de fundo da janela no padrao rg ( red green blue)
        c.setBackground(new Color(125, 255, 255));

       

        jl1 = criarRotulo("nome:", 10, 10, 200, 30);
        jl2 = criarRotulo("endereço:", 10, 30, 200, 30);
        txtNome = criarCaixaTexto(210, 10, 200, 30);
        txtTelefone = criarCaixaTexto(210, 40, 200, 30);
        
         //prova o termino da execucao(encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private JLabel criarRotulo(String texto, int x, int y, int w, int h) {

        JLabel rotulo = new JLabel();
        rotulo.setText(texto);
        rotulo.setLocation(x, y);
        rotulo.setSize(w, h);
        rotulo.setBackground(new Color(255, 255, 255));
        rotulo.setForeground(Color.BLUE);
        rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
        rotulo.setToolTipText("rotulabel Exemplo");
        rotulo.setHorizontalAlignment(SwingConstants.LEFT);
        rotulo.setVerticalAlignment(SwingConstants.TOP);
        add(rotulo);
        return rotulo;
    }

    private JTextField criarCaixaTexto(int x, int y, int w, int h) {

        JTextField texto = new JTextField();
        texto.setLocation(x, y);
        texto.setSize(w, h);
        texto.setFont(new Font("Courier new", Font.BOLD, 20));
        texto.setHorizontalAlignment(0);
        add(texto);
        return texto;
    }
}
