package com.Facturama.sdk_java.Models.Request;

public class ThirdPartyAccount 
{
    private String Rfc;
    private String Name;
    private String FiscalRegime;
    private String TaxZipCode;
    
    public String getRfc()
    {
        return Rfc;
    }
    public void setRfc(String Rfc)
    {
        this.Rfc=Rfc;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getFiscalRegime()
    {
        return FiscalRegime;
    }
    public void setFiscalRegime(String FiscalRegime)
    {
        this.FiscalRegime=FiscalRegime;
    }
    public String getTaxZipCode()
    {
        return TaxZipCode;
    }
    public void setTaxZipCode(String TaxZipCode)
    {
        this.TaxZipCode=TaxZipCode;
    }
    
    
}
