/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14.chuong11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Account {
    int balance;
    private int transactions;
    public Account(int balance, int transactions){
        this.balance= balance;
        this.transactions=transactions;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getTransactions(){
        return this.transactions;
    }
    public void setTransactions(){
        this.transactions=transactions;
    }
    public void getInfo(){
        System.out.println("balance" +this.balance);
        System.out.println("transactions"+this.transactions);
    }
    public static Scanner sc = new Scanner(System.in);
    public void deposit(){
        System.out.println("Nhap so tien ban muon gui: ");
        int gui = sc.nextInt();
        if(gui > 0){
            balance = gui + balance;
            System.out.println("Ban da gui " + gui + " vao tai khoan");
            System.out.println("So tien trong tk la: "+ balance);
        }
        else{
            System.out.println("So tien k hop le! ");
        }
    }
    
}
