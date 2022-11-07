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
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       /* 7. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados
utilizados para a apuração obedecem à seguinte codificação:
        1, 2, 3, 4 = voto para os respectivos candidatos;
        • 5 = voto nulo;
        • 6 = voto em branco
        Criar um programa que calcule e apresente:
        • o total de votos para cada candidato e seu porcentual sobre o total;
        • o total de votos nulos e seu porcentual sobre o total;
        • o total de votos em branco e seu porcentual sobre o total.
        Como finalizador do conjunto de votos, tem-se o valor 0.
        */
       
        int canditado1 = 0; //Votos digitado acima de 8 nao entrada na contagem
        int canditado2 = 0;
        int canditado3 = 0;
        int canditado4 = 0;
        int branco = 0;
        int nulo = 0;

        System.out.println("Insira o numero do voto: 1, 2, 3, 4, 5, 6");
        int voto = entrada.nextInt();
        while (voto != 0) {

            switch (voto) {
                case 1:
                    canditado1++;
                    break;
                case 2:
                    canditado2 += 1;
                    break;
                case 3:
                    canditado3 += 1;
                    break;
                case 4:
                    canditado4 += 1;
                    break;
                case 5:
                    branco += 1;
                    break;
                case 6:
                    nulo += 1;
                    break;
                case 7:
                    System.out.println("Candidato invalido.");
                break;
            }
            System.out.println("Insira o numero do voto: 1, 2, 3, 4, 5, 6");
            voto = entrada.nextInt();
        }
        System.out.println();
        float porCand1 = (float) canditado1 * canditado1 / 100;
        float porCand2 = (float) canditado2 * canditado2 / 100;
        float porCand3 = (float) canditado3 * canditado3 / 100;
        float porCand4 = (float) canditado4 * canditado4 / 100;
        float porBranco = (float) branco * branco / 100;
        float porNulo = (float) nulo * nulo / 100;
        int totalVotos = canditado1 + canditado2 +
                + canditado3 + canditado3 + branco + nulo;
        float porTotalVotos = (float) totalVotos * totalVotos / 100;
        
        System.out.println("Canditado1 Total de votos = " + canditado1 +
                " e o porcentual total = " + porCand1);
        
        System.out.println("\nCanditado2 Total de votos = " + canditado2 +
                " e o porcentual total = " + porCand2);
        
        System.out.println("\nCanditado3 Total de votos = " + canditado3 +
                " e o porcentual total = " + porCand3);
        
        System.out.println("\nCanditado4 Total de votos = " + canditado4 +
                " e o porcentual total = " + porCand4);
        
        System.out.println("\nTotal de votos Branco = " + branco +
                " e o porcentual total = " + porBranco);
        
        System.out.println("\nTotal de votos Nulo = " + nulo +
                " e o porcentual total = " + porNulo);
        
        System.out.println("\nTotal de Votos = " + totalVotos + " e o porcentual total = " 
                + porTotalVotos );
    }
}
