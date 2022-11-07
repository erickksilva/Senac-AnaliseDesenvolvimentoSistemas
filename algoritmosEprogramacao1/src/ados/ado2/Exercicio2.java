package ado2;


//O enunciado está junto com author, encontrado aqui ou abaixo dessa linha

/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 2.(1,0) Criar uma função que receba como parâmetros a
 *altura e o sexo de uma pessoa (M ou F), calcule e retorne
 *o seu peso ideal. A função main do programa deve ler a 
 *altura e sexo da pessoa, chamar a função criada e 
 *apresentar na tela o dado retornado pela função.
 * A fórmula para o cálculo do peso ideal é:
 
• para homens: (72.7 * altura) - 58
• para mulheres: (62.1 * altura) - 44.7
 * 
 */

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float resutado = 0;
		
		System.out.print("Sexo (M ou F): ");
		char sexo = leitor.next().charAt(0);
		
		System.out.println("digite sua altura:");
		
		float altura = leitor.nextFloat();
		resutado = calculoPeso(altura, sexo);
		
		leitor.close();
	}

	public static float calculoPeso(float altura, char sexo) {
		float alturaPeso = 0;
		
		if (sexo == 'm' || sexo == 'M') {
			alturaPeso = 72.7f * altura - 58;
		} else if (sexo == 'f' || sexo == 'F') {
			alturaPeso = 62.1f * altura - 44.7f;
		} else {
			System.out.println("informação invalida");
		}
		System.out.printf("seu peso ideal = %.0f", alturaPeso);
		return (float) alturaPeso;

	}
}
