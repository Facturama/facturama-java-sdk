package com.Facturama.sdk_java.Models.Response;

public class CustomerValidate {
    
    private String ExistRfc;
    private String MatchName;
    private String MatchZipCode;
    private String MatchFiscalRegime;

    public String getExistRfc()
    {
        return ExistRfc;
    }
    public void setRfc(String ExistRfc)
    {
        this.ExistRfc = ExistRfc;
    }

    public String geMatchName()
    {
        return MatchName;
    }
    public void setMatchName(String MatchName)
    {
        this.MatchName = MatchName;
    }

    public String getZipCode()
    {
        return MatchZipCode;
    }
    public void setMatchZipCode(String MatchZipCode)
    {
        this.MatchZipCode = MatchZipCode;
    }
    public String getMatchFiscalRegime()
    {
        return MatchFiscalRegime;
    }
    public void setMatchFiscalRegime(String MatchFiscalRegime)
    {
        this.MatchFiscalRegime = MatchFiscalRegime;
    }
}
