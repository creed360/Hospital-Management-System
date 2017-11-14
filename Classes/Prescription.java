/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Date;

/**
 *
 * @author Nomi
 */
public class Prescription {
 
    private int prescriptionID;
    private String advice;
    private Date date;
    private Patient patient;
    private Doctor doctor;

    public Prescription(int prescriptionID, String advice,Patient patient,Doctor doctor) {
        this.prescriptionID = prescriptionID;
        this.advice = advice;
        this.date = new Date();
        this.patient=patient;
        this.doctor=doctor;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
    
    
    
}


