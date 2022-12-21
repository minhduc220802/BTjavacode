/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b9.chuong11;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            try{
                String str=null;
                System.out.println(str.length());
            
            }
            catch(NullPointerException e){
                System.out.println("NullPointerException. ");
            }
            File file =new File("C:\\newfile.txt");
            boolean fvar = file.createNewFile();
        }
        catch(IOException ioe){
            System.out.println("Some input/output error! ");
        }
    
    }
}
