
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.*;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.List;

public class SerieService extends HttpService <Serie,Serie>{
    
    public SerieService(OkHttpClient client) {
        super(client,"serie");
    }
    
    public List<Serie> List (String idBranchOffice) throws IOException
    {
        return GetList(/*idBranchOffice*/);
    
    }
    
    public Serie Retrive(String idBranchOffice, String SerieName ) throws IOException
    {
        return Get(""+idBranchOffice+"/"+ SerieName+"");
    }
    
   
}
