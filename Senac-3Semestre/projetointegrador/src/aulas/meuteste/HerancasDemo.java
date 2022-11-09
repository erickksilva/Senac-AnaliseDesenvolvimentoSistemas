/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.meuteste;

/**
 *
 * @author erick.nsilva2
 */
public class HerancasDemo {

    public static void main(String[] args) {
        Mae m1 = new Mae("Maria", 50);

        Filho f1 = new Filho("Marcos", 35, "SIm", 2);
        
        
        System.out.println(f1.getIdade());
        System.out.println(f1.getNome());
        
    }
}
