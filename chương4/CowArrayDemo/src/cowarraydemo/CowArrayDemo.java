/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cowarraydemo;
class CowArray {
    String foo;
    String bar;
}
/**
 *
 * @author Admin
 */
public class CowArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CowArray [] cow = new CowArray [2];
        cow[0] = new CowArray();
        cow[1] = new CowArray();
        int x = 0;
        cow[0].foo = "";
        cow[1].foo = "";
        cow[0].bar = "";
        cow[1].bar = "";
        while (x < 2){
            System.out.print(cow[x].foo);
            System.out.print("");
            System.out.println(cow[x].bar);
            x = x + 1;
        }
        // TODO code application logic here
    }
    
}
