
package com.Facturama.sdk_java.Models.Request.Complements.Terceros;

import java.util.List;

public class Part {
    
    public double Quantity;
    public String Unit;
    public String IdentificationNumber;
    public String Description;
    public Double UnitPrce;
    public Double Amount;
    public List<CustomsInformation> CustomsInformation;
    
    public double getQuantity()
    {
        return Quantity;
    }
    
    public void setQuantity(double Quantity)
    {
        this.Quantity = Quantity;
    } 
        
    public String getUnit()
    {
        return Unit;
    }
    
    public void setUnit(String Unit)
    {
        this.Unit = Unit;
    }
         
    public String getDescription()
    {
        return Description;
    }
    
    public void setDescription(String Description)
    {
        this.Description = Description;
    }
    
    public Double getUnitPrce()
    {
        return UnitPrce;
    }
    
    public void setUnitPrce(Double UnitPrce)
    {
        this.UnitPrce = UnitPrce;
    } 
    
    public Double getAmount()
    {
        return Amount;
    }
    
    public void setAmount(Double Amount)
    {
        this.Amount = Amount;
    } 
    
    public List<CustomsInformation> getCustomsInformation()
    {
        return CustomsInformation;
    }
    
    public void setCustomsInformation(List<CustomsInformation> CustomsInformation)
    {
        this.CustomsInformation = CustomsInformation;
    } 
                        
}
