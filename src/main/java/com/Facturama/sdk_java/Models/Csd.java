
package com.Facturama.sdk_java.Models;

public class Csd {
    
   private String Certificate;
   private String PrivateKey;        
   private String PrivateKeyPassword;
        
   public String getCertificate()
   {
        return Certificate;
   }
   
   public void setCertificate(String Certificate)
   {
      this.Certificate = Certificate;
   }
   
   public String getPrivateKey()
   {
        return PrivateKey;
   }
   
   public void setPrivateKey(String PrivateKey)
   {
      this.PrivateKey = PrivateKey;
   }
      
   public String getPrivateKeyPassword ()
   {
        return PrivateKeyPassword;
   }
   
   public void setPrivateKeyPassword(String PrivateKeyPassword)
   {
      this.PrivateKeyPassword = PrivateKeyPassword;
   }
          
        
    
}
