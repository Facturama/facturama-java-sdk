
package com.Facturama.sdk_java.Models.Response;

import com.Facturama.sdk_java.Models.Address;
import com.Facturama.sdk_java.Models.Csd;

public class InovoiceFile 
{
   private String ContentEncoding; 
   private String ContentType;
   private double ContentLength;
   private String Content;
   
   public String getContentEncoding()
   {
        return ContentEncoding;
   }
   
   public void setContentEncoding(String ContentEncoding)
   {
      this.ContentEncoding = ContentEncoding;
   }
   
   public String getContentType()
   {
        return ContentType;
   }
   
   public void setContentType(String ContentType)
   {
      this.ContentType = ContentType;
   }
   
   public double getContentLength()
   {
        return ContentLength;
   }
   
   public void setContentLength(double ContentLength)
   {
      this.ContentLength = ContentLength;
   }
    
   public String getContent()
   {
        return Content;
   }
   
   public void setContent(String Content)
   {
      this.Content = Content;
   }
   
}
