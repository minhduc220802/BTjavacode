/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixedup;
class A{
    int iVar = 7;
    void m1(){
        System.out.print("A's m1, ");
    }
    void m2(){
        System.out.print("A's m2, ");
    }
    void m3(){
        System.out.print("A's m3, ");
    }
}
class B extends A {
    void m1(){
        System.out.print("B's m1, ");
    }
}
class C extends B {
    void m3(){
        System.out.print("C's m3, " + (iVar + 1));
    }
}
/**
 *
 * @author Admin
 */
public class MixedUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        b.m1();c.m2();a.m3();  // (*)
        // Thay (*) =>
        // c.m1();c.m2();c.m3(); = B's m1, A's m2, C's m3
        // a.m1();b.m2();c.m3(); = A's m1, A's m2, C's m3
        // a2.m1();a2.m2();a2.m3(); = B's m1, A's m2, C's m3
    }
    
}
