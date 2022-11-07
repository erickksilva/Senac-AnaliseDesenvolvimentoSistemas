package ado2;

//O enunciado est� junto com author, encontrado aqui ou abaixo dessa linha


/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 4. (1,0) Criar uma fun��o que receba dois n�meros inteiros: 
 * um valor A e um valor N. A fun��o deve retornar a soma
dos N n�meros a partir de A (inclusive). Se N for negativo
ou zero, a fun��o deve retornar -1. A fun��o main deve
ler dois valores inteiros (para A e para N), chamar a fun��o
 criada e apresentar na tela o dado retornado pela fun��o.
Exemplo de c�lculo da fun��o: se A for 3 e N for 2, o retorno
 da fun��o deve ser 7, pois � a soma de 3 + 4.
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

