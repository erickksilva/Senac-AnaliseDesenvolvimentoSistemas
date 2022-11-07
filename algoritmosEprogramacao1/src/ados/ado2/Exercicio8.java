package ados.ado2;

//O enunciado est� junto com author, encontrado aqui ou abaixo dessa linha
/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 *
 * 8. (2,0) Um n�mero inteiro � dito perfeito se o dobro dele � igual � soma de
 * todos os seus divisores. Por exemplo, como os divisores de 6 s�o 1, 2, 3 e 6
 * e 1 + 2 + 3 + 6 = 12, 6 � perfeito. A matem�tica ainda n�o sabe se a
 * quantidade de n�meros perfeitos � ou n�o finita. Criar uma fun��o que receba
 * como par�metro um n�mero inteiro positivo N e apresente na tela a lista de
 * todos os n�meros n�meros inteiros positivos perfeitos menores N.
 *
 */
//O enunciado est� junto com author, encontrado aqui ou abaixo dessa linha
/**
 * @author Amauri Ferreira da Silva
 * @author Erick Nunes da Silva
 * @author Lucas Brendon da Silva Frois
 *
 * 8. (2,0) Um n�mero inteiro � dito perfeito se o dobro dele � igual � soma de
 * todos os seus divisores. Por exemplo, como os divisores de 6 s�o 1, 2, 3 e 6
 * e 1 + 2 + 3 + 6 = 12, 6 � perfeito. A matem�tica ainda n�o sabe se a
 * quantidade de n�meros perfeitos � ou n�o finita. Criar uma fun��o que receba
 * como par�metro um n�mero inteiro positivo N e apresente na tela a lista de
 * todos os n�meros n�meros inteiros positivos perfeitos menores N.
 *
 */

import java.util.Scanner;

public class Exercicio8 {

    public static int perfeito(int n) {

        int soma = 0, i;
        if (n <= 0) {
            System.out.println("O numero deve maior que Zero!");
        }
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += 1;
                System.out.println("Numero perfeito = " + i);
            }
        }
        if (soma == n) {
            System.out.println(i);

        }
        return i;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o numero: ");
        int n = entrada.nextInt();
        int b = perfeito(n);

        entrada.close();

    }
}
