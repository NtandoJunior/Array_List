/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demo.arrays;

/**
 *
 * @author RC_Student_lab
 */
public class Arrays {

    public static void main(String[] args) {
       
        int [][] myNumbers = { {20, 50, 10}, {80, 25, 15}, {60, 100, 35}, {40, 75,45} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        
        
    }
}
