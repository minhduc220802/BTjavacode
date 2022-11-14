/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hobbits;

/**
 *
 * @author Admin
 */
public class Hobbits {

    String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hobbits [] h = new Hobbits[4];
        int z = 0;
        
        while (z < h.length -1){
            z=z+1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z==1){
                h[z].name= "frodo";
                
            }
            if (z==2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + "is a");
            System.out.println( "good Hobbit name");
        }
        // TODO code application logic here
    }
    
}
