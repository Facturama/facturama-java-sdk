
package com.Facturama.sdk_java.Models.Request;

public class Issuer {
    
    public String FiscalRegime;
    public String Rfc;
    public String Name;
    
   public String getFiscalRegime()
   {
        return FiscalRegime;
   }
   
   public void setFiscalRegime(String FiscalRegime)
   {
      this.FiscalRegime = FiscalRegime;
   }
   
   public String getRfc()
   {
        return Rfc;
   }
   
   public void setRfc(String Rfc)
   {
      this.Rfc = Rfc;
   }
   
   public String getName()
   {
        return Name;
   }
   
   public void setName(String Name)
   {
      this.Name = Name;
   }
       
}
