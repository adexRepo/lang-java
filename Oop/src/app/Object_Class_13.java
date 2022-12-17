package app;
import java.lang.Object;

class Object_Class_13 extends Object{
    /* -------------------------------------------------------------------------- */
    /*                             THEORY OBJECT CLASS                            */
    /* -------------------------------------------------------------------------- */

    /*
     * Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class yang namanya adalah Object
     * Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otomatis
     *  Java akan membuat class yang ada di java
     * Bisa dikatakan class Object adalah super class untuk semua class yang ada di Java.
     * 
     * Di file ini diimport java.lang.Object;
     * disitu file SUPER OBJECT berada ctrl + click di Object saja. untuk lihat isinya 
     */

     public static void main(String[] args) {

        String name = "Adek Kristiyanto";
        System.out.println(name.toString());
        System.out.println(name);

        Object object = new Object();

        System.out.println(object.toString()); // Object@[hashCode]
        System.out.println(object); // Object@[hashCode]

        // by default System.out.println() menampilkan object.toString()
        // jika ingin melihat semua yang ada di dalam SUPER Object ada apa saja,
        // name. [spasi] , nanti akan muncul rekomendasi ada apa saja di dalam SUPER Object.
     }
}