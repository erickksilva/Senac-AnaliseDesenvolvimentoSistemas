/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.aula_18_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author erick.nsilva2
 */
public class Exercicio2 extends JFrame implements ActionListener, ItemListener {

    public static void main(String[] args) {
        new Exercicio2();

    }
    JLabel j1, j2, j3, j4, j5;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2, b3, b4, b5, b6;

    public Exercicio2() {
        setTitle("Formulario");
        setSize(600, 500);

        getContentPane().setBackground(new Color(188, 231, 195));
        GridLayout gl = new GridLayout(4, 2); //linhas e colunas
        getContentPane().setLayout(gl);
        j1 = criarRotulo("Nome:");
        t1 = criarTexto();
        j2 = criarRotulo("Sexo: ");
        t2 = criarTexto();
        j3 = criarRotulo("Estado: ");
        t3 = criarTexto();
        j4 = criarRotulo("Municipio: ");
        t4 = criarTexto();
        j5 = criarRotulo("Telefone: ");
        t5 = criarTexto();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    private JLabel criarRotulo(String texto) {
        JLabel rotulo = new JLabel(texto);
        rotulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(rotulo);
        return rotulo;
    }

    private JTextField criarTexto() {
        JTextField texto = new JTextField();
        texto.setFont(new Font("Times New Roman", Font.BOLD, 18));
        texto.setForeground(Color.blue);
        add(texto);
        return texto;
    }

}
