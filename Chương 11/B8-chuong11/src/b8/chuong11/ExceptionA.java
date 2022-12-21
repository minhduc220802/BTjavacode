/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b8.chuong11;

/**
 *
 * @author Admin
 */
public class ExceptionA {
    void msg()throws Exception{
        System.out.println("ExceptionA");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExceptionC ec = new ExceptionC();
        ExceptionB eb = new ExceptionB();
        try{
            ec.msg();
            eb.msg();
        }
        catch(Exception e){
        }
    }
}
        // TODO code application logic here


