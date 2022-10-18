public class Default_Method_In_Interface_25 {
    /* -------------------------------------------------------------------------- */
    /*                     THEORY DEFAULT METHOD IN INTERFACE                     */
    /* -------------------------------------------------------------------------- */

    /*
     * Sebelumnya kita tahu bahwa diinterface, kita tidak bisa membuat method konkrit yang memiliki block method
     * Namun sejak update versi Java 8, ada fitur default method di interface.
     * Fitur ini terjadi karena sulit untuk maintaining kontrak interface jikalau sudah terlalu banyak
     *  class yang implement interface tersebut.
     * Saat kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak
     * karena kita tidak bisa mengatur methodnya.karena harus mengoverride method tersebut.
     *  jika ada 1000 child class yang implement interface tersebut, saat menambah method di interface
     *  maka 1000 child class terlu satu persatu perlu ditambahkan
     * 
     * Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
     * 
     * lihat di Module.Car.Car.java dan Module.Car.Avanza.java dan Module.Car.Civic.java
     */
}
