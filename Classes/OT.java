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
public class OT extends Room{
    private int OTNumber;
    private ArrayList<Nurse> nurses;

    private ArrayList<Reserve> reservations;
    private int charges;

    public OT(int OTNumber, int charges, int roomID) {
        super(roomID);
        this.OTNumber = OTNumber;
        this.charges = charges;
        nurses= new ArrayList<>();
        reservations= new ArrayList<>();
    }
   public void AddNurse(Nurse nurse)
   {
       nurses.add(nurse);;
   }
    public void removeNurse(Nurse nurse)
    {
        nurses.remove(nurse);
    }
    Nurse getNurse(int empID)
    {
        for(int i=0;i<nurses.size();i++)
        {
           if( nurses.get(i).getEmpID()==empID)
            {
                return nurses.get(i);
            }

        }
        return null;
    }



void addReservation(Reserve r)
{
    reservations.add(r);
}
 

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }



    
}
