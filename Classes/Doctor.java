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
public class Doctor extends Employee{
    
    private String visitingHours;
    private String designation;
    private int doctorFees;
    private String pin;
    private ArrayList<Appointment> appointments;
    private ArrayList<Prescription> prescriptions;
    private ArrayList<Assign> assignments;
    
    public Doctor(String name, String gender, int age, String address, String phone,
            int empID, int salary, String qualification, boolean isPaid, Hospital hospital,
            String visitingHours, String designation, int doctorFees, String pin) {
        super(name, gender, age, address, phone, empID, salary, qualification, isPaid, hospital);
        this.visitingHours=visitingHours;
        this.designation=designation;
        this.doctorFees=doctorFees;
        this.pin=pin;
        appointments=new ArrayList<>();
        prescriptions=new ArrayList<>();
        assignments=new ArrayList<>();
    }
    
    Doctor(Doctor doc){
        super(doc.getName(), doc.getGender(), doc.getAge(), doc.getAddress(), doc.getPhone(), 
                doc.getEmpID(), doc.getSalary(), doc.getQualification(), doc.getIsPaid(), doc.getHospital());
        this.visitingHours=doc.getVisitingHours();
        this.doctorFees=doc.getDoctorFees();
        this.designation=doc.getDesignation();
        this.pin=doc.getPin();
        
        appointments=new ArrayList<Appointment>();
        prescriptions=new ArrayList<Prescription>();
        assignments=new ArrayList<Assign>();
    }
    
    void addPrescription(int patientID, String advice){
        
        //Get maximum prescription ID from DB and add 1 then pass that to this function
        int precID=0;
        Patient patient=hospital.returnPatient(patientID);
        prescriptions.add(new Prescription(precID,advice,patient,this));
    }

    void addAppointment(Appointment appointment){
        appointments.add(appointment);
    }
    
    void addAssign(Assign assignment){
        assignments.add(assignment);
    }
    
    boolean removeAssign(int patientID){
        for(int i=0;i<assignments.size();i++){
            
            if(assignments.get(i).getPatient().getPatientID()==patientID){
                assignments.remove(i);
                return true;
            }
        }
        return false;
    }
    
    Appointment viewAppointments(){
        return appointments;
    }
    
    
    public String getVisitingHours() {
        return visitingHours;
    }

    public void setVisitingHours(String visitingHours) {
        this.visitingHours = visitingHours;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDoctorFees() {
        return doctorFees;
    }

    public void setDoctorFees(int doctorFees) {
        this.doctorFees = doctorFees;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
}
