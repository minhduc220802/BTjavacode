/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xcopy;

/**
 *
 * @author Admin
 */
public class XCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int orig = 42;
        System.out.print("orig=");
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " ,arg=" +y);
        // TODO code application logic here
    }
    int go(int arg){
        arg = arg * 2;
        return arg;
    }
    
}
