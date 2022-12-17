package app;
// import java.lang.*;

public class Import_19 {
    /* -------------------------------------------------------------------------- */
    /*                                THEORY IMPORT                               */
    /* -------------------------------------------------------------------------- */

    /*
     * Import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
     * Syarat class yang bisa digunakan jika package nya berbeda adalah class yang HARUS public
     * 
     * Contoh: di file package Module.product
     * 
     * import Module.parent04.*;
     * mengimport semua file yang ada di Module.parent04;
     * 
     * Default import
     * Secara default, semua class yang ada di package java.lang sudah auto import,
     *  jadi kita tidak perlu melakukan import secara manual
     * Contoh class String, Integer, Boolean dan lain-lain, sudah terimport di package java.lang.
     * Oleh karena itu, ktia tidak perlu mengimport nya secara manual
     * 
     * Namun disini jika ingin melihat saya add dipaling atas, java.lang , di nyalain aja comment nya
     * 
     */

     public static void main(String[] args) {
        String name = "Tralala";
        System.out.println(String.class.getName() + name);
     }
}
