/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multifor;

/**
 *
 * @author Admin
 */
public class Multifor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int x=0; x<4 ; x++){ 
            for (int y=4; y>2; y--){  
                System.out.println(x + " " + y);
            }
             if (x==1){
                x++;
            }
        }   
        // TODO code application logic here
    }
    
}
