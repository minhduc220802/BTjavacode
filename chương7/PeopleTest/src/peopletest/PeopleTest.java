/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peopletest;
class Person{
    private String name;
    private String brithday;
    public Person(String name, String brithday){
        this.name= name;
        this.brithday= brithday;
    }
    public void getInfo(){
        System.out.println("name: "+this.name);
        System.out.println("brithday: "+this.brithday);
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name+""+brithday;
    }
}
class Employee extends Person {
    private Double salary;
    public Employee(String name, String brithday, Double salary){
        super(name, brithday);
        this.salary = salary;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("salary: "+ this.salary);
    }
    public Double getSalary(){
        return salary;
    }
    public String toString(){
       return salary+""; 
    }
}
class Manager extends Employee {
    private Employee assistant;
    public Manager(String name, String brithday, Double salary, Employee assistant){
        super(name, brithday, salary);
        this.assistant = assistant;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("assistant: "+ this.assistant);
    }
    public void setAssistant(Employee assistant){
        this.assistant=assistant;
    }
    public String toString(){
        return ""+assistant;
    }
}
/**
 *
 * @author Admin
 */
public class PeopleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e = null;
        Manager ma = new Manager("Anh","22-08",2000.,e);
        ma.getInfo();
        // TODO code application logic here
    }
}