/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula3;

/**
 *
 * @author erick.nsilva2
 */
public class ColaboradorDemo {

    public static void main(String[] args) {
        Colaborador c1 = new Colaborador("senac01", "erick", "senac-sp", "04/05/2022");
        c1.calcularSalario();

        Colaborador c2 = new Mensalista("snsp01", "erick nunes da silva", "senac-sp", "04/05/2022", 227.27, 22);
        c2.calcularSalario();
    }

}
