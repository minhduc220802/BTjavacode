/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b14.chuong11;

/**
 *
 * @author Admin
 */
public class OverWithdrawException extends InvalidAmountException {
    public OverWithdrawException(int balance, int transactions, int phi) throws Exception {
        super(balance, transactions, phi);
    }
}