/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapquiz;

/**
 *
 * @author Admin
 */
public class HeapQuiz {
int id = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0;
        HeapQuiz [] hp = new HeapQuiz[5];  // do mảng hq nó tạo ra mảng 5 phần tử HeapQuiz => có 5 đối tượng HeapQuiz được tạo ra là hq[0], hq[1],hp[2],hp[3],hq[4]
        while (x < 3) {
            hp[x] = new HeapQuiz();
            hp[x].id = x;
            x=x+1;
        }
        hp[3]=hp[1];
        hp[4]=hp[1];
        hp[3]=null;
        hp[4]=hp[0];
        hp[0]=hp[3];
        hp[3]=hp[2];
        hp[2]=hp[0];
        
    }
    
}
