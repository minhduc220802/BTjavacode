/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b6.chuong7;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;
import static java.util.Calendar.DATE;
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
    
    public void deposit(){
        System.out.println("Nhap so tien ban muon gui: ");
        int gui = sc.nextInt();
        if(gui > 0){
            balance = gui + balance;
            System.out.println("Ban da gui " + gui + " vao tai khoan");
            System.out.println("So tien trong tk la: "+ balance);
            solangui.add("");
            System.out.println("So lan gui la: " + solangui.size() );
            SLgui = solangui.size();
        }
        else{
            System.out.println("So tien k hop le! ");
        }
    }
    public void endMonth(){
        if(DATE==ngayCuoiThang){
        transactions =0;
        transactions = SLgui + SLrut;
        System.out.println("So lan giao dich trong thang la: " + transactions);
        }
        else{
        transactions = SLgui + SLrut;
        System.out.println("So lan giao dich trong thang la: " + transactions);
        }
    }
    public void endMonthCharge(){
        int phiTK = 500;
        if(DATE==ngayDauThang){
            balance = balance + phiTK;
            System.out.println("Phi tai khoan thang vua qua: " + phiTK);
            System.out.println("So tien trong tk la: "+ balance);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    ArrayList<String> solangui = new ArrayList<>();
    ArrayList<String> solanrut = new ArrayList<>();
    
    public static Calendar cal = Calendar.getInstance();
    public static Date date = cal.getTime();    
    int ngayDauThang = cal.getActualMinimum(Calendar.DATE);
    int ngayCuoiThang = cal.getActualMaximum(Calendar.DATE);
    int SLgui = solangui.size();
    int SLrut = solanrut.size();
    
    public static void main(String[] args) {
        System.out.println(cal.getTime());
        NormalAccount na = new NormalAccount(100000,0,10000);
        NickelNDime nd = new NickelNDime(100000,0,0);
        Gambler g = new Gambler(100000,0,0);
        
    int b ;
    do {
        System.out.println("\nChon ngan hang: ");
        System.out.println( "1.NormalAccount\n" + "2.NikelNDime\n" + "3.Gambler\n" + "4.Thoat\n");
        b = sc.nextInt();
        switch(b){
            case 1:
                System.out.println("Dich vu cua NormalAccount: ");
                na.endMonthCharge();
                System.out.println("1.Gui tien\n" + "2.Rut tien\n" + "3.So lan giao dich\n" + "4.Thoat\n");
                b = sc.nextInt();
                switch(b){
                    case 1:
                        na.deposit();
                    break;
                    case 2:
                        na.withdraw();
                    break;
                    case 3:
                        na.endMonth();
                    break;
                    case 4:
                    break;
                }
                break;
            case 2:
                System.out.println("Dich vu cua NikelNDime: ");
                nd.endMonthCharge();
                System.out.println("1.Gui tien\n" + "2.Rut tien\n" + "3.So lan giao dich\n" + "4.Thoat\n");
                b = sc.nextInt();
                switch(b){
                    case 1:
                        nd.deposit();
                    break;
                    case 2:
                        nd.withdraw();
                    break;
                    case 3:
                        nd.endMonth();
                    break;
                    case 4:
                    break;
                }
                break;
            case 3:
                System.out.println("Dich vu cua Gambler: ");
                g.endMonthCharge();
                System.out.println("1.Gui tien\n" + "2.Rut tien\n" + "3.So lan giao dich\n" + "4.Thoat\n");
                b = sc.nextInt();
                switch(b){
                    case 1:
                        g.deposit();
                    break;
                    case 2:
                        g.withdraw();
                    break;
                    case 3:
                        g.endMonth();
                    break;
                    case 4:
                    break;
                }
                break;
            case 4:
                System.out.println("Thoat");
                return;
            

        }
    }while(true);
        // TODO code application logic here
    }
}
