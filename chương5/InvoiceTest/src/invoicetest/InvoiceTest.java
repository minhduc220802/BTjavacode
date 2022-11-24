/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoicetest;
class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private Double unitPrice;
    private Double invoiceAmount;
    
    public Invoice (String partNumber, String partDescription, int quantity, Double unitPrice){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.invoiceAmount = invoiceAmount;
    }
    
    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartNumber (String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartDescriptinon(){
        return this.partDescription;
    }
    public void setPartDescriptinon (String partDescription){
        this.partDescription = partDescription;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity (int quantity){
        this.quantity = quantity ;
    }
    public Double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public Double getInvoiceAmount() {
        invoiceAmount = quantity * unitPrice;
        return this.invoiceAmount;  
    }
}
/**
 *
 * @author Admin
 */
public class InvoiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoice i = new Invoice("1","dep",10,1000. );
        System.out.println("So hieu : " + i.getPartNumber());
        System.out.println("Mieu ta : " + i.getPartDescriptinon());
        if ( i.getQuantity() <0){
            System.out.println("So luong da ban = 0 ");
        }
        System.out.println("So luong da ban : " + i.getQuantity());
        if ( i.getUnitPrice() <0){
            System.out.println( "Don gia = 0.0 ");
        }
        System.out.println("Don gia = " + i.getUnitPrice());
        System.out.println("Tien hoa don : " + i.getInvoiceAmount());
        // TODO code application logic here
    }
    
}
