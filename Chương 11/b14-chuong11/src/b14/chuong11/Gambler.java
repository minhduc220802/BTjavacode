/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14.chuong11;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Gambler extends Account {
    private int phi;
    public Gambler(int balance, int transactions, int phi){
        super(balance,transactions);
        this.phi= phi;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("phi" +this.phi);
    }
    public void withdraw() throws Exception{
        int rut=sc.nextInt();
        if(rut>balance/2){
            throw new Exception("Rut tien qua so luong cho phep");
        }
        else{
        balance = balance - rut;
        System.out.println("Ban vua rut " + rut + " khoi tk");
        System.out.println("So tien trong tk la: " + balance);
        }
    }
}
