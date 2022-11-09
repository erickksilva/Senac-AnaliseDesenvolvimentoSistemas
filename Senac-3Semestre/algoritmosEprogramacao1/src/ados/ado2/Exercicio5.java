package ado2;

//O enunciado está junto com author, encontrado aqui ou abaixo dessa linha


/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 5. (1,0) Criar uma função que receba como parâmetro três
 *  números reais a, b, ce retorne a maior raiz da equação
de 2° grau: ax2+ bx + c. Nesta questão, você deve utilizar 
a fórmula de Báskara. Se não houver raízes reais, a
função deve retornar -1.
 * 
 */

import java.util.Scanner;

public class Exercicio5 {
	static float baskara (float a, float b, float c) {
		Scanner entrada = new Scanner(System.in);
		
		float  x1, x2;
		double raiz;
		double delta = ((b * b) - (4 * a * c));
		
		if(a > 0) {
			raiz = (float) Math.sqrt(delta);
		
		if(delta >= 0) {
		x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
		x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
		System.out.printf("Raízes: %.2f e %.2f", x1, x2);
		}
		
		else {
		delta = -delta;
		raiz = (double) Math.sqrt(delta - 0.1);
		
		System.out.println("\nResultado = " + delta);
		
		System.out.printf("A raiz é = %.2f ", raiz);
		
		System.out.printf("\nRaíz X1 = %.2f + %.2f\n", (-b ) /(2 * a),
				(raiz) / (2 * a ));
		
		System.out.printf("Raíz X2 = %.2f - %.2f\n", (-b ) / (2 * a),(raiz) / (2 * a ));
		//System.out.printf("\nRaíz positiva = %.2f + %.2f\n", (-b) / (2 * a), (raiz) / (2 * a));
		//System.out.printf("Raíz negativa = %.2f - %.2f\n", (-b) / (2 * a), (raiz) / (2 * a));
		}
		}else {
			System.out.println("\nResultado = -1");
			System.out.println("-1 = Não real\n");
		}
		entrada.close();
		
		return (float) delta;
		}		
		

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de A = ");
		float a = entrada.nextFloat();
		
		System.out.print("Digite o valor de b = ");
		float b = entrada.nextFloat();
		
		System.out.print("Digite o valor de c = ");
		float c = entrada.nextFloat();
		
		float sos = baskara(a, b, c);
		
		float raiz = (float) Math.sqrt(sos);
		
		entrada.close();
	}
}

