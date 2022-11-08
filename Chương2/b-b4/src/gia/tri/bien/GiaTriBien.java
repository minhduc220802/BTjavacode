/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gia.tri.bien;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class GiaTriBien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double count;
        System.out.print("Enter your count =");
        count = input.nextDouble();
        if (count < 10)
            System.out.println("Faild");
        else
            System.out.println("count is greater than 10");
        
        
        // TODO code application logic here
    }
    
}
