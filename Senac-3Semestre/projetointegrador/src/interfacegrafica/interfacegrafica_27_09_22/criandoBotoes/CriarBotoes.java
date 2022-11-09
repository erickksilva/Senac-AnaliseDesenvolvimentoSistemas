/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.interfacegrafica_27_09_22.criandoBotoes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author erick.nsilva2
 */
public class CriarBotoes extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new CriarBotoes();
    }
    JButton gravar, sair;
//    JTextField textrg, textNome;
//    JLabel rg, nome;
JTextField txtNome, txtRG;
    JLabel nome, rg;
    public CriarBotoes() {
        setTitle("Criado Botões");
        int l = 800;
        int a = 300;
        setSize(l , a);
        getContentPane().setLayout(null);
        int x=10, y=10, w=100, h=35;
        //1ª linha
        rg = criarRotulo("RG: ", x, y, w, h);
        txtRG = criarCaixaTexto(x+w, y, w+=200, h);
        
        //2ª linha
        x=10; 
        y=40;//define a linha
        w=100;
        h=35;        
        nome = criarRotulo("Nome: ", x, y, w, h);
        txtNome = criarCaixaTexto(x+w, y, w+=200, h);

        gravar = criarBotao("Gravar", (l / 2 - 100), 200, 100, 50, 'G');
        sair = criarBotao("Sair", (l / 2), 200, 100, 50, 'S');

        getContentPane().setBackground(new Color(120, 120, 155));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public JTextField criarCaixaTexto(int x, int y, int w, int h) {

        JTextField texto = new JTextField();
        texto.setLocation(x, y);
        texto.setSize(w, h);
        texto.setFont(new Font("Courier new", Font.BOLD, 20));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.addActionListener(this);
        add(texto);

        return texto;
    }

    public JButton criarBotao(String texto, int x, int y, int w, int h, char c) {

        JButton b1 = new JButton(texto);
        b1.setBounds(x, y, w, h);
        b1.setBackground(new Color(0, 120, 170));
        b1.setForeground(Color.BLUE);
        b1.setFont(new Font("Helvetica", Font.BOLD, 18));
        b1.addActionListener(this);
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setMnemonic(c);
        add(b1);
        //   b1.setToolTipText("Botao b1");

        return b1;
    }

    public JLabel criarRotulo(String texto, int x, int y, int w, int h) {

        JLabel rotulo = new JLabel();
        rotulo.setText(texto);
        rotulo.setLocation(x, y);
        rotulo.setSize(w, h);
        rotulo.setBackground(new Color(255, 255, 255));
        rotulo.setForeground(new Color(0, 0, 0));
        rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
        rotulo.setToolTipText("rotulabel Exemplo");
        rotulo.setHorizontalAlignment(SwingConstants.LEFT);
        rotulo.setVerticalAlignment(SwingConstants.TOP);
        add(rotulo);
        return rotulo;
    }


    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gravar) {
            JOptionPane.showMessageDialog(null, "Dados gravados!!");
        } else if (e.getSource() == sair) {
            int confirmaSaida = JOptionPane.showConfirmDialog(null, "Confirmar o encerramento.");
            if (confirmaSaida == 0) {
                System.exit(0);
            }
        }
    }

}
