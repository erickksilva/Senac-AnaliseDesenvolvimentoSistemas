package ado2;

//O enunciado está junto com author, encontrado aqui ou abaixo dessa linha


/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 4. (1,0) Criar uma função que receba dois números inteiros: 
 * um valor A e um valor N. A função deve retornar a soma
dos N números a partir de A (inclusive). Se N for negativo
ou zero, a função deve retornar -1. A função main deve
ler dois valores inteiros (para A e para N), chamar a função
 criada e apresentar na tela o dado retornado pela função.
Exemplo de cálculo da função: se A for 3 e N for 2, o retorno
 da função deve ser 7, pois é a soma de 3 + 4.
 */

import java.util.Scanner;

public class Exercicio4 {
		  public static void main(String[] args) {
		    Scanner leitor = new Scanner(System.in);
		    int resutado = 0;
		    
		    System.out.print("digite o numero A: ");
		    int A = leitor.nextInt();
		    
		    System.out.print("digite o numero N: ");
		    int N = leitor.nextInt();
		    
		    resutado = somar (A,N);

		    leitor.close();
		  }
		  
		  public static int somar (int A, int N){
		    int somaRes = 0;
		    
		    if (N <= 0){
		      somaRes = -1;
		      System.out.println("resutado : " + somaRes);
		    }
		    else {
		      somaRes = A + (N+N);
		      System.out.println("resutado : " + somaRes);
		    }
		    return somaRes;

		  }
		}

