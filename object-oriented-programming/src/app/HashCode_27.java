package app;

public class HashCode_27 {
    /* -------------------------------------------------------------------------- */
    /*                             THEORY OF HASHCODE                             */
    /* -------------------------------------------------------------------------- */

    /*
     * HASH CODE
     * Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan
     * representasi String, hashCode adalah representasi integer.
     * HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain-lain,
     * karena cukup menggunakan hashCode method untuk mendapatkan indentitas unique object kita.
     * Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa
     * mengoverride nya jika kita ingin.
     * 
     * Kontrak HashCode Method
     * Tidak mudah mengoverride method hashCode, karena ada kontraknya / interface yang harus diturutin.
     * 1. Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama.
     * 2. Jika ada 2 object yang sama jika dibandingkan menggunakan method equals maka nilai hashcode nya juga harus sama.
     * 3. Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 miliar.
     * 4. hashcode bisa jadi akan sama,
     * 
     * Lihat di data.ProductApp
     */
}
