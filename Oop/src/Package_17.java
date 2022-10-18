import Module.parent04.*;

public class Package_17 {
    /* -------------------------------------------------------------------------- */
    /*                               THEORY PACKAGE                               */
    /* -------------------------------------------------------------------------- */

    /*
     * Saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class
     * Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklasifikasikan
     *  jenis-jenis class
     * Java memiliki fitur package, yaitu fitur mirip folder / directori, dimana kita bisa menyimpan 
     *  class-class kita didalam package.
     * Sama seperti folder / direktori, package juga bisa nested, kita bisa menggunakan tanda titik (.)
     *  untuk membuat nested package.
     * Ketika kita menyimpan class di dalam package, maka diatas file Java nya, kita wajib menyebutkan
     *  nama package nya
     * 
     * Contoh: difile ini saya import Module.parent04.*;
     * artinya semua yang ada di direktori Module yang foldernya parent04 semuanya diimport di file ini
     * lalu saya akses di main function dibawa ini.
     */

     public static void main(String[] args) {
        Child01 child = new Child01();

        child.name = "Dupin";
        child.doIt();
     }
}
