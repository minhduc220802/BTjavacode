/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2.chuong12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ContactList {
    ArrayList<String> ContactList = new ArrayList();
    void Them(String ten, String diachi, String sdt){
        boolean them = false;
        for(String s : ContactList){
            if(s.contains(ten)){
                them = true;
                if(!s.contains(sdt)){
                    s +=" : " + sdt;
                }
                else{
                    System.out.println("Da co san");
                }
            }
        }
        if(!them){
            ContactList.add(ten + ", " + diachi + ", " + sdt);
        }
    }
    void Xoa(String ten){
        boolean TimKiem = false;
        for(String s : ContactList){
            if(ten.equals (s.substring(0,s.indexOf(",")))){
                TimKiem = true;
                ContactList.remove(s);
                System.out.println("Xoa");
                break;
            }
        if(!TimKiem)
            System.out.println("Khong tim thay: " + ten);
        }
    }
    void Danhba(){
        if(ContactList.size()==0){
            System.out.println("Khong co ai trong danh ba");
        }
        else{
            Collections.sort(ContactList,new Comparator<String>(){
                public int compare(String s, String t1){
                    return t1.compareTo(s);
                }
        });
        System.out.println("\nDanh ba\n");
        for (String s : ContactList){
            System.out.println(s);
        }
        }
    }
}
