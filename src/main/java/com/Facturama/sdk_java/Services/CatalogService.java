
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Response.Catalogs.Catalog;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.List;

public class CatalogService extends HttpService <Catalog, Catalog>{
    
    
    public CatalogService(OkHttpClient client) {
        super(client, "catalogs");
        singleType = Catalog.class;
        multiType = new TypeToken<List<Catalog>>() {}.getType();        
                
    }
    
    public List<Catalog> Units(String keyword) throws IOException
    {        
        return  GetList("/units?keyword="+keyword);        
    }
    
    public List<Catalog>  NameIds() throws IOException{
        return  GetList("/NameIds");        
    }
    
    public List<Catalog> ProductsOrServices(String keyword) throws IOException
    {        
        return  GetList("/ProductsOrServices?keyword="+keyword);        
    }
    

}
