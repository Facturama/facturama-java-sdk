
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Response.*;
import com.google.gson.Gson;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

public class CfdiService  extends HttpService <com.Facturama.sdk_java.Models.Request.Cfdi,com.Facturama.sdk_java.Models.Response.Cfdi>{

    private enum FileFormat
    {
        Xml,Pdf,Html
    }
    
    public enum InovoiceType
    {
        Issued, Received,Payroll
    }
    
    public enum CfdiStatus
    {
        All, Active,Cancel
    }
    
    public CfdiService(OkHttpClient client) {
        super(client, "");
    }
    
    public Cfdi Retrive(String id, InovoiceType type ) throws IOException
    {
        
        return Get("cfdi/"+id+"?type="+type.toString());
    }
    
    public Cfdi Retrive( String id) throws IOException
    {
        return Get("cfdi/"+id+"?type=Issued");
    }
    
    /*public CfdiSearchResult[] List(String Keyword, CfdiStatus status, InovoiceType type) throws IOException
    {
                
         return 
    }*/

    
}
