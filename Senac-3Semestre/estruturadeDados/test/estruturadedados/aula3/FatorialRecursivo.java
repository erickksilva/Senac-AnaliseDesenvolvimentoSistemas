/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_14_09;

/**
 *
 * @author erick.nsilva2
 */
public class FatorialRecursivo {
    
    public static int fat(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fat(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(fat(4));
        
        int n = 4;
        int i = 0;
        int temp = 0;

//        for (i = 1; i < n; i++) {
//            temp += n * i;
//        }
//            System.out.println(temp);
    }
}
