/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dice;
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class Dice {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<1; i++){
        Random rand = new Random();
            int ranNum = rand.nextInt(6)+1;
            System.out.println("Gia tri xx :  " + ranNum);
        }
    } 
}
