/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula23_08_22;

/**
 *
 * @author erick.nsilva2
 */
public class Data {

    private int ano;
    private byte mes;
    private byte dia;

    public int getAno() {
        return this.ano;
    }

    public void setAno(int a) {
        if (a > 0) {
            this.ano = a;
        } else {
            System.out.println("Ano invalido!");
        }
    }

    public byte getDia() {
        return this.dia;
    }

    public void setDia(byte d) {
        if (d > 0 && d < 32) {
            this.dia = d;
        } else {
            System.out.println("Dia invalido!");
        }
    }

    public byte getMes() {
        return this.mes;
    }

    public void setMes(byte m) {
        if (m > 0 && m < 13) {
            mes = m;
        } else {
            System.out.println("Mes invalido");
        }
    }

    public boolean isAnoBisexto() {
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.print("");
            return true;
        }
        return false;
    }

}
