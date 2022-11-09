package ado2;

//O enunciado está junto com author, encontrado aqui ou abaixo dessa linha

/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 6.(1,0) O quadrado de um número natural N é dado pela soma
 *dos N primeiros números ímpares consecutivos. Por exemplo,
 *12 = 1, 2^2 = 1 + 3, 3^2 = 1 + 3 + 5, 4^2 = 1 + 3 + 5 + 7. 
 *Criar uma função que receba por parâmetro 
 *um número inteiro positivo maior que zero, calcule e retorne
 o quadrado do número usando a soma de ímpares ao invés de produto.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio6 {
	
	public static int quadrado (int n)	{
	 
		int num = 0;
	  
	  if(n <= 0) {
		  System.out.println("Conta inválida!");
	  }
	  for(int i = 0; i < n; i+= 1){
		  
		 num = num  + ((i *2) + 1);
		 
		 // System.out.print(i);
		 int j = i + (i + 1) ;
		 System.out.print(" " + j);
		 
	  }
		 System.out.println("\n\nO quadrado do numero " + n + " = " + num);

	  return num;
	}
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	 System.out.print("Digite um numero inteiro: ");
	 int numInteiro = entrada.nextInt();
	 	 
	 int soma = quadrado(numInteiro);
	 
	 System.out.println();
	 entrada.close();
}
}
