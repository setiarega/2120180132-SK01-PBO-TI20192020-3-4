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
public class rega4 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i <= 10; i++) {
            for (int k = 10; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("4");
            }
            for (int k = 1; k <= i-1; k++) {
                System.out.print("4");
            }
            System.out.println();
        }
    }
}