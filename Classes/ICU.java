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
public class ICU extends Ward{
    private int ventCount;

    public ICU(int ventCount, int bedCount, int wardNumber, int currentBedCount, int roomID) {
        super(bedCount, wardNumber, currentBedCount, roomID);
        this.ventCount = ventCount;
    }

   
    
    
}
