/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6.chuong7;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class Gambler extends Account{
    private int phi;
    public Gambler(int balance, int transactions, int phi){
        super(balance,transactions);
        this.phi= phi;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("phi" +this.phi);
    }
    public void withdraw(){
        System.out.println("Nhap so tien ban can rut: ");
        int rut = sc.nextInt();
        Random rd = new Random();
        boolean bool = rd.nextBoolean();
        if(rut <= (balance+phi)){
            if(bool == true){
            balance = balance - rut;
            System.out.println("Ban vua rut " + rut + " khoi tk ma k mat phi");
            System.out.println("So tien trong tk la: " + balance);
            }
            else{
            phi=rut;
            balance = balance - (rut + phi);
                if(balance>=0){
                    System.out.println("Ban vua rut " + rut + " khoi tk voi phi la: " + phi);
                    System.out.println("So tien trong tk la: " + balance);
                }
                else{
                    System.out.println("So tien k hop le do tai khoan khong du!");
                    balance = rut + phi + balance;
                }
            }
        }
        else{
            System.out.println("so tien khong hop le!");
        }
        solanrut.add("");
        System.out.println("So lan rut la: " + solanrut.size() );
         SLrut = solanrut.size();
    }
}
