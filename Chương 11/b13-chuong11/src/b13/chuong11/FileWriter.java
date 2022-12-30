/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b13.chuong11;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Admin
 */
public class FileWriter {
    public static void write(String fileName, String s) throws FileNotFoundException{
        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file);
        out.print(s);
        out.close();
    }
}
