package ado2;



//O enunciado est� junto com author, encontrado aqui ou abaixo dessa linha

/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 *3.(1,0) Criar uma fun��o que receba como par�metro o sal�rio
 *bruto de um funcion�rio, calcule e retorne o imposto
derenda a ser pago a partir do sal�rio do funcion�rio. 
Se o sal�rio for menor que R$ 1.257,12 est� isento do
imposto. Se o sal�rio for entre R$ 1.257,12 e R$ 2.510,00 
(inclusive), a al�quota do imposto � 17%. Se o sal�rio
for superior a R$ 2.510,00, a al�quota do imposto � 28%.
 Criar uma outra fun��o que receba o sal�rio bruto do
funcion�rio e o valor do imposto de renda a ser pago e retorne
 o sal�rio l�quido do funcion�rio. A fun��o main do
programa deve ler o sal�rio bruto do funcion�rio e apresentar 
o valor do imposto a ser pago e o sal�rio l�quido do
funcion�rio.
 */

import java.util.Scanner;

public class Exercicio3 {
	  public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    float resutadoImp = 0;
	    float salarioLiquido = 0;

	    System.out.println("salario bruto: ");
	    float salario = leitor.nextFloat();
	    
	    resutadoImp = calculoImposto(salario);
	    salarioLiquido = calculoSL(salario, resutadoImp);

	    leitor.close();
	  }
	  
	  public static float calculoImposto ( float salario ){
	    float valorImposto = 0; 
	     if (salario < 1257f){
	        System.out.println("isento do imposto");
	      }
	      else if (salario >= 1257f && salario <=2510f){
	    	  valorImposto = (17 * salario) / 100;
	        System.out.println("valor do imposto: " + valorImposto);
	      }
	      else if (salario > 2510f){
	    	  valorImposto = (28 * salario) / 100;
	        System.out.println("valor do imposto: " + valorImposto);
	      }
	      return valorImposto;
	  }
	  public static float calculoSL ( float salario, float resutadoImp){
	    float vlSalario = 0;
	    vlSalario = salario - resutadoImp;
	    System.out.println("salario liquido: " + vlSalario);
	    return vlSalario;
	  }
	}