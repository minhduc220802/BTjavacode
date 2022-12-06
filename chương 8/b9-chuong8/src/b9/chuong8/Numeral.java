/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b9.chuong8;
interface Expression{
    public abstract void evaluate();
    public String toString();
}
/**
 *
 * @author Admin
 */
public class Numeral implements Expression {
    private int value;
    public void evaluate(){
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
