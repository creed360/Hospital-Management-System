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
public class Asset {
    private String name;
    private int quantity;

    public Asset(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public boolean increaseAssetCount(int quantity)
    {
       this.quantity=this.quantity+quantity;
       return true;
    }
    
    public boolean decreaseAssetCount(int quantity)
    {
       if(this.quantity>0&& quantity<=this.quantity)
       {
        this.quantity=this.quantity-quantity;
        return true;
       }
       return false;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}
