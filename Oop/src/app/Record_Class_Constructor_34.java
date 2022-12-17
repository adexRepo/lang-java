package app;

import data.LoginRequest;

public class Record_Class_Constructor_34 {
    /* -------------------------------------------------------------------------- */
    /*                        CONSTRUCTOR PADA RECORD CLASS                       */
    /* -------------------------------------------------------------------------- */

    /*
     * Secara default, constructor di record class akan dibuat secara otomatis dengan definisi record class parameter
     * Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructor
     * yaitu constructor tanpa tanda () >> kurung buka tutup
     * Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya,
     * yaitu constructor overloading nya harus tetap memanggil constructor utama yang secara otomatis
     * dibuatkan di record class.
     */

     public static void main(String[] args) {
        LoginRequest loginReq = new LoginRequest("Adek","pura2Lupa");

        // test Constructor
        System.out.println(loginReq);
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Adex"));
        System.out.println(new LoginRequest("dupin","nonono"));
        loginReq.sayHello();
    }
}
