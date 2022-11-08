/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package output;

/**
 *
 * @author Admin
 */
public class Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }
    void go() {
        int y=7;
        for (int x =1; x <8;x++){
            y++;
            if (x > 4){
                System.out.print(++y + " ");
            }
            if (y >14){
                System.out.println(" x=" +x);
                break;
            }
        }
        // TODO code application logic here
    }
    
}
