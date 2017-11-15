/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Farhan
 */
public class PrivateRoom extends Room{
    private int roomNumber;
    private boolean isFree;
    private Nurse nurse;
    private RegisterPrivateRoom reg;

    public PrivateRoom(int roomNumber, boolean isFree, int roomID) {
        super(roomID);
        this.roomNumber = roomNumber;
        this.isFree = isFree;
        nurse=null;
    }
    
    

public void addNurse(Nurse nurse)
{
    this.nurse=nurse;
            }

    public boolean isIsFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }



public boolean removeNurse()
{
    if(nurse!=null)
    {
        nurse=null;
        return true;
    }
    return false;
}
public void addReg( RegisterPrivateRoom reg)
{
    this.reg=reg;
}
/*+getPatient(): Patient
+setPatient(patient: Patient): void*/
public void removePatientReg()
{
    reg=null;
}

    
}
