package com.fajarwz.kontakq.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
    Disini terdapat fungsi untuk membuat koneksi dengan Rest server
    dan konfigurasi dari alamat Ip komputer yang berperan sebagai Rest server
 */

public class ApiClient {
    public static final String BASE_URL = "http://192.168.43.197/rest_ci/index.php/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
