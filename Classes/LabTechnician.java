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
public class LabTechnician extends Staff{
    
    private ArrayList<Report> reports;
    private Laboratory laboratory;
    private FinanceManager financeManager;
    
    public LabTechnician(String name, String gender, int age, String address, String phone,
            int empID, int salary, String qualification, boolean isPaid,
            String type, String dutyShift, String pin, Hospital hospital, FinanceManager financeManager) {
        super(name, gender, age, address, phone, empID, salary, qualification, isPaid, type, dutyShift, pin, hospital);
        
        reports=new ArrayList<>();
        this.financeManager=financeManager;
    }

    
    public LabTechnician(LabTechnician labTech){
    
            super(labTech.getName(), labTech.getGender(), labTech.getAge(), labTech.getAddress(), labTech.getPhone(),
                    labTech.getEmpID(), labTech.getSalary(), labTech.getQualification(), labTech.getIsPaid(),
                    labTech.getType(), labTech.getDutyShift(), labTech.getPin(), labTech.getHospital());
            reports=new ArrayList<>();
    }

    
    
    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }
    
    public void addTest(String name, int price){
        laboratory.addTest(name,price);
    }
    
    public Report generateReport(int reportID){
        return laboratory.getReport(reportID);
    }
    
    public int conductTest(ArrayList<Test> tests, int patientID){
        
        Patient patient=super.getHospital().returnPatient(patientID);
        LabBill labBill= new LabBill(patient, tests);
        financeManager.addBill(labBill);
        int billID=labBill.getBillID();
        for(int i=0;i<tests.size();++i){
            laboratory.addReport(new Report(billID,patient,tests.get(i)));
        }
        return labBill.calculateBill();
    }
    
    public void addReport(int reportID,String testName,String result){
        
        Report report=laboratory.returnReport(reportID, testName);
        r.setResult(result);
        reports.add(report);
    }
        
    public boolean changeTestPrice(String name, int newTestPrice){
        
        Test test=laboratory.returnTest(name);
        test.setPrice(newTestPrice);
        return true;
    }
    
    public FinanceManager getFinanceManager() {
        return financeManager;
    }

    public void setFinanceManager(FinanceManager financeManager) {
        this.financeManager = financeManager;
    }
}
