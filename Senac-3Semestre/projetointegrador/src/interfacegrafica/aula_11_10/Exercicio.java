/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.aula_11_10;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author erick.nsilva2
 */
public class Exercicio extends JFrame {

    JLabel j1, j2;
    JTextField usuario;
    JPasswordField senha;
    JButton b1, b2;

    public Exercicio() {
        setTitle("Tela de login");
        setSize(500, 300);

        GridLayout gl = new GridLayout(3, 2, 1, 1);

        getContentPane().setBackground(new Color(66, 33, 66));
        getContentPane().setLayout(gl);

        j1 = criarRotulo("Usuario:", 10, 10, 200, 30);
        j2 = criarRotulo("Senha:", 10, 40, 200, 30);

        usuario = criarCaixaTexto(105, 10, 200, 25);
        senha = criarCaixaTextoSenha(80, 40, 200, 25);

        b1 = new JButton("Ok");
        b1.setBounds(100, 170, 100, 30);
        getContentPane().add(b1);

        b2 = new JButton("Cancelar");
        b2.setBounds(210, 170, 100, 30);
        getContentPane().add(b2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JLabel criarRotulo(String msg, int x, int y, int w, int h) {
        JLabel rotulo = new JLabel();
        rotulo.setText(msg);
        rotulo.setLocation(x, y);
        rotulo.setSize(w, h);
        rotulo.setBackground(new Color(255, 255, 255));
        rotulo.setForeground(Color.white);
        rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
        rotulo.setHorizontalAlignment(SwingConstants.LEFT);
        rotulo.setVerticalAlignment(SwingConstants.TOP);
        add(rotulo);
        return rotulo;
    }

    private JTextField criarCaixaTexto(int x, int y, int w, int h) {
        JTextField text = new JTextField();

        text.setLocation(x, y);
        text.setSize(w, h);
        text.setFont(new Font("Courier new", Font.BOLD, 20));
        text.setHorizontalAlignment(0);
        add(text);
        return text;
    }

    private JPasswordField criarCaixaTextoSenha(int x, int y, int w, int h) {
        JPasswordField senha = new JPasswordField();

        senha.setLocation(x, y);
        senha.setSize(w, h);
        senha.setFont(new Font("Courier new", Font.BOLD, 20));
        senha.setHorizontalAlignment(0);
        add(senha);
        return senha;
    }

    public static void main(String[] args) {
        new Exercicio();
    }
}
