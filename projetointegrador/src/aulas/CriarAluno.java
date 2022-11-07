/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class CriarAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        crie um programa que apartir de uma classe aluno permita receber o nome
        e a turma do aluno e imprimir uma mensage de boas vindas ao mesmo.
         */
        Aluno a1 = new Aluno();

        a1.setNome("Erick");
        a1.setTurma("3°C");
//        a1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
//        a1.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));

        a1.boasvindas();
        
        System.out.printf("Seja Bem-vindo! %S, a sua turma é %s\n",
                a1.getNome(), a1.getTurma());
        
        

    }

}
