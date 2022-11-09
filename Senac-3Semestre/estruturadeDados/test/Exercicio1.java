
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author eric
 */
public class Exercicio1 {

    public static void main(String[] args) {

        float[][] nums = new float[5][5];
        Random rd = new Random();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = rd.nextFloat() * 50;
                System.out.println(nums[i][j]);

            }
        }
    }
}
