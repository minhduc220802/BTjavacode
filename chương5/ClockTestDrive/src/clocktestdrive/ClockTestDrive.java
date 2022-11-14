/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clocktestdrive;
class Clock {
    String time;
    void setTime(String t){
        time = t;
    }
    String getTime(){
        return time;
    }
}
/**
 *
 * @author Admin
 */
public class ClockTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
        // TODO code application logic here
    }
    
}
