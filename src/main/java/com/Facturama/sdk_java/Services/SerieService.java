
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.*;
import com.Facturama.sdk_java.Models.Exception.FacturamaException;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.List;

public class SerieService extends HttpService <Serie,Serie>{
    
    public SerieService(OkHttpClient client) {
        super(client,"serie");
    }
    
    public List<Serie> List (String idBranchOffice) throws IOException, FacturamaException
    {
        return GetList(idBranchOffice);
    
    }
    
    public Serie Retrive(String idBranchOffice, String SerieName ) throws IOException, FacturamaException
    {
        return Get(""+idBranchOffice+"/"+ SerieName+"");
    }
    
    public Serie Update(Serie model ) throws IOException
    {
        return Put(model,""+ model.getIdBranchOffice()+"/"+model.getName());
    }
    public Serie Remove(String idBranchOffice, String SerieName ) throws IOException
    {
        return Delete(""+idBranchOffice+"/"+SerieName);
    }
}
