/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Facturama.sdk_java.Container;

import com.Facturama.sdk_java.Services.ProductService;
import com.Facturama.sdk_java.Services.ClientService;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

/**
 *
 * @author user
 */
public class FacturamaApi {
        
    private ClientService _clients;
    private ProductService _products;
        
    /**
     *
     * @param user Nickname en la cuenta de Facturama (la mísma con la que puede ingresar a la WEB)
     * @param password  Contraseña de la cuenta de Facturama (la mísma con la que puede ingresar a la WEB)
     * @param isDevelopment Bandera de modo de Pruebas o Producción  (True = Modo de pruebas)
     */
    public FacturamaApi(String user, String password, boolean isDevelopment )
    {              
        String host = isDevelopment ? "apisandbox.facturama.com.mx" : "www.api.facturama.com.mx";
        String schema = isDevelopment ? "http" : "https";
        int port = isDevelopment ? 80 : 443;
        
        OkHttpClient httpClient = new OkHttpClient().setAuthenticator(new BasicAuthInterceptor(user, password));
        httpClient.interceptors().add(new BaseUrlInterceptor(schema, host, port));              
        
        _clients = new ClientService(httpClient);
        _products = new ProductService(httpClient);        
    }
    
    public ClientService Clients(){
        return _clients;
    }
    
    public ProductService Products(){
        return _products;
    }

        

}
