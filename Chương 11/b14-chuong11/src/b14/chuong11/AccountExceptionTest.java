/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b14.chuong11;

/**
 *
 * @author Admin
 */
public class AccountExceptionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
        OverWithdrawException oe = new OverWithdrawException(0,0,0);
        oe.withdraw();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
