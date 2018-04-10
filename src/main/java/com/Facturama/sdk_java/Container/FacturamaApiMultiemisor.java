
package com.Facturama.sdk_java.Container;

import com.Facturama.sdk_java.Services.*;
import com.squareup.okhttp.OkHttpClient;

public class FacturamaApiMultiemisor {

    public FacturamaApiMultiemisor(String user, String password, boolean isDevelopment )
    {              
        String host = isDevelopment ? "apisandbox.facturama.mx" : "www.api.facturama.mx";
        String schema = isDevelopment ? "http" : "https";
        int port = isDevelopment ? 80 : 443;
        
        OkHttpClient httpClient = new OkHttpClient().setAuthenticator(new BasicAuthInterceptor(user, password));
        httpClient.interceptors().add(new BaseUrlInterceptor(schema, host, port));              
        
    }      
                
        
    
}
