
package com.Facturama.sdk_java.Models.Request.Complements;


import com.Facturama.sdk_java.Models.Request.Complements.ForeingTrade.ForeingTrade;
import com.Facturama.sdk_java.Models.Request.Payment;

import java.util.List;


public class Complements {
    
   private List<Payment> payments;
   private ForeingTrade foreingTrades;
   
   public List<Payment> getPayments()
   {
        return payments;
   }
   public void setPayments(List<Payment> payments)
   {
       this.payments = payments;
   }
   
   public ForeingTrade getForeingTrades()
   {
        return foreingTrades;
   }
   
   public void setForeingTrades(ForeingTrade foreingTrades)
   {
       this.foreingTrades = foreingTrades;
   }   
}
