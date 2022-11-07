/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Exercicio2 {
    public static void main(String[] args) {
        /*2. (1,0) Criar um programa que leia três números inteiros e apresente 
        na tela o maior deles.
        */
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o primeiro numero: ");
        int number1 = entrada.nextInt();
        
        System.out.print("Insira o segundo numero: " );
        int number2 = entrada.nextInt();
        
        System.out.print("Insira o terceiro numero: ");
        int number3  = entrada.nextInt();
        
        if ((number1 > number2 ) && (number1 > number3)) {
        System.out.print("\nO numero " + number1 + " é o maior!");
     }
        else if ((number2 > number1 ) && (number2 > number3)) {
        System.out.print("\nO numero " + number2 + " é o maior!");
        }
        else {
            if ((number3 > number1 ) && (number3 > number2)) {
        System.out.print("\nO numero " + number3 + " é o maior!");
            }
        }
        
    }
}
