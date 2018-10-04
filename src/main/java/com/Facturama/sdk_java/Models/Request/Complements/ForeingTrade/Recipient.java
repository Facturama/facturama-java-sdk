
package com.Facturama.sdk_java.Models.Request.Complements.ForeingTrade;

import java.util.List;

public class Recipient {
    
    public String Name;
    public String NumRegIdTrib;
    public List<Address> Addresses;
    
   public String getName()
   {
        return Name;
   }
   
   public void setName(String Name)
   {
      this.Name = Name;
   }
   
   public String getNumRegIdTrib()
   {
        return NumRegIdTrib;
   }
   
   public void setNumRegIdTrib(String NumRegIdTrib)
   {
      this.NumRegIdTrib = NumRegIdTrib;
   }
   
   public List<Address> getAddresses()
   {
        return Addresses;
   }
   
   public void setAddresses(List<Address> Addresses)
   {
      this.Addresses = Addresses;
   }
    
}
