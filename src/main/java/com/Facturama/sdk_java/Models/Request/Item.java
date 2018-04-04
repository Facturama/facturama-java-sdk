
package com.Facturama.sdk_java.Models.Request;

import java.util.List;

public class Item{
    
    private String ProductCode;
    private String IdentificationNumber;
    private String Description;
    private String Unit;
    private String UnitCode;
    private Double UnitPrice;
    private double Quantity;
    private double Subtotal;
    private Double Discount;
    private List<Tax> Taxes;
    private String CuentaPredial;
    private double Total;

    
   public String getProductCode()
   {
        return ProductCode;
   }
   
   public void setProductCode(String ProductCode)
   {
      this.ProductCode = ProductCode;
   }
   
   public String getIdentificationNumber()
   {
        return IdentificationNumber;
   }
   
   public void setIdentificationNumber(String IdentificationNumber)
   {
      this.IdentificationNumber = IdentificationNumber;
   }
   
   public String getDescription()
   {
        return Description;
   }
   
   public void setDescription(String Description)
   {
      this.Description = Description;
   }
   
   public String getUnit()
   {
        return Unit;
   }
   
   public void setUnit(String Unit)
   {
      this.Unit = Unit;
   }
   
   public String getUnitCode()
   {
        return UnitCode;
   }
   
   public void setUnitCode(String UnitCode)
   {
      this.UnitCode = UnitCode;
   }
   
   public Double getUnitPrice()
   {
        return UnitPrice;
   }
   
   public void setUnitPrice(Double UnitPrice)
   {
      this.UnitPrice = UnitPrice;
   }
   
   public double getQuantity()
   {
        return Quantity;
   }
   
   public void setQuantity(double Quantity)
   {
      this.Quantity = Quantity;
   }
   
   public double getSubtotal()
   {
        return Subtotal;
   }
   
   public void setSubtotal(double Subtotal)
   {
      this.Subtotal = Subtotal;
   }
   
   public Double getDiscount()
   {              
       return (this.Discount == null) ? 0 : this.Discount;
   }
   
   public void setDiscount(Double Discount)
   {
      this.Discount = Discount;
   }
   
   public List<Tax> getTaxes() {
        return Taxes;
    }
    
    public void setTaxes(List<Tax> Taxes) {
        this.Taxes = Taxes;
    }
    
    public String getCuentaPredial()
   {
        return CuentaPredial ;
   }
   
   public void setCuentaPredial(String CuentaPredial )
   {
      this.CuentaPredial = CuentaPredial ;
   }
   
   public double getTotal()
   {
        return Total;
   }
   
   public void setTotal(double Total)
   {
      this.Total = Total;
   }
   
   
}



