/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b12.chuong11;

import java.io.InvalidClassException;

/**
 *
 * @author Admin
 */
public class Demo {
static void someMethod2(){
    String message = "Oops.";
    throw new NullPointerException(message);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            try {
                someMethod();
            } catch (InvalidClassException ex) {
            }
        }
        catch(NullPointerException npe){
            npe.printStackTrace();
        }
        // TODO code application logic here
    }
    static void someMethod() throws InvalidClassException{
        someMethod2();
    }
}
