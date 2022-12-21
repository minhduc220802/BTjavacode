/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b10.chuong11;
/**
 *
 * @author Admin
 */
public class B10Chuong11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            try{
                try{
                int a[] = new int [5];
                a[5] =4;
                }
                catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                }
            System.out.println("Thuc hien phep chia");
            int b=20/0;
            }
            catch(ArithmeticException e){
            System.out.println(e);
            }
        }
        catch(Exception e){
        System.out.println("Exception");
        }
        System.out.println("...");
        // TODO code application logic here
    }
    
}
