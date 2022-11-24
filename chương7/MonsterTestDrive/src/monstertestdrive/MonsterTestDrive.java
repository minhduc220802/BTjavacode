/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monstertestdrive;

/**
 *
 * @author Admin
 */
public class MonsterTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        ma[1].frighten();
        // TODO code application logic here
    }
}
class Monster{
    public void frighten(){
        System.out.println("a bite?");
        System.out.println("breath fire");
        System.out.println("arrgh");
    }
    // insert code here
}
class Vampire extends Monster {
    // insert code here
}
class Dragon extends Monster {
    }