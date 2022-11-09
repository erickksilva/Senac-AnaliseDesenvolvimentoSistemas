/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.meuteste;

import java.util.Scanner;
import java.lang.Integer.*;
import static java.lang.Integer.*;
import javax.swing.JOptionPane;

/**
 *
 * @author erick.nsilva2
 */
public class PessoaDemo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        String nome = entrada.nextLine().trim();

        System.out.print("Insira a idade: ");
        int idade = entrada.nextInt();
        
        Scanner entrada1 = new Scanner(System.in);

        System.out.print("Insira o endereco: ");
        String endereco = entrada1.nextLine();

        Pessoa1 p1 = new Pessoa1(nome, idade, endereco);

        System.out.println();
        System.out.print(p1.getNome() + " ");
        System.out.print(p1.getIdade() + " ");
        System.out.println(p1.getEndereco());
        
        System.out.println();
        p1.imprimirCaracteristicas();
        
        entrada.close();
    }

}
