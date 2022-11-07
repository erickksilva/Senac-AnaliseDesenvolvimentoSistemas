/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula_20_09_22;

/**
 *
 * @author erick.nsilva2
 */
public class PessoaApp {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jessica", "752");
        Pessoa p2 = new Pessoa("Jessica", "752");
        
       
        if (p1.equals(p2)) {
            System.out.println("p1 eh igual p2 com equals da classe Object.");
        } else {
            System.out.println("P1 != p2 com equals da classe Object.");
        }

    }
}
