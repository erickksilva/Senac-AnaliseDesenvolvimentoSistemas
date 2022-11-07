package ado2;

//O enunciado está junto com author, encontrado aqui ou abaixo dessa linha

/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 1. (1,0) Criar uma função que receba como parâmetro o
 *valor do raio de uma esfera, calcule e retorne o volume
 *desta esfera. A função main do programa deve ler um raio,
 *chamar a função criada e apresentar na tela o dado retornado
  pela função. Fórmula: V = 4/3 π R3.
 * 
 */

import java.util.Scanner;


public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Insira valor do raio: ");
		float raio = leitor.nextFloat();

		float esfera = volume(raio);

		leitor.close();

	}

	public static float volume(float raio) {
		double pi, valor;
		pi = 3.14;
		valor = 4 / 3 * (pi * Math.pow(raio, 3));
		System.out.printf("volume da esfera: %.2f", valor);
		return (float) valor;
	}
}
