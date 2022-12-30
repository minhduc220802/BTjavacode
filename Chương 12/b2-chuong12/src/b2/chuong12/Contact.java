/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2.chuong12;

/**
 *
 * @author Admin
 */
public class Contact {
    private String ten;
    private String diachi;
    private String sdt;

    public Contact(String ten, String diachi, String sdt) {
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Ten: " + ten + ", DiaChi: " + diachi + ", SDT: " + sdt;
    }
    
}
