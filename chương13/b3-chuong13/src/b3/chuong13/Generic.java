/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3.chuong13;
/**
 *
 * @author Admin
 */
public class Generic {
    public <T> void sumArray(T[] sumArray){
        for ( T element : sumArray ){
        System.out.print(element);
    }
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"a","b","c"};
        Generic g = new Generic();
        int sum = 0;
        for(int num : intArray){
            sum = sum + num;
        }
        g.sumArray(intArray);
        System.out.println("Tong = " + sum );
        
        // TODO code application logic here
    }
    
}
