/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b9.chuong8;
interface Expression{
    public abstract void evaluate();
    public String toString();
}
/**
 *
 * @author Admin
 */
interface BinaryExpression extends Expression{
    public abstract void left();
    public abstract void right();
}
