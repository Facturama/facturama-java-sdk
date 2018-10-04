
package com.Facturama.sdk_java.Models.Request.Complements.Terceros;

public class ThirdPartyAccountTax {
    
    public String Name;
    public Double Rate;
    public double Amount;

    public String getName()
    {
        return Name;
    }
    
    public void setName(String Name)
    {
        this.Name = Name;
    } 
        
    public Double getRate()
    {
        return Rate;
    }
    
    public void setRate(Double Rate)
    {
        this.Rate = Rate;
    }
         
    public double getAmount()
    {
        return Amount;
    }
    
    public void setAmount(double Amount)
    {
        this.Amount = Amount;
    } 
}
