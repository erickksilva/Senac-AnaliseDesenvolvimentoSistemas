/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Exercicio8 {

    public static void main(String[] args) {

        /*Um cinema possui capacidade de 20 lugares e está sempre com 
		 * ocupação total. Certo dia, cada espectador respondeu a um questionário, 
		 * na qual constava: 
		 * sua idade;
		sua opinião em relação ao filme, segundo as seguintes notas:
	 	 Nota ||  Significado
			A || Ótimo
			B || Bom
			C || Regular
			D || Ruim
			E || Péssimo	
	 	Criar um programa que, lendo estes dados, calcule e apresente:
		• a quantidade de respostas Ótimo;
		• a média de idade das pessoas que responderam Ruim;
		• a porcentagem de respostas Péssimo e a maior idade que utilizou esta opção;
		• a diferença de idade entre a maior idade que respondeu Ótimo e a maior idade 
		que respondeu Ruim.
         */
        Scanner entrada = new Scanner(System.in);
        int c = 1;
        int otimo = 0, bom = 0, regular = 0;
        int ruim = 0, pessimo = 0, idadePessimo = 0;
        int idadeRuim = 0, maiorOtimo = 0;
        int maiorRuim = 0;
        float mediaRuim = 0;

        while (c <= 20) {
            System.out.println("Insira a idade: ");
            int idade = entrada.nextInt();

            System.out.println("Insira a Nota: A, B, C, D, E. ");
            char nota = entrada.next().toUpperCase().charAt(0);

            switch (nota) {
                case 'A':
                    otimo += 1;
                    System.out.println("A = Otimo");
                    if (idade > maiorOtimo) {
                        maiorOtimo = idade;
                    }   break;
                case 'B':
                    bom += 1;
                    System.out.println("B = Bom");
                    break;
                case 'C':
                    regular += 1;
                    System.out.println("C = Regular");
                    break;
                case 'D':
                    ruim += 1;
                    idadeRuim = idadeRuim + idade;
                    System.out.println("D = Ruim");
                    mediaRuim = idadeRuim / ruim;
                    if (idade > maiorRuim) {
                        maiorRuim = idade;
                    }   break;
                case 'E':
                    pessimo += 1;
                    System.out.println("E = Pessimo");
                    if (idade > idadePessimo) {
                        idadePessimo = idade;
                    }   break;
                default:
                    break;
            }
            c = c + 1;
        }
        int diFinal = maiorOtimo - maiorRuim;
        float porcPessimo = (float) (pessimo * 100) / 20;
        System.out.println("\nO total de nota Otimo = " + otimo);
        System.out.println("A média idade da nota ruim = " + mediaRuim);
        System.out.println("A porcentagem de pessimo = " + porcPessimo);
        System.out.println("Maior idade da nota Pessimo = " + idadePessimo);
        System.out.println("A diferença entre maior idade Otimo e Ruim = " + diFinal);

    }

}
