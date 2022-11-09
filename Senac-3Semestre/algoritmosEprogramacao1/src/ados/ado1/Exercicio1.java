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
public class Exercicio1 {
    public static void main(String[] args) {
        /*
     * 1. (1,0) Criar um programa que leia o nome de um vendedor, o seu salário fixo
     * e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
     * vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e
     * imprimir o total a receber no final do mês.
     */
        Scanner entrada = new Scanner(System.in);

    System.out.print("Insira o nome do vendedor: ");
    String nome = entrada.nextLine().toUpperCase(); // nextLine para ler o nome do vendedor completo ou sobrenome

    System.out.print("Insira o Salario do vendedor: ");
    float salario = entrada.nextFloat();

    System.out.print("Total de vendas realizada no mês em dinheiro: ");
    float vendas = entrada.nextFloat();

    float comissao = vendas + ((vendas * 15) / 100);

    float salarioFinal = salario + comissao;

    System.out.printf("\nSalario Total = R$ %.2f ", salarioFinal);
  }

}
    
   