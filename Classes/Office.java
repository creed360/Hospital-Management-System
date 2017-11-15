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
public class Office extends Room{
    private int officeNumber;
    OfficeAssign o;

    public Office(int officeNumber, int roomID) {
        super(roomID);
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }
    
    public void setOfficeAssign(OfficeAssign ofc)
    {
        o=ofc;
    }
    
}
