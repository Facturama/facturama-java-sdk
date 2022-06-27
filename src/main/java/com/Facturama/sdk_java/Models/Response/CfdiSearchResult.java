
package com.Facturama.sdk_java.Models.Response;

import java.util.Date;

public class CfdiSearchResult 
{
       
    private String Id;
    private String CfdiType;
    private String Type;
    private String Folio;
    private String Serie;
    private String TaxName;
    private String Rfc;
    private String RfcIssuer;
    private String Date;
    private Double Subtotal;
    private Double Total;
    private String Uuid;
    private Boolean IsActive;
    private String PaymentMethod;
    private String OrderNumber;
    private String Status;
    private String Email;
    private Boolean EmailSent;
    
    
   public String getId()
   {
        return Id;
   }
   
   public void setId(String Id)
   {
      this.Id = Id;
   }
   
   public String getCfdiType()
   {
       return CfdiType;
   }
   public void setCfdiType(String CfdiType)
   {
       this.CfdiType=CfdiType;
   }
    public String getType()
   {
       return Type;
   }
    public void setType(String Type)
   {
       this.Type=Type;
   }  
   public String getFolio()
   {
        return Folio;
   }
   
   public void setFolio(String Folio)
   {
      this.Folio = Folio;
   }
   
   public String getSerie()
   {
        return Serie;
   }
   
   public void setSerie(String Serie)
   {
      this.Serie = Serie;
   }
   
   public String getTaxName()
   {
        return TaxName;
   }
   
   public void setTaxName(String TaxName)
   {
      this.TaxName = TaxName;
   }
   
   public String getRfc()
   {
        return Rfc;
   }
   
   public void setRfc(String Rfc)
   {
      this.Rfc = Rfc;
   }
   public String getRfcIssuer()
   {
       return RfcIssuer;
   }
   public void setRfcIssuer(String RfcIssuer)
   {
       this.RfcIssuer=RfcIssuer;
   }
   
   public String getDate()
   {
        return Date;
   }
   
   public void setDate(String Date)
   {
      this.Date = Date;
   }
    public Double getSubtotal()
   {
        return Subtotal;
   }
   
   public void setSubtotal(double Subtotal)
   {
      this.Subtotal = Subtotal;
   }  
   
   public Double getTotal()
   {
        return Total;
   }
   
   public void setTotal(double Total)
   {
      this.Total = Total;
   }  
   
   public String getUuid()
   {
        return Uuid;
   }
   
   public void setUuid(String Uuid)
   {
      this.Uuid = Uuid;
   }
   
   public String getEmail()
   {
        return Email;
   }
   
   public void setEmail(String Email)
   {
      this.Email = Email;
   }
    
    public Boolean getIsActive() {
        return IsActive;
    }
    
    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }
    
    public String getPaymentMethod()
    {
        return PaymentMethod;
    }
    public void setPaymentMethod(String PaymentMethod)
    {
        this.PaymentMethod=PaymentMethod;
    }
    
    public String getOrderNumber()
    {
            return OrderNumber;
    }
    public void setOrderNumber(String OrderNumber)
    {
        this.OrderNumber=OrderNumber;
    }
    public String getStatus()
    {
        return Status;
    }
    public void setStatus(String Status)
    {
        this.Status=Status;
    }
    
    public Boolean getEmailSent() {
        return EmailSent;
    }
    
    public void setEmailSent(Boolean EmailSent) {
        this.EmailSent = EmailSent;
    }
}
