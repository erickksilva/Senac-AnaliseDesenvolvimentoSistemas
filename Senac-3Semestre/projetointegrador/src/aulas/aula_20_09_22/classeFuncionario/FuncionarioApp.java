/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22.classeFuncionario;

/**
 *
 * @author erick.nsilva2
 */
public class FuncionarioApp {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Erick", "785");
        Funcionario f2 = new Funcionario("Erick", "785");

        if (f1.equals(f2)) {
            System.out.println("iguais");
            System.out.println(f1.getNome().hashCode());
            System.out.println(f1.getTelefone().hashCode());
            System.out.println(f1.hashCode());
            System.out.println("\nequals 2");
            System.out.println(f2.getNome().hashCode());
            System.out.println(f2.getTelefone().hashCode());

            System.out.println(f2.hashCode());
        } else {
            System.out.println("diferente");
        }
    }
}
