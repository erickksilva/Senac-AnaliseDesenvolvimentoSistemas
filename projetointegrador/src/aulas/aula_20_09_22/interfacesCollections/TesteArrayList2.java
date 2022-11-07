/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22.interfacesCollections;

import aulas.aula_20_09_22.classeFuncionario.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erick.nsilva2
 */
public class TesteArrayList2 {

    private static void imprimeFuncionarios(ArrayList lista) {
        Funcionario func;

        System.out.println("Quantidade de funcionarios " + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            func = (Funcionario) lista.get(i);
            System.out.println(i + ": " + func);
        }
        System.out.println("********Fim********");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resp = 0;

        entrada.close();
    }
}
