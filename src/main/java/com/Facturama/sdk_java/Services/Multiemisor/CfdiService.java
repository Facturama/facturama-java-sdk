
package com.Facturama.sdk_java.Services.Multiemisor;

import com.Facturama.sdk_java.Services.HttpService;
import com.Facturama.sdk_java.Models.Exception.FacturamaException;
import com.Facturama.sdk_java.Models.Response.*;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.net.URLEncoder;
import com.Facturama.sdk_java.Models.Response.InovoiceFile;
import com.Facturama.sdk_java.Models.Response.CfdiSendEmail;
import com.google.gson.Gson;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.FileOutputStream;

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
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Create(com.Facturama.sdk_java.Models.Request.CfdiLite model) throws IOException, FacturamaException, Exception{        
    return (com.Facturama.sdk_java.Models.Response.Cfdi) Post(model, "2/cfdis");       
    }    
    
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Remove(String id) throws IOException, FacturamaException, Exception{        
        if(id != null && !id.isEmpty()){
            return (com.Facturama.sdk_java.Models.Response.Cfdi) Delete("cfdi/" + id  + "?type=issued");    
        }else{
            throw new NullPointerException( singleType.getTypeName() );
        }        
    }            
    
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Retrive( String id) throws IOException, FacturamaException, Exception
    {
        return (com.Facturama.sdk_java.Models.Response.Cfdi) Get("cfdi/" + id + "?type=Issued");
    }
    
    public com.Facturama.sdk_java.Models.Response.Cfdi Retrive(String id, InvoiceType type ) throws IOException, FacturamaException, Exception
    {        
        return (com.Facturama.sdk_java.Models.Response.Cfdi) Get("cfdi/" + id + "?type="+type.toString());
    }
    
    public List<CfdiSearchResult> List(String keyword) throws IOException, FacturamaException, Exception
    {        
        return this.List(keyword, CfdiStatus.Active );
    }
    
    public List<CfdiSearchResult> List(String keyword, CfdiStatus status ) throws IOException, FacturamaException, Exception{
        return this.List(keyword, CfdiStatus.Active, InvoiceType.Issued );
    }
    
    public List<CfdiSearchResult> List(String keyword, CfdiStatus status, InvoiceType type ) throws IOException, FacturamaException, Exception{
        keyword = URLEncoder.encode(keyword);
        
        String resource = "cfdi?type=" +  type + "&keyword=" + keyword + "&status=" + status;
        
        return GetList( resource , new TypeToken<List<com.Facturama.sdk_java.Models.Response.CfdiSearchResult>>() {}.getType() );
    }
    
    
    
    public List<CfdiSearchResult> List() throws IOException, FacturamaException, Exception{        
        return this.List(-1, -1, 
                null, null,
                "", "", 
                "", "",
                CfdiStatus.Active, InvoiceType.Issued);
    }
    
    public List<CfdiSearchResult> ListFilterByRfc(String rfc) throws IOException, FacturamaException, Exception{        
        return this.List(-1, -1, 
                rfc, null,
                null, null, 
                null, null,
                CfdiStatus.Active, InvoiceType.Issued);
    }
            
        
    public List<CfdiSearchResult> List(int folioStart, int folioEnd, 
            String rfc, String taxEntityName,
            String dateStart, String dateEnd, 
            String idBranch, String serie,
            CfdiStatus status, InvoiceType type ) throws IOException, FacturamaException, Exception{        
        
        String resource = "cfdi?type=" +  type + "&status=" + status;
        
        if( folioStart > -1 )
            resource += "&folioStart=" + folioStart;
        
        if( folioEnd > -1 )
            resource += "&folioEnd=" + folioEnd;        
        
        if( rfc != null )
            resource += "&rfc=" + rfc;
        
        if( taxEntityName != null )
            resource += "&taxEntityName=" + taxEntityName;
        
        if( dateStart != null )
            resource += "&dateStart=" + dateStart;
        
        if( dateEnd != null )
            resource += "&dateEnd=" + dateEnd;
        
        if( idBranch != null )
            resource += "&idBranch=" + idBranch;
        
        if( serie != null )
            resource += "&serie=" + serie;

        
        return GetList( resource , new TypeToken<List<CfdiSearchResult>>() {}.getType() );
    }
    
    
    /**-
     * Obtiene un archivo referente a un CFDI del tipo "Issued"
     * @param id Identificador del CFDI
     * @param format Formato deseado ( pdf | html | xml )     
     * @return Archivo en cuestion
     */
    public InovoiceFile GetFile(String id, FileFormat format) throws Exception{
       return GetFile(id, format, InvoiceType.Issued);
    }
    
    /**
     * Obtiene un archivo referente a un CFDI
     * @param id Identificador del CFDI
     * @param format Formato deseado ( pdf | html | xml )
     * @param type Tipo de comprobante ( payroll | received | issued )
     * @return Archivo en cuestion
     */
    public InovoiceFile GetFile(String id, FileFormat format, InvoiceType type ) throws FacturamaException, Exception{
        
        String resource = "cfdi/" +  format + "/" + type + "/" + "/" + id;
        
        InovoiceFile file = (InovoiceFile)  Get(resource, InovoiceFile.class);                         
        
        return  file;        
    }
          
    

    
    
    

    public void SaveXml( String filePath, String id) throws Exception{
        SaveXml(filePath, id, InvoiceType.Issued);
    }
    
    /**
     * Guardada el XML de  un CFDI en la ruta especificada
     * 
     * @param filePath Ruta donde se va a guardar el PDF
     * @param id Idenficador del CFDI
     * @param type Tipo del comprobante (payroll | received | issued)
     */
    public void SaveXml( String filePath, String id, InvoiceType type ) throws Exception{
        InovoiceFile file = GetFile(id, FileFormat.Xml, type);
        
        FileOutputStream fos = new FileOutputStream(filePath);                 
                 fos.write(Base64.decode(file.getContent()));
                 fos.close();                 
    }
    
    
    


        
}
