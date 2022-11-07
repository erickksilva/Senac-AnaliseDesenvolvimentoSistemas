package ado2;

//O enunciado est� junto com author, encontrado aqui ou abaixo dessa linha

/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 * 
 * 7. (2,0) Criar uma fun��o chamada somatoria que tem como
 *par�metro um n�mero inteiro positivo Ne retorna a
soma de todos os n�meros inteiros positivos menores ou iguais a N.
Criar uma outra fun��o chamada fatorial que tem como par�metro 
um n�mero inteiro positivo Ne retorna o fatorial desse n�mero.
A fun��o main do programa deve ler um n�mero inteiro positivo N 
e apresentar a divis�o do produto dos N primeiros n�meros positivos
pela soma dos Nprimeiros n�meros positivos.
 */

import java.util.Scanner;

public class Exercicio7 {
	Scanner entrada = new Scanner(System.in);

	public static int somatoria(int n) {

		int otimo = 0;
		int f = 0;

		if (n < 0) {
			System.out.print("O numero deve ser positivo!");
		}
		for (int a = 1; a <= n; a += 1) {
			otimo += a;
			System.out.print(otimo + " ");
		}
		System.out.println("\n\nSoma = " + otimo);
		return n;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor de N: ");
		int valor = entrada.nextInt();
		int valof = somatoria(valor);

		System.out.print("\nInsira o valor de x: ");
		float ft = entrada.nextFloat();
		float fat = fatorial(ft);

		int j, i, sm;

		System.out.print("\n\nDigite o valor de N: ");
		int re = entrada.nextInt();

		sm = 0;
		i = 1;

		while (i <= re) {
			sm = sm + i;
			i = i + 1;
		}
		System.out.printf("Soma 'N' positivos = %d\n", sm);

		float b = sm / fat;
		System.out.printf("Divis�o = %.2f ", b);
		entrada.close();
	}

	public static float fatorial(float n) {
		float fat = 1;

		for (float i = 2; i <= n; i++) {

			fat *= i;
		}
		System.out.print("fatorial " + n + " = " + fat);
		return n;
	}
}
