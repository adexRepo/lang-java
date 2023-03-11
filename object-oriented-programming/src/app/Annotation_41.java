package app;

import Annotation.Fancy;

@Fancy(name = "anotation App", tags={"Application","version 1.1"})
public class Annotation_41 {
    /* -------------------------------------------------------------------------- */
    /* ANNOTATION */
    /* -------------------------------------------------------------------------- */

    /*
     * Annotation adalah menambahkan metadata ke kode program yang kita bulat
     * Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat
     * kita ingin membuat library / framework
     * Annotation sendiri bisa diakses menggunakan reflection, yang akan dichapter
     * 42
     * Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
     * Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa
     * memiliki default value
     * 
     * Attribute Annotation
     * 
     * @Target == Memberitahu annotation tsb bisa digunakan dimana? Class, method,
     * field dan lain-lain.
     * 
     * @Retention == Memberitahu annotation tsb apakah bisa disimpan di hasil
     * kompilasi, dan apakah bisa dibaca oleh reflection
     * 
     * lihat di atas ada @Fancy
     * TYPE bisa di class, interface, dan ENUM
     * METHOD maka bisa sampai level METHOD
     * FIELD maka bisa sampai level FIELD
     * 
     * // Predefine Annotation
     * Java juga ada Annotation bawaan
     * @Override, untuk menandai bahwa method yang meng-override method parent class nya
     * @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
     * @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression
     * dls
     */


}
