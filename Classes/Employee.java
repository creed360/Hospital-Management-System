/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Nomi
 */
public class Employee extends Person {
    
    private int empID;
    private int salary;
    private String qualification;
    private boolean isPaid;

    public Employee(String name, String gender, int age, String address, String phone, 
            int empID, int salary, String  qualification, boolean isPaid){
        super(name, gender, age, address, phone);
        this.empID=empID;
        this.salary=salary;
        this.qualification=qualification;
        this.isPaid=isPaid;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
    
    
}
