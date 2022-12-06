/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9.chuong8;
interface BinaryExpression{
    public abstract void left();
    public abstract void right();
}
/**
 *
 * @author Admin
 */
public class Addition implements BinaryExpression  {
    private Expression left;
    private Expression right;
    public void left(){
        System.out.println();
    }
    public void right(){
        System.out.println();
    }
}
