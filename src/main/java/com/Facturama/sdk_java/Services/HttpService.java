package com.Facturama.sdk_java.Services;


import com.Facturama.sdk_java.Container.BaseUrlInterceptor;
import com.google.gson.Gson;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.lang.reflect.Type;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.util.List;
import java.io.IOException;


public abstract class HttpService <TI, TO>
{   
    protected  OkHttpClient httpClient;
    protected  String baseUrl; // URL base (Test o Produccion)
    protected String relativeUrl;
    protected Type singleType, multiType;         
    
    public HttpService(OkHttpClient client, String url)
    {                                  
        httpClient = client;        
        relativeUrl = url;       
        
        BaseUrlInterceptor interceptor = (BaseUrlInterceptor) httpClient.interceptors().get(0);
        this.baseUrl = interceptor.getBaseUrl();        
    }
    
    
    protected final Response  Execute(Request  request) throws IOException {
        return httpClient.newCall(request).execute();
    }

    protected final TO Get() throws IOException {       
        return this.Get("");        
    }
       
    protected final TO Get(String resourceId) throws IOException {
        
        HttpUrl.Builder urlBuilder 
        = HttpUrl.parse(baseUrl + "/" + relativeUrl + "/" + resourceId).newBuilder();    
 
        String url = urlBuilder.build().toString();    
  
        Request request = new Request.Builder()
                .url(url)
                .build();
        
        Response response = Execute(request);
        String jsonData = response.body().string();
                      
        TO object = new Gson().fromJson(jsonData, singleType);
        
        return object;
    }
    
    
    
     protected final List<TO> GetList() throws IOException {        
         return this.GetList("");        
    }


    
    protected final List<TO> GetList(String resource) throws IOException {

         HttpUrl.Builder urlBuilder 
      = HttpUrl.parse(baseUrl + "/" + relativeUrl + resource ).newBuilder();    
 
        String url = urlBuilder.build().toString();    
  
        Request request = new Request.Builder()
                .url(url)
                .build();
        
        Response response = Execute(request);
        String jsonData = response.body().string();
                
        List<TO> toList = new Gson().fromJson(jsonData, multiType);        
              
        return toList;
        
    }    
    
    
    
    
    protected final TO Post(TI obj) throws IOException {       
        return Post(obj, "");
    }
    
    protected final TO Post(TI obj, String urlParams) throws IOException {
        
        if(obj == null){
            throw new NullPointerException( singleType.getTypeName() );
        }

        
        HttpUrl.Builder urlBuilder 
        = HttpUrl.parse(baseUrl + "/" + relativeUrl + "/" + urlParams).newBuilder();    
 
        String url = urlBuilder.build().toString();   
                        
        String jsonObj = new Gson().toJson(obj);
                
        
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), 
                jsonObj);
                
  
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        
        Response response = Execute(request);
        String jsonData = response.body().string();
                      
        TO object = new Gson().fromJson(jsonData, singleType);
         
       
        return object;
    }
   
    protected final TO Put(TI obj, String id) throws IOException {

         if(obj == null){
            throw new NullPointerException( singleType.getTypeName() );
        }

        
        HttpUrl.Builder urlBuilder 
        = HttpUrl.parse(baseUrl + "/" + relativeUrl + "/" + id).newBuilder();    
 
        String url = urlBuilder.build().toString();   
                        
        String jsonObj = new Gson().toJson(obj);
                
        
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), 
                jsonObj);
                
  
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .build();
        
        Response response = Execute(request);
        String jsonData = response.body().string();
                      
        TO object = new Gson().fromJson(jsonData, singleType);
         
       
        return object;
        
    }

    protected final TO Delete(String resourceId) throws IOException {

        HttpUrl.Builder urlBuilder 
        = HttpUrl.parse(baseUrl + "/" + relativeUrl + "/" + resourceId).newBuilder();    
 
        String url = urlBuilder.build().toString();    
  
        Request request = new Request.Builder()
                .url(url)
                .delete()
                .build();
        
        Response response = Execute(request);
        String jsonData = response.body().string();
                      
        TO object = new Gson().fromJson(jsonData, singleType);
        
        return object;
        
    }
   
}