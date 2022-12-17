package app;

import data.LoginRequest;

public class Record_Class_33 {
    /* -------------------------------------------------------------------------- */
    /*                                RECORD CLASS                                */
    /* -------------------------------------------------------------------------- */

    /*
     * !!!!!! PLEASE NOTICE !!!!!
     * PADA JAVA 14 ini masih experimental ,jadi kalo di java lebih nya gabisa dipakai , feature ini artinya dibatalin
     * namun saat ini saya pakai JAVA 17 dan masih bisa yeay..
     * 
     * RECORD CLASS
     * Kadang kita sering membuat class, hanya untuk class yang berisikan data, hanya berisi getter, equals,
     * hashCode, dan toString method.
     * Record class digunakan untuk mempermudah pembuatan jenis class tersebut.
     * Saat kita membuat record class secara otomatis java akan membuatkan getter, equals, hashCode dan toString method
     * secara otomatis, dan juga constructor secara otomatis.
     * Saat membuat record class, secara otomatis kita akan mengextends class java.lang.Record, yang artinya
     * kita tidak bisa extends class lain, Namun tetap bisa mengimplement interface.
     * 
     * Record class itu IMMUTABLE >> tidak bisa diubah lagi setelah object nya dibuat.
     * 
     * lihat data.LoginRequest
     */

    public static void main(String[] args) {
        LoginRequest loginReq = new LoginRequest("Adek","pura2Lupa");

        // LoginRequest[name=Adek, password=pura2Lupa] >> toString nya langsung di generate sama si record
        System.out.println(loginReq); 

        // getter nya 
        System.out.println(loginReq.name());
        System.out.println(loginReq.password());
    }
}
