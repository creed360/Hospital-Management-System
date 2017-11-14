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
public class RegisterWard {
    
    private int regNo;
    private Ward ward;
    private InPatient patient;
    private Receptionist receptionist;
    
    public RegisterWard(int regNo, Ward ward, InPatient patient) {
        this.regNo = regNo;
        this.ward = ward;
        this.patient = patient;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public Ward getRoom() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public InPatient getPatient() {
        return patient;
    }

    public void setPatient(InPatient patient) {
        this.patient = patient;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
    
    
    
}
