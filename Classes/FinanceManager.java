/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nomi
 */
public class FinanceManager extends Manager {
    
    
    private Hospital hospital;
    private Finance finance;
    
    public FinanceManager(String name, String gender, int age, String address, String phone, int managerID, int salary, String qualification, boolean isPaid, String pin, Account account,
            Hospital hospital, Finance finance) {
        super(name, gender, age, address, phone, managerID, salary, qualification, isPaid, pin, account);
        this.hospital=hospital;
        this.finance=finance;
    }
    
    public boolean paySalary(int empID){
        
        Employee employee=hospital.returnEmployee(empID);
        if(employee!=null){
            
            if(!employee.getIsPaid()){
                int sal=employee.getSalary();
                finance.addSalary(new Salary(new Date(),employee,sal));
                employee.setIsPaid(true);
                return true;
            }
            else
                return false;
                
        }
        return false;
    }
    
    public void addExpense(String name, int amount){
        
        Expense expense=new Expense(name, amount);
        finance.addExpense(expense);
    }
    
    public void addSalary(Salary salary){
        
        finance.addSalary(salary);
    }
    
    public void addBill(Bill bill){
        
        finance.addBill(bill);
    }
    
    public int generateStats(){
        
        int stats=finance.getBills()+finance.getExpense()+finance.getSalarie();
        return stats;
    }
}
