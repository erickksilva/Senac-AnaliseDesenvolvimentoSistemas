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
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*3. (1,0) Criar um programa que leia dois números L e R. O programa deve verificar 
        a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir 
        na tela qual o maior: "Quadrado" ou "Circulo".
         */
        System.out.print("digite o lado do quadrado: ");
        double lquadrado = leitor.nextFloat();
        double areaQuad = Math.pow(lquadrado, 2);

        System.out.print("digite o raio do circulo: ");
        double raioC = leitor.nextDouble();
        double areaCirculo = raioC * 3.14;

        if (areaQuad > areaCirculo) {
            System.out.println("area maior é a do quadrado: " + areaQuad);
        } else {
            System.out.println("area maior é a do circulo: " + areaCirculo);
        }

    }
}
