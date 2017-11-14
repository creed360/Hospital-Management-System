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
public class Assign {

    private InPatient patient;
    private Doctor doctor;

    public Assign(InPatient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public InPatient getPatient() {
        return patient;
    }

    public void setPatient(InPatient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
