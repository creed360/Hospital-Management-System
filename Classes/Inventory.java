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
public class Inventory {
    private ArrayList<Asset> assets;

    public Inventory() {
        assets =new ArrayList<>();
    
    }
    
    public void addAsset(String name, int quantity){
        Asset a= new Asset(name, quantity);
        assets.add(a);
    }
Asset searchAsset(String name)
{
    boolean flag=false;
    Asset a=null;
    for(int i=0;i<assets.size();i++)
    {
       a=assets.get(i);
       if(name.toLowerCase().equals(a.getName().toLowerCase()))
       {
           flag=true;
           break;
       }
    }
    return a;
}

    public ArrayList<Asset> getAssets() {
        return assets;
    }

boolean  updateQuantity(String name, int quantity, boolean operation)
{
    boolean flag=false;
    Asset a=null;
    for(int i=0;i<assets.size();i++)
    {
       a=assets.get(i);
       if(name.toLowerCase().equals(a.getName().toLowerCase()))
       {
           if(operation) //1 for adding
           {
               flag=a.increaseAssetCount(quantity);
           }       
           else
           {
               flag=a.decreaseAssetCount(quantity);
           }
       }
    }
    return flag;
}

    
}
