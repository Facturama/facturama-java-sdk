
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Exception.FacturamaException;
import com.Facturama.sdk_java.Models.Response.*;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.net.URLEncoder;

public class CfdiService  extends HttpService{ //<com.Facturama.sdk_java.Models.Request.Cfdi,com.Facturama.sdk_java.Models.Response.Cfdi>{

    private enum FileFormat
    {
        Xml,Pdf,Html
    }
    
    public enum InvoiceType
    {
        Issued, Received,Payroll
    }
    
    public enum CfdiStatus
    {
        All, Active,Cancel
    }
    
    public CfdiService(OkHttpClient client) {
        super(client, "");                
        singleType = com.Facturama.sdk_java.Models.Response.Cfdi.class;
        multiType = new TypeToken<List<com.Facturama.sdk_java.Models.Response.Cfdi>>() {}.getType();       
    }
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Create(com.Facturama.sdk_java.Models.Request.Cfdi model) throws IOException, FacturamaException{        
    return (com.Facturama.sdk_java.Models.Response.Cfdi) Post(model, "2/cfdis");       
    }    
    
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Remove(String id) throws IOException, FacturamaException{        
        if(id != null && !id.isEmpty()){
            return (com.Facturama.sdk_java.Models.Response.Cfdi) Delete("cfdi/" + id  + "?type=issued");    
        }else{
            throw new NullPointerException( singleType.getTypeName() );
        }        
    }            
    
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Retrive( String id) throws IOException, FacturamaException
    {
        return (com.Facturama.sdk_java.Models.Response.Cfdi) Get("cfdi/" + id + "?type=Issued");
    }
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Retrive(String id, InvoiceType type ) throws IOException, FacturamaException
    {        
        return (com.Facturama.sdk_java.Models.Response.Cfdi) Get("cfdi/" + id + "?type="+type.toString());
    }
    
    
    public List<CfdiSearchResult> List(String keyword) throws IOException, FacturamaException
    {        
        return this.List(keyword, CfdiStatus.Active );
    }
    
    public List<CfdiSearchResult> List(String keyword, CfdiStatus status ) throws IOException, FacturamaException{
        return this.List(keyword, CfdiStatus.Active, InvoiceType.Issued );
    }
    
    public List<CfdiSearchResult> List(String keyword, CfdiStatus status, InvoiceType type ) throws IOException, FacturamaException{
        keyword = URLEncoder.encode(keyword);
        
        String resource = "cfdi?type=" +  type + "&keyword=" + keyword + "&status=" + status;
        
        return GetList( resource , new TypeToken<List<CfdiSearchResult>>() {}.getType() );
    }
    
    
    
    public List<CfdiSearchResult> List() throws IOException, FacturamaException{        
        return this.List(-1, -1, 
                null, null,
                "", "", 
                "", "",
                CfdiStatus.Active, InvoiceType.Issued);
    }
    
    public List<CfdiSearchResult> ListFilterByRfc(String rfc) throws IOException, FacturamaException{        
        return this.List(-1, -1, 
                rfc, null,
                "", "", 
                "", "",
                CfdiStatus.Active, InvoiceType.Issued);
    }
    
    
    public List<CfdiSearchResult> List(int folioStart, int folioEnd, 
            String rfc, String taxEntityName,
            String dateStart, String dateEnd, 
            String idBranch, String serie,
            CfdiStatus status, InvoiceType type ) throws IOException, FacturamaException{        
        
        String resource = "cfdi?type=" +  type + "&status=" + status +
            "&folioStart=" + folioStart + "&folioEnd=" + folioEnd + 
                "&rfc=" + rfc + "&taxEntityName=" + taxEntityName + 
                "&dateStart=" + dateStart + "&dateEnd=" + dateEnd +
                "&idBranch=" + idBranch + "&serie=" + serie;
        
        return GetList( resource , new TypeToken<List<CfdiSearchResult>>() {}.getType() );
    }
    
    
            
    
        
}
