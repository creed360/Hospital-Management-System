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
public class Manager extends Person {
    
    private int managerID;
    private int salary;
    private String qualification;
    private boolean isPaid;
    private String pin;
    private Account account;
    
    public Manager(String name, String gender, int age, String address, String phone,
            int managerID, int salary, String qualification, boolean isPaid, String pin, Account account) {
        super(name, gender, age, address, phone);
        this.managerID=managerID;
        this.salary=salary;
        this.qualification=qualification;
        this.isPaid=isPaid;
        this.pin=pin;
        this.account=account;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
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

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
