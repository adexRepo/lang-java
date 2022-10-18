import Module.location.*;

public class Abstract_Class_20 {
    /* -------------------------------------------------------------------------- */
    /*                            THEORY ABSTRACT CLASS                           */
    /* -------------------------------------------------------------------------- */

    /*
     * Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
     * Abstract class artinya : class tersebut tidak dibuat sebagai object secara langsung,
     *  hanya bisa diturunkan.
     * Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract,
     *  sebelum kata kunci class.
     * Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child
     * 
     * Fungsinya lebih ke security sih
     * 
     * Lihat di Module.location.*
     */


     public static void main(String[] args) {
        // var location  = new Location(); error karena Location adalah abstract class

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
     }
}
