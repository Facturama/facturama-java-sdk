
package com.Facturama.sdk_java.Models.Request;

import java.util.List;


public class Complements {
    
   private List<Payment> payments;
   
   public List<Payment> getPayments()
   {
        return payments;
   }
   public void setPayments(List<Payment> payments)
   {
       this.payments = payments;
   }
    
}
