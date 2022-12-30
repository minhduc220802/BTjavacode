/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b11.chuong11;
import java.io.*;
class SomeException{
    public static void findFile() throws IOException {
    File newFile=new File("test.txt");
    if(newFile.exists() && !newFile.isDirectory()) { 
    }
    else{
        throw new IOException("File not found");
    }
  }
}
/**
 *
 * @author Admin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SomeException se = new SomeException();
        try{
            se.findFile();
        }
        catch(IOException e){
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}
