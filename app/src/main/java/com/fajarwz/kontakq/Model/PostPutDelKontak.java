package com.fajarwz.kontakq.Model;

import com.google.gson.annotations.SerializedName;

/*
    Class GetKontak berfungsi untuk mengimprentasikan
    respon dari REST server dalam hal manipulasi data.
 */

public class PostPutDelKontak {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Kontak mKontak;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Kontak getKontak() {
        return mKontak;
    }
    public void setKontak(Kontak Kontak) {
        mKontak = Kontak;
    }
}
