package com.fajarwz.kontakq.Rest;

import com.fajarwz.kontakq.Model.GetKontak;
import com.fajarwz.kontakq.Model.PostPutDelKontak;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PUT;

/*
    Disini terdapat metode-metode yang akan digunakan dalam komunikasi data
    dengan Rest server serta atribut-atribut yang digunakan dalam komunikasi data tersebut.
 */

public interface ApiInterface {
    @GET("kontak_android")
    Call<GetKontak> getKontak();
    @FormUrlEncoded
    @POST("kontak")
    Call<PostPutDelKontak> postKontak(@Field("nama") String nama,
                                      @Field("nomor") String nomor);
    @FormUrlEncoded
    @PUT("kontak")
    Call<PostPutDelKontak> putKontak(@Field("id") String id,
                                     @Field("nama") String nama,
                                     @Field("nomor") String nomor);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "kontak", hasBody = true)
    Call<PostPutDelKontak> deleteKontak(@Field("id") String id);
}
