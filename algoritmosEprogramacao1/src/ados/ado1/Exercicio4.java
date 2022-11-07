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
public class Exercicio4 {
    public static void main(String[] args) {
    /*4. (1,0) Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela abaixo:
        Idade          |    Categoria
        5 a 7 anos  |    Infantil A
        8 a 10 anos  |  Infantil b
        11-13 anos  |   Juvenil A
        14-17 anos  |   Juvenil B
        +18 anos     |   Adulto
        */
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();
        
        if (idade < 5  ) {
            System.out.println("Categoria invalida!");
        }
        else if ( idade == 5 || idade <= 7){
            System.out.println("Categoria Infatil A");
        }
        else if ( idade == 8 || idade <= 10){
            System.out.println("Categoria Infatil B");
        }
        else if ( idade == 11 || idade <= 13){
            System.out.println("Categoria Juvenil A");
        }
        else if ( idade == 14 || idade <= 17){
            System.out.println("Categoria Juvenil B");
        }
        else {
            System.out.println("Categoria Adulto");
        }
            
    }
    }
