/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6.chuong7;
import static java.util.Calendar.DATE;

/**
 *
 * @author Admin
 */
public class NickelNDime extends Account{
    private int phi;
    public NickelNDime(int balance, int transactions, int phi){
        super(balance,transactions);
        this.phi= phi;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("phi" +this.phi);
    }
    public void withdraw(){
    if(phi<balance){
        System.out.println("Nhap so tien ban can rut: ");
        int rut = sc.nextInt();
    if(rut <= balance){
        phi = phi + 2000;
        if(phi<=(balance-rut)){
            if(DATE==ngayCuoiThang){
            balance = balance - phi;
            System.out.println("Tong phi trong thang nay la: " + phi + "(phi moi lan rut la 2000)");
            System.out.println("So tien trong tk la: " + balance);
            }
            else{
            balance = balance - rut;
            System.out.println("Tong phi thang nay la: " + phi);
            System.out.println("Ban vua rut " + rut + " khoi tk");
            System.out.println("So tien trong tk la: " + balance);
            }
        }
        else{
            System.out.println("Ban khong dung duoc dich vu nay ");
        }
    }
    else{
        System.out.println("Tai khoan k du dieu kien rut! ");
        }
    }
    else{
        System.out.println("Ban khong dung duoc dich vu nay");
    }
    solanrut.add("");
    System.out.println("So lan rut la: " + solanrut.size() );
    SLrut = solanrut.size();
    }
}
