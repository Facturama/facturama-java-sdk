
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Response.Catalogs.Catalog;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.List;
import com.Facturama.sdk_java.Models.Response.Catalogs.Cfdi.*;

public class CatalogService extends HttpService{
    
    
    public CatalogService(OkHttpClient client) {
        super(client, "catalogs");
        singleType = Catalog.class;
        multiType = new TypeToken<List<Catalog>>() {}.getType();        
                
    }
    public List<Unit> Units()  throws IOException{        
        return  GetList("/units",  new TypeToken<List<Unit>>() {}.getType());     
    }
    
    public List<Unit> Units(String keyword) throws IOException
    {                                        
        return  GetList("/units?keyword="+keyword,  new TypeToken<List<Unit>>() {}.getType());        
    }
    
    public List<NameCfdi>  NameIds() throws IOException{
        return  GetList("/NameIds",  new TypeToken<List<NameCfdi>>() {}.getType());        
    }
    
    public List<ProductServices> ProductsOrServices(String keyword) throws IOException
    {        
        return  GetList("/ProductsOrServices?keyword="+keyword, new TypeToken<List<ProductServices>>() {}.getType());        
    }

    
    public List<Currency> Currencies() throws IOException
    {        
        return  GetList("/currencies", new TypeToken<List<Currency>>() {}.getType());        
    }
    
    public List<Currency> Currencies(String keyword) throws IOException
    {        
        return  GetList("/currencies?keyword="+keyword, new TypeToken<List<Currency>>() {}.getType());        
    }
    
    
    public List<Catalog> PaymentForms() throws IOException
    {        
        return  GetList("/paymentforms");        
    }
    
    public List<Catalog> PaymentMethods() throws IOException
    {        
        return  GetList("/paymentmethods");        
    }
        
    
    
    
    
    
    

}
