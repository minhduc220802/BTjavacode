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
        ma[0] = new Monster();
        ma[1] = new Dragon();
        ma[2] = new Vampire();
        for(int i=0;i<3;i++){
            ma[i].frighten();
        }
        // TODO code application logic here
    }
}
class Monster{
    public void frighten(){
        System.out.println("a bite?");
    }
    // insert code here
}
class Vampire extends Monster {
    public void frighten(){
        System.out.println("arrrg");
    }
}
class Dragon extends Monster {
    public void frighten(){
        System.out.println("breath fire");
    }
}