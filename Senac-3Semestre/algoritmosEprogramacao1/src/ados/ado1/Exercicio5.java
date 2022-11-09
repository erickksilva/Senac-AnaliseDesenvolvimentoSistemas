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
public class Exercicio5 {
    public static void main(String[] args) {
        
        /* Criar um programa que leia 3 números reais A, B e C e 
	    	 * ordene-os em ordem crescente, de modo que o lado A
	    	 * representa o maior dos 3 lados. A seguir, determine o tipo
	    	 *  de triângulo que estes três lados formam, com base nos
	    	 *  seguintes casos, sempre escrevendo uma mensagem adequada:
	    	 *  • se A ≥ B + C, apresente a mensagem: NAO FORMA TRIANGULO
	    	 *  • se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
	    	 *  se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
	    	 *   se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
	    	 *  se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
	    	 *  • se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
	    	 */
        Scanner entrada = new Scanner(System.in);
        double  temp;
        
        System.out.println("Digite o primeiro A: ");
        double a = entrada.nextDouble();
        
        System.out.println("Digite o primeiro B: ");
        double b = entrada.nextDouble();
        
        System.out.println("Digite o primeiro C: ");
        double c = entrada.nextDouble();
       
        if((a > b) && (a > c)){
        }
        
        if (a >= (b + c)) {
        System.out.println("Não forma triangulo");
        }
        else if (a*a == (b*b) + (c*c)){
            System.out.println("Triangulo retangulo");
        }
        else if(a*a > (b*b) + (c*c)){
            System.out.println("Triangulo obtusangulo");
        }
        else if(a*a < (b*b) + (c*c)){
            System.out.println("triangulo acutangulo");
        }
        else if (a == b || b == c || c == a) {
            System.out.println("Triangulo equilatero");
        }
        else if(a == b || b == c) {
            System.out.println("Triangulo isoceles");
     }
    }
}                        
    

