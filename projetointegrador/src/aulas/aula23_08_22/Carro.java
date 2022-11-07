/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula23_08_22;

import java.util.Calendar;

/**
 *
 * @author erick.nsilva2
 */
public class Carro {

    public static String placa = "ABD-1563";

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Carro.placa: " + Carro.placa);
        System.out.println("carro1.placa: " + carro1.placa);
        System.out.println("carro2.placa: " + carro2.placa);

        System.out.println("\nAlterando a placa do carro1");
        carro1.placa = "DBX-4034";

        System.out.println("carro1.placa: " + carro1.placa);
        System.out.println("carro2.placa: " + carro2.placa);
        System.out.println("Carro.placa: " + Carro.placa);
        
        Calendar calendario = Calendar.getInstance();
        
        System.out.println(calendario.getTime());
    }
}
