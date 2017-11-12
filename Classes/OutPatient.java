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
public class OutPatient extends Patient {
    
    private Appointment appointment;
    
    public OutPatient(String name, String gender, int age, String address, String phone, int patientID, String bloodGroup, String Case,
            Appointment appointment) {
        super(name, gender, age, address, phone, patientID, bloodGroup, Case);
        this.appointment=appointment;
    }
    
    OutPatient(OutPatient p){
        super(p.getName(), p.getGender(), p.getAge(), p.getAddress(), p.getPhone(), p.getPatientID(), p.getBloodGroup(), p.getCase());
        this.appointment=p.getAppointment();
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
    
}
