/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dvdplayertestdrive;
class DVDPlayer{
    boolean canRecord = false;
    void playDVD(){
        System.out.println("DVD play");
    }
    
    void recordDVD(){
        System.out.println("DVD recording");
    }
}
/**
 *
 * @author Admin
 */
public class DVDPlayerTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true){
            d.recordDVD();
        }
        // TODO code application logic here
    }
    
}
