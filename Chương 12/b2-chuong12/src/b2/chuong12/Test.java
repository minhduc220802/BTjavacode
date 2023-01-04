/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2.chuong12;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Test {
    static ContactList cl = new ContactList();
    static String ten, diachi, sdt;
    static Scanner scanner = new Scanner(System.in);
    public void DanhBa(List<Contact> list){
        try{
        FileWriter fw = new FileWriter("DanhBa.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(Contact o : list){
            bw.write(o.toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
        }
        catch(IOException ex){
        }
    }
    
    static void menu(){
        System.out.println("Danh Ba Dien Thoai\n");
        System.out.println("1. Them");
        System.out.println("2. Xoa");
        System.out.println("3. Danh Ba");
        System.out.println("4. Thoat");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        menu();
        while (true){
            System.out.println("\nLua chon: ");
            switch (scanner.nextInt()){
                case 1:
                    Them();
                    break;
                case 2:
                    Xoa();
                    break;
                case 3:
                    Danhba();
                    break;
                case 4:
                    return;
            }
        }
        // TODO code application logic here
    }
    private static void Them(){
        scanner.nextLine();
        System.out.print("Ten: ");
        ten = scanner.nextLine();
        System.out.print("DiaChi: ");
        diachi = scanner.nextLine();
        System.out.print("SDT: ");
        sdt = scanner.nextLine();
        cl.Them(ten, diachi, sdt);
    }
    private static void Xoa(){
        scanner.nextLine();
        System.out.println("Nhap ten nguoi ban muon xoa: ");
        ten = scanner.nextLine();
        cl.Xoa(ten);
    }
    private static void Danhba(){
        cl.Danhba();
    }  
}
