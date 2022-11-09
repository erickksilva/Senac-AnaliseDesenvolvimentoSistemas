/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica.aula_18_10;

/**
 *
 * @author erick.nsilva2
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExCheckBox extends JFrame implements ItemListener {

    JLabel l1;
    JCheckBox c1, c2;
    static int negrito = 0, italico = 0;

    public static void main(String args[]) {
        new ExCheckBox();
    }

    ExCheckBox() {
        setBackground(new Color(180, 180, 180));
        setTitle("Uso do JCheckBox");
        setSize(300, 70);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        l1 = new JLabel(JOptionPane.showInputDialog("Digite um texto"));
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setFont(new Font("Arial", Font.PLAIN, 20));
        l1.setForeground(new Color(26, 72, 17));
        setLayout(new GridLayout(1, 3, 3, 3));
        c1 = new JCheckBox("Negrito");
        c1.setBackground(new Color(180, 180, 180));
        c1.addItemListener(this);
        c2 = new JCheckBox("Italico");
        c2.setBackground(new Color(180, 180, 180));
        c2.addItemListener(this);
        add(l1);
        add(c1);
        add(c2);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                negrito = Font.BOLD;
            } else {
                negrito = Font.PLAIN;
            }
        }
        if (e.getSource() == c2) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                italico = Font.ITALIC;
            } else {
                italico = Font.PLAIN;
            }
        }
        l1.setFont(new Font("Arial", negrito + italico, 20));
    }
}
