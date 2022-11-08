/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sounddecktestdrive;
class SoundDeck {
    boolean canRecord = false;
    void play(){
        System.out.println("playing");
    }
    void record(){
        System.out.println("recording");
    }
}
/**
 *
 * @author Admin
 */
public class SoundDeckTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoundDeck t = new SoundDeck();
        t.canRecord = true;
        t.play();
        if (t.canRecord == true){
            t.record();
        }
        // TODO code application logic here
    }
    
}
