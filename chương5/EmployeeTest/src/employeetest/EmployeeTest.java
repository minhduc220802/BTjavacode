/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;
class Employee{
    private String firstname ;
    private String lastname ;
    private Double salary ;
    
    public Employee (String firstname, String lastname, Double salary){
        this.firstname = firstname ; 
        this.lastname = lastname ; 
        this.salary = salary ;
    }
    
    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname (String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setLastname (String lastname){
        this.firstname = lastname;
    }
    public Double getSalary(){
        if (salary < 0){
            System.out.println("Luong thang = 0.0");
        }
        return this.salary;
    }
    public void setSalary (Double salary){
        this.salary = salary;
    }
}
/**
 *
 * @author Admin
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nguoi thu nhat:");
        Employee e = new Employee( "Duc", "Tran Minh", 300.0 );
        System.out.println("Ten: " + e.getFirstname());
        System.out.println("Ho: " + e.getLastname());
        System.out.println("Luong thang = " + e.getSalary()); 
        System.out.println("Luong ca nam = " + e.getSalary() *12);
        System.out.println("Luong ca nam khi tang luong = " + (e.getSalary()+ 10%e.getSalary())*12);
        
        System.out.println("Nguoi thu hai:");
        Employee d = new Employee( "A", "Tran Van", 200. );
        System.out.println("Ten: " + d.getFirstname());
        System.out.println("Ho: " + d.getLastname());
        System.out.println("Luong thang = " + d.getSalary());
        System.out.println("Luong ca nam = " + d.getSalary() *12);
        System.out.println("Luong ca nam khi tang luong = " + (d.getSalary()+ 10%d.getSalary())*12);
        // TODO code application logic here
    }
    
}
