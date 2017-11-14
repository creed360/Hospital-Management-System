/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Date;

/**
 *
 * @author Nomi
 */
public class Pharmacist extends Staff{
    
    private Pharmacy pharmacy;
    private FinanceManager finance;

    
    public Pharmacist(String name, String gender, int age, String address, String phone,
            int empID, int salary, String qualification, boolean isPaid, String type, String dutyShift, String pin, Hospital hospital,
            FinanceManager financeManager) {
        super(name, gender, age, address, phone, empID, salary, qualification, isPaid, type, dutyShift, pin, hospital);
        this.finance=financeManager;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }
    
    public FinanceManager getFinance() {
        return finance;
    }

    public void setFinance(FinanceManager finance) {
        this.finance = finance;
    }
    
    public void addMedicine(String name, int price, Date expiryDate,int quantity){
        Medicine medicine=pharmacy.searchMedicine(name);
        if(medicine!=null){
            medicine.increaseQuantity(quantity);
        }
        else{
            pharmacy.addMedicine(name, price, expiryDate, quantity);
        }
    }
    
    public boolean sellMedicine(String name, int quantity){
        Medicine medicine=pharmacy.searchMedicine(name);
        if(medicine!=null){
            int quantityInStock=medicine.getQuantity();
            if(quantity<quantityInStock){
                medicine.decreaseQuantity(quantity);
            
                PharmacyBill pb=new PharmacyBill(medicine,  quantity);
                financeManager.addBill(pb);
                return true;
            }
            else
                return false;
        }
        else{
           return false;
        }
    }
}
