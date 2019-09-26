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
public class rega6 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
   for (int i=1;i<=10;i++){
             for(int j=10;j>=i;j--){
                 System.out.print(" ");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("6");
             }
             for (int l=1;l<=i-1;l++){
                 System.out.print("6");
             }
             System.out.println();
         }
   for (int i=1;i<=11;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int z=11;z>=i;z--){
              System.out.print("6");
              }
             for(int k=10;k>=i;k--){
               System.out.print("6");
               }
             System.out.println();
         }

 }

}
