package ado2;

//O enunciado est� junto com author, encontrado aqui ou abaixo dessa linha

/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 6.(1,0) O quadrado de um n�mero natural N � dado pela soma
 *dos N primeiros n�meros �mpares consecutivos. Por exemplo,
 *12 = 1, 2^2 = 1 + 3, 3^2 = 1 + 3 + 5, 4^2 = 1 + 3 + 5 + 7. 
 *Criar uma fun��o que receba por par�metro 
 *um n�mero inteiro positivo maior que zero, calcule e retorne
 o quadrado do n�mero usando a soma de �mpares ao inv�s de produto.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio6 {
	
	public static int quadrado (int n)	{
	 
		int num = 0;
	  
	  if(n <= 0) {
		  System.out.println("Conta inv�lida!");
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
