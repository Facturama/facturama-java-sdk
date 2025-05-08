package com.Facturama.sdk_java.Models.Request;

public class CustomerValidate {

    private String Rfc;
    private String Name;
    private String ZipCode;
    private String FiscalRegime;

    public String getRfc()
    {
        return Rfc;
    }
    public void setRfc(String rfc)
    {
        this.Rfc = rfc;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getZipCode()
    {
        return ZipCode;
    }
    public void setZipCode(String zipCode)
    {
        this.ZipCode = zipCode;
    }
    public String getFiscalRegime()
    {
        return FiscalRegime;
    }
    public void setFiscalRegime(String fiscalRegime)
    {
        this.FiscalRegime = fiscalRegime;
    }
    
}
