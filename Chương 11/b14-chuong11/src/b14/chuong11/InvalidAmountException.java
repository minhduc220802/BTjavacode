/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14.chuong11;
import java.lang.Exception;
/**
 *
 * @author Admin
 */
public class InvalidAmountException extends Gambler{
    public InvalidAmountException(int balance, int transactions, int phi) throws Exception{
        super(balance, transactions, phi);
        if(balance<=0){
            throw new Exception("so tien khong hop le!");
        }
    }
}
