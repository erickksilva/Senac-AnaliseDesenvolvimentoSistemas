/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_14_09;

/**
 *
 * @author erick.nsilva2
 */
public class SelectionSort {

    public static void main(String[] args) {

        int temp;
        int[] v = {4, 16, 8, 2, 1};
        for (int j = 0; j < v.length - 1; j++) { //Varreduras
            int menor = j;//índice
            for (int i = j + 1; i < v.length; i++) {//Comparações
                if (v[menor] > v[i]) {
                    menor = i;
                }
            }
            //Troca
            temp = v[menor];
            v[menor] = v[j];
            v[j] = temp;
            
            System.out.println(v[j]);
        }

    }
}
