/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b13.chuong11;
/**
 *
 * @author Admin
 */
public class WriteToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileWriter.write("Hello.txt", "Hello!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
