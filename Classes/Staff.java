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
public class Staff extends Employee {
    
    private String type;
    private String dutyShift;
    private String pin;
    private Account account;

    public Staff(String name, String gender, int age, String address, String phone,
            int empID, int salary, String qualification, boolean isPaid, 
            String type, String dutyShift, String pin,Hospital hospital) {
        super(name, gender, age, address, phone, empID, salary, qualification, isPaid, hospital);
        this.type=type;
        this.dutyShift=dutyShift;
        this.pin=pin;
    }
    
    Staff(Staff staff){
        super(staff.getName(),staff.getGender(), staff.getAge(),staff.getAddress(), staff.getPhone(),staff.getEmpID(), staff.getSalary(), staff.getQualification(),staff.getIsPaid(),staff.getHospital());
        this.type=staff.getType();
        this.dutyShift=staff.getDutyShift();
        this.pin=staff.getPin();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDutyShift() {
        return dutyShift;
    }

    public void setDutyShift(String dutyShift) {
        this.dutyShift = dutyShift;
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
