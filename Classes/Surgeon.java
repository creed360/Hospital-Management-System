/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author Nomi
 */
public class Surgeon extends Doctor{
    
    private ArrayList<Operation> operations;
    
    
    public Surgeon(String name, String gender, int age, String address, String phone, int empID, int salary, String qualification, boolean isPaid, 
            String visitingHours, String designation, int doctorFees, String pin, Hospital hospital) {
        
        super(name, gender, age, address, phone, empID, salary, qualification, isPaid, hospital, visitingHours, designation, doctorFees, pin);
        
    }
    
    Surgeon(Doctor doc){
        super(doc.getName(), doc.getGender(), doc.getAge(), doc.getAddress(), doc.getPhone(), 
                doc.getEmpID(), doc.getSalary(), doc.getQualification(), doc.getIsPaid(), doc.getHospital(),
                doc.getVisitingHours(), doc.getDesignation(), doc.getDoctorFees(), doc.getPin());
    }
    
    ArrayList<Operation> viewOperations(){
        return operations;
    }
    
    void addOperation(Operation operation){
        
        operations.add(operation);
    }
}
