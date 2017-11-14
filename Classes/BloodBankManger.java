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
public class BloodBankManger extends Person {
    
    private BloodBank bloodBank;
    private FinanceManager financeManager;

    public BloodBankManger(String name, String gender, int age, String address, String phone) {
        super(name, gender, age, address, phone);
    }

    public void addBlood(String type, int quantity, Person donor){
        
        Blood blood=bloodBank.searchBlood(type);
        blood.increaseQuantity(quantity);
        blood.addDonor(donor);
        
    }
    
    public boolean sellBlood(String type, int quantity, int patientID){
        
        Blood blood=bloodBank.searchBlood(type);
        int quantityInStock=blood.getQuantity();
        if(quantityInStock>=quantity){
            blood.decreaseQuantity(quantity);
        }
        else
            return false;
        if(financeManager!=null){
            BloodBankBill bloodBankBill=new BloodBankBill(patientID, quantity);
            financeManager.addBill(bloodBankBill);
        }
        else
            return false;
        return true;
    }
    
    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    public FinanceManager getFinanceManager() {
        return financeManager;
    }

    public void setFinanceManager(FinanceManager financeManager) {
        this.financeManager = financeManager;
    }
    
    
    
}
