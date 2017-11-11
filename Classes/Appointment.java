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
public class Appointment {
    
    private Date dateTime;
    private OutPatient patient;
    private Doctor doctor;
    Appointment(Date dateTime, OutPatient patient, Doctor doctor){
        this.dateTime=dateTime;
        this.patient=patient;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public OutPatient getPatient() {
        return patient;
    }

    public void setPatient(OutPatient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
}
