/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.util.ArrayList;

/**
 *
 * @author Farhan
 */
public class Ward extends Room{
    private int bedCount;
    private int wardNumber;
    private int currentBedCount;
    ArrayList  <Nurse> nurses; 
    ArrayList <RegisterWard> registerations;
    Doctor doc;

    public Ward(int bedCount, int wardNumber, int currentBedCount, int roomID) {
        super(roomID);
        this.bedCount = bedCount;
        this.wardNumber = wardNumber;
        this.currentBedCount = currentBedCount;
        nurses= new ArrayList<>();
        registerations= new ArrayList<>();
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public int getCurrentBedCount() {
        return currentBedCount;
    }
    
    

    void incrementBedCount()
    {
        currentBedCount++;
    }
    void decrementBedCount()
    {
        if(currentBedCount<=bedCount)
        {
            currentBedCount--;
        }
    }

    public void AddNurse(Nurse nurse)
       {
           nurses.add(nurse);
       }
        public void removeNurse(Nurse nurse)
        {
            nurses.remove(nurse);
        }
    public void setDoctor(Doctor doctor)
     {
            doc=doctor;
    }

    Nurse getNurse(int empID)
    {
        for(int i=0;i<nurses.size();i++)
        {
           if(nurses.get(i).getEmpID()==empID)
            {
                return nurses.get(i);
            }

        }
        return null;
    }

    public Doctor getDoctor() {
        return doc;
    }



void addReg(RegisterWard reg)
        {
           registerations.add(reg);
       }
void removePatientReg(int patientID)
        {
          for(int i=0;i<registerations.size();i++)
            {
               if( registerations.get(i).getPatient().getPatientID()==patientID)
                {
                   registerations.remove(i);
                }

            }

       }
}
