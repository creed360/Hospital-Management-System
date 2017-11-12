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
public class InPatient extends Patient {
    private Date admissionDate;
    private Date exitDate;
    private ArrayList<Operation> operations;
    private ArrayList<RegisterWard> wardsReg;
    private RegisterPatientRoom regpatientRoom;
    private Assign assignment;

    
    public InPatient(String name, String gender, int age, String address, String phone, 
            int patientID, String bloodGroup, String Case) {
        
        super(name, gender, age, address, phone, patientID, bloodGroup, Case);
        admissionDate=new Date();
        operations=new ArrayList<>();
        wardsReg=new ArrayList<>();
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public Assign getAssignment() {
        return assignment;
    }

    public void setAssignment(Assign assignment) {
        this.assignment = assignment;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void addOperations(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<RegisterWard> getWardsReg() {
        return wardsReg;
    }

    public boolean addWardsRegistration(RegisterWard wardsReg) {
        if(this.wardsReg.size()<2){
         
            this.wardsReg.add(wardsReg);
            return true;
        }
        else
            return false;
        
    }

    public RegisterPatientRoom getPatientRoomReg() {
        return regpatientRoom;
    }

    public void addRoomRegisteration(RegisterPatientRoom patientRoom) {
        if(this.regpatientRoom==null&&patientRoom!=null){
            this.regpatientRoom=patientRoom;
        }
    }

    
    
}
