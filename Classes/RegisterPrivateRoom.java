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
public class RegisterPrivateRoom {
 
    private int regNo;
    private InPatient patient;
    private PrivateRoom privateRoom;
    private Receptionist receptionist;
    

    public RegisterPrivateRoom(int regNo, InPatient patient, PrivateRoom privateRoom) {
        this.regNo = regNo;
        this.patient = patient;
        this.privateRoom = privateRoom;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public InPatient getPatient() {
        return patient;
    }

    public void setPatient(InPatient patient) {
        this.patient = patient;
    }

    public PrivateRoom getPrivateRoom() {
        return privateRoom;
    }

    public void setPrivateRoom(PrivateRoom privateRoom) {
        this.privateRoom = privateRoom;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
    
    
}
