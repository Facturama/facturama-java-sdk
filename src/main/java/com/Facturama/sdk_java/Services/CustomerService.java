
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Response.CustomerValidate;

import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;


public class CustomerService extends HttpService{
    
    public CustomerService(OkHttpClient client) {
        super(client, "");
        singleType = com.Facturama.sdk_java.Models.Response.CustomerValidate.class;
    }
        
    public com.Facturama.sdk_java.Models.Response.CustomerValidate Validate( com.Facturama.sdk_java.Models.Request.CustomerValidate model) throws IOException, Exception
    {
        return  (com.Facturama.sdk_java.Models.Response.CustomerValidate) Post(model,"customers/validate");
    }
}