
package com.Facturama.sdk_java.Models.Request.Complements.ForeingTrade;

public class Issuer {
    
    private AddressEmisor Address;
    private String Curp;
       
    public AddressEmisor getAddress()
    {
        return Address;
    }
    
    public void setAddress(AddressEmisor Address)
    {
        this.Address = Address;
    }
            
    public String getCurp()
    {
        return Curp;
    }
    
    public void setCurp(String Curp)
    {
        this.Curp = Curp;
    }
    
}
