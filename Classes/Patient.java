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
public class Patient extends Person {
    
    private int patientID;
    private String bloodGroup;
    private String Case;
    private DoctorBill docBill;
    private OTBill otBill;
    private PatientRoomBill patientRoomBill;
    private Prescription prescription;
    
    public Patient(String name, String gender, int age, String address, String phone, int patientID, String bloodGroup, String Case) {
        super(name, gender, age, address, phone);
        this.patientID=patientID;
        this.bloodGroup=bloodGroup;
        this.Case=Case;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCase() {
        return Case;
    }

    public void setCase(String Case) {
        this.Case = Case;
    }

    public DoctorBill getDocBill() {
        return docBill;
    }

    public void addDocBill(DoctorBill docBill) {
        this.docBill = docBill;
    }

    public OTBill getOTBill() {
        return otBill;
    }

    public void addOTBill(OTBill otBill) {
        this.otBill = otBill;
    }

    public PatientRoomBill getPatientRoomBill() {
        return patientRoomBill;
    }

    public void addPatientRoomBill(PatientRoomBill patientRoomBill) {
        this.patientRoomBill = patientRoomBill;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void addPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    
}
