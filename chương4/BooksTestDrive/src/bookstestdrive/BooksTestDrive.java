/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstestdrive;
class Books{
    String title;
    String author;
}
/**
 *
 * @author Admin
 */
public class BooksTestDrive {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Books [] myBooks = new Books [3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        
        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print("by");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
        // TODO code application logic here
    }
    
}
