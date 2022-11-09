/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula23_08_22;

import java.util.Scanner;

/**
 *
 * @author erick.nsilva2
 */
public class DataDemo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Data d1 = new Data();

        System.out.print("Insira o dia: ");
        d1.setDia(entrada.nextByte());

        System.out.print("Insira o mes: ");
        d1.setMes(entrada.nextByte());

        System.out.print("Insira o Ano: ");
        d1.setAno(entrada.nextInt());

        boolean ano = d1.isAnoBisexto();
        String imprimir = String.format("\n%d/ %d/ %d", d1.getDia(), d1.getMes(), d1.getAno());

        System.out.print(imprimir);
        verificarAnoBissexto(d1);

        entrada.close();
    }

    private static void verificarAnoBissexto(Data data) {
        if (data.isAnoBisexto()) {
            System.out.print(" é um ano bissexto!\n");
        } else {
            System.out.print( " não é um ano é bissexto!\n");
        }
    }
    
}
