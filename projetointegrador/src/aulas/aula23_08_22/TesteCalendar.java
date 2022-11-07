/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.aula23_08_22;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author erick.nsilva2
 */
public class TesteCalendar {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        
        System.out.println("");
        c.set(Calendar.YEAR, 1990);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DAY_OF_MONTH, 25);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        
       
    }
}
