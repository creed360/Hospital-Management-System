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
public class Nurse extends Employee {

    private String rank;
    private String dutyShift;
    private OT ot;
    public Nurse(String name, String gender, int age, String address, String phone,
            int empID, int salary, String qualification, boolean isPaid, Hospital hospital,
            String rank, String dutyShift) {
        super(name, gender, age, address, phone, empID, salary, qualification, isPaid, hospital);
        this.rank=rank;
        this.dutyShift=dutyShift;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDutyShift() {
        return dutyShift;
    }

    public void setDutyShift(String dutyShift) {
        this.dutyShift = dutyShift;
    }

    public OT getOt() {
        return ot;
    }

    public void addOt(OT ot) {
        this.ot = ot;
    }
    
}
