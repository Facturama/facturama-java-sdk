
package com.Facturama.sdk_java.Models.Request.Complements;


import com.Facturama.sdk_java.Models.Request.Complements.ForeingTrade.ForeingTrade;
import com.Facturama.sdk_java.Models.Request.Payment;
import com.Facturama.sdk_java.Models.Request.Complements.Donat.Donat;
import com.Facturama.sdk_java.Models.Request.Complements.IEDU.EducationalInstitution;
import com.Facturama.sdk_java.Models.Request.Complements.Terceros.ThirdPartyAccount;
import java.util.List;


public class Complements {
    
   private List<Payment> payments;
   private ForeingTrade foreingTrades;
   private Donat Donation;
   private EducationalInstitution EducationalInstitution; 
   private ThirdPartyAccount ThirdPartyAccount; 
 
   
   
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
   
   public Donat getDonation()
   {
        return Donation;
   }
   
   public void setDonation(Donat Donation)
   {
       this.Donation = Donation;
   }  
   
   public EducationalInstitution getEducationalInstitution()
   {
        return EducationalInstitution;
   }
   
   public void setEducationalInstitution(EducationalInstitution EducationalInstitution)
   {
       this.EducationalInstitution = EducationalInstitution;
   }  
   
   public ThirdPartyAccount getThirdPartyAccount()
   {
        return ThirdPartyAccount;
   }
   
   public void setThirdPartyAccount(ThirdPartyAccount ThirdPartyAccount)
   {
       this.ThirdPartyAccount = ThirdPartyAccount;
   }     
}
