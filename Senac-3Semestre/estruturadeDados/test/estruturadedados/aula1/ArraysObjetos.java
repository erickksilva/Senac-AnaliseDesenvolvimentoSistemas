/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_24_08;

/**
 *
 * @author erick.nsilva2
 */
public class ArraysObjetos {

    public static void main(String[] args) {
       
        
        //como o metodo  MetodosArrays.inserir(obj) recebe um objeto do tipo Pessoa
        //ele pode criar o objeto da classe pessoa direto pelo parametro do metodo 
        // MetodosArrays.inserir(), atraves do construtor criado dentro da clase Pessoa
        MetodosArrays.inserir(new Pessoa("Erick", 23));;
        MetodosArrays.inserir(new Pessoa("Lucas", 25));;
        MetodosArrays.inserir(new Pessoa("Amauri", 26));;
        MetodosArrays.inserir(new Pessoa("Marcos Leonardo", 20));;
        MetodosArrays.inserir(new Pessoa("Marcos Leonardo", 20));;

        MetodosArrays.exibir();

    }
}
