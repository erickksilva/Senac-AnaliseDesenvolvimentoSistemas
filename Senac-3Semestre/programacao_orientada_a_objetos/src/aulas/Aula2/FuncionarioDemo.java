/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.Aula2;

/**
 *
 * @author erick.nsilva2
 */
public class FuncionarioDemo {

    public static void main(String[] args) {

        System.out.println("*****Classe mensalista*****");
        FuncionarioMensalista func = new FuncionarioMensalista("Erick Silva", 58.99);

        System.out.println("\n*****Classe tarefista*****");
        FuncionarioTarefista func2 = new FuncionarioTarefista("Erick Nunes da Silva", 5);
        func2.showDim();

        System.out.println("\n*****Classe horista*****");
        FuncionarioHorista func3 = new FuncionarioHorista("Lewis hamilton", 8);
        func3.showDim();
    }
}
