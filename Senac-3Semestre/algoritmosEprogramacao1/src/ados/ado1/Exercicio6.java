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
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        /* 6. (1,0) Criar um programa que leia dois valores inteiro X e Z, calcula e apresente na tela
        XZ (sem utilizar funções ou operadores de potência prontos).
         */
        System.out.println("digite a base: ");
        int b = leitor.nextInt();

        System.out.println("digite o expoente: ");
        int n = leitor.nextInt();

        float res = 1;

        for (int i = n; i > 0; i--) {
            res = res * b;
        }
        System.out.println("resutado: " + res);

    }
}
