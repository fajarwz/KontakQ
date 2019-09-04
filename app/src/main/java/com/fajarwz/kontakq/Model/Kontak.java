package com.fajarwz.kontakq.Model;

import com.google.gson.annotations.SerializedName;

/*
    Class kontak berisi constructor dari atribut-atribut
    yang diperlukan pada REST server kontak dan setter dan getter
    untuk masing-masing atribut tersebut.
 */

public class Kontak {
    @SerializedName("id")
    private String id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("nomor")
    private String nomor;

    public Kontak(){

    }

    public Kontak(String id, String nama, String nomor){
        this.id = id;
        this.nama = nama;
        this.nomor = nomor;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}
