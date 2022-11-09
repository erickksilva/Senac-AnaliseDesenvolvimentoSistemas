/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_31_08_22;

import java.util.Scanner;

/**
 *
 * @author erick.nsilva2
 */
public class ArraysObjetos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //como o metodo  MetodosArrays.inserir(obj) recebe um objeto do tipo Pessoa
        //ele pode criar o objeto da classe pessoa direto pelo parametro do metodo 
        // MetodosArrays.inserir(), atraves do construtor criado dentro da clase Pessoa
        MetodosArrays.inserir(new Pessoa("Erick", 23));;
        MetodosArrays.inserir(new Pessoa("Lucas", 25));;
        MetodosArrays.inserir(new Pessoa("Amauri", 26));;
        MetodosArrays.inserir(new Pessoa("Marcos Leonardo", 20));;
        MetodosArrays.inserir(new Pessoa("Soteldo ", 30));;
        MetodosArrays.inserir(new Pessoa("Joao paulo", 28));;
        MetodosArrays.inserir(new Pessoa("Rodrigo fernandez", 24));;
        MetodosArrays.exibir();

        System.out.print("\nInsira o array que deseja remover: ");
        int num = entrada.nextInt();

        System.out.println("\nRemovendo......");
        if (MetodosArrays.remover(num)) {
            System.out.println("Indice removido.");
            MetodosArrays.exibir();
        } else {
            System.out.println("Indice não encontrado.");
        }
        
        System.out.println();
        System.out.println("Atualizando nome...");
        MetodosArrays.atualizarNome(5);
        entrada.close();
    }
}
