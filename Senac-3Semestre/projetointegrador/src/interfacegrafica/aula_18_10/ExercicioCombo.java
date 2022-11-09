/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.aula_18_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExercicioCombo extends JFrame implements ActionListener, ItemListener {

    JLabel nome, sexo, falecido;
    JTextField txtNome;
    JComboBox comboSexo, comboFalecido;
    JButton b1, b2; //instanciações

    public static void main(String args[]) {
        new ExercicioCombo();
    }

    ExercicioCombo() {
        setTitle("Exercicio");
        setSize(400, 170);
        getContentPane().setBackground(new Color(188, 231, 195));
        getContentPane().setLayout(new GridLayout(4, 2, 5, 5)); //linhas e colunas
        nome = criarRotulo("Nome: ");
        txtNome = criarTexto();
        falecido = criarRotulo("Falecido: ");
        String[] situacao = {"Sim", "Não"};
        comboFalecido = criarCombo(situacao);
        sexo = criarRotulo("Sexo: ");
        String[] sexos = {"Feminino", "Masculino"};
        comboSexo = criarCombo(sexos);
        b1 = criarBotao("Gravar");
        b2 = criarBotao("Sair");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JTextField criarTexto() {
        JTextField texto = new JTextField();
        texto.setFont(new Font("Times New Roman", Font.BOLD, 18));
        texto.setForeground(Color.blue);
        add(texto);
        return texto;
    }

    private JLabel criarRotulo(String texto) {
        JLabel rotulo = new JLabel(texto);
        rotulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(rotulo);
        return rotulo;
    }

    private JComboBox criarCombo(String[] vetor) {
        JComboBox combo = new JComboBox<>(vetor);
        combo.addActionListener(this);
        combo.addItemListener(this);
        add(combo);
        return combo;
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.addActionListener(this);
        add(botao);
        return botao;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "Gravando os dados!!!");
        } else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Encerrando...");
            System.exit(0);
        } else if (e.getSource() == comboSexo) {
            JOptionPane.showMessageDialog(null, "Selecionado Sexo: "
                    + comboSexo.getSelectedItem());
        } else if (e.getSource() == comboFalecido) {
            JOptionPane.showMessageDialog(null, "Status selecionado para falecido: "
                    + comboFalecido.getSelectedItem());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //		if (e.getSource()==comboSexo)
        //			JOptionPane.showMessageDialog(null, "Selecionado Sexo: " 
        //		+ comboSexo.getSelectedItem());

    }
}
