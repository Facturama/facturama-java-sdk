
package com.Facturama.sdk_java.Services;

import com.google.gson.JsonElement;

import com.Facturama.sdk_java.Models.Product;
import com.squareup.okhttp.OkHttpClient;

public class ProductService extends CrudService {
    
    public ProductService(OkHttpClient client) {
        super(client, "product");
    }
    
    
   
}
