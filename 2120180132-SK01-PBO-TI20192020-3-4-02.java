/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rega23;

/**
 *
 * @author setiarega23
 */
public class rega2 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 1; i <= 9; i++) {
            for (int k = 9; k >= i; k--) {
                System.out.print("2");
            }
            System.out.println();
        }
    }
}