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
public class PatientRoom extends Room{
    private int charges;

    public PatientRoom(int charges, int roomID) {
        super(roomID);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    
    

}
