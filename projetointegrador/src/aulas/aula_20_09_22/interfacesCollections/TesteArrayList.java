/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22.interfacesCollections;

import aulas.aula_20_09_22.classeFuncionario.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author erick.nsilva2
 */
public class TesteArrayList {

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

        //Cria objetos da classe Funcionario
        Funcionario func1 = new Funcionario("Joao", 35);
        Funcionario func2 = new Funcionario("Gerson", 42);
        Funcionario func3 = new Funcionario("Renato", 27);

        //Adicionando funcionarios no arrayList
        ArrayList funcionarios = new ArrayList();

        funcionarios.add(func1);
        funcionarios.add(func2);
        funcionarios.add(func3);

        imprimeFuncionarios(funcionarios);
        System.out.println("\nO funcionario 1 sera removido.");
        Funcionario funcRemovido = (Funcionario) funcionarios.remove(1);
        System.out.println("Funcionario removido " + funcRemovido);
        
        System.out.println();
        imprimeFuncionarios(funcionarios);

    }
}
