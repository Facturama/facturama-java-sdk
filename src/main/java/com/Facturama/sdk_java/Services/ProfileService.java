
package com.Facturama.sdk_java.Services;

import com.Facturama.sdk_java.Models.Response.*;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;

public class ProfileService extends HttpService<Profile,Profile>{
    
    public ProfileService(OkHttpClient client) {
        super(client,"profile");
    }
    public Profile Retrive() throws IOException
    {
      return Get(""); 
    }
}
