
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Response.TaxEnity;
import com.Facturama.sdk_java.Models.*;
import com.Facturama.sdk_java.Models.Exception.FacturamaException;
import com.Facturama.sdk_java.Models.Request.*;

import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;


public class TaxEnityService extends HttpService<com.Facturama.sdk_java.Models.Request.TaxEnity,com.Facturama.sdk_java.Models.Response.TaxEnity>{
    
    public TaxEnityService(OkHttpClient client) {
        super(client, "taxenity");
    }
    
    public TaxEnity Retrive() throws IOException, FacturamaException
    {
        return Get("");
    }
    
    public boolean UploadImage(Image img)          
    {
        return false;
    }
    public boolean UploadCds(Csd csd)
    {
     return false;
    }

}
