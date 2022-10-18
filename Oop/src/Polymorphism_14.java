import Module.parent03.Child01;
import Module.parent03.GrandParent;
import Module.parent03.Parent03;

public class Polymorphism_14 {
    /* -------------------------------------------------------------------------- */
    /*                           THEORY OF PHOLYMORPHISM                          */
    /* -------------------------------------------------------------------------- */

    /*
     * Pholymorphism berasal dari bahasa yunani yang berarti banyak bentuk.
     * Dalam OOP, polumorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
     * Polumorphism erat hubungannya dengan Inheritance.
     * 
     * typeData/namaClass namaObject = new namaClass();
     * 
     * namaObject adalah class tertinggi / memiliki cucu, namaObject bisa berubah2 bentuk, seperti:
     *  bisa berubah menjadi class anak nya, ataupun cucu nya,
     *  namun tetap sama dia tidak bisa mengakses field si anak ataupun si cucu meskipun sudah berubah
     *  bentuk menjadi si anak/si cucu.
     * 
     * Contoh: dibawah ini adalah cara polumorphism yang dapat dilakukan:
     * GrandParent > Parent03 > Child01
     * 
     * Lihat di parent03
     */

     public static void main(String[] args) {
        GrandParent grandParent = new GrandParent("ADex"); 
        grandParent.sayHello("Adek Kristiyanto");
        
        grandParent = new Parent03("Loki");
        grandParent.sayHello("Jojo");
        
        grandParent = new Child01("Dupin");
        grandParent.sayHello("Tika");


        // * Jika tidak ada Polymorphism, maka kita akan copy paste satu method untuk semua kelas turunan si GrandDad
        // * Seperti contoh yang ada di atas sayHello()

        // * dibawah ada sebuah function sayWoy yang akhirnya bisa digunakan oleh semuanya.

        // * Contoh:

        System.out.println("\n");

        sayWoy(new GrandParent("Jhonson"));
        sayWoy(new Parent03("Louis"));
        sayWoy(new Child01("Rebecca"));
     }

     static void sayWoy(GrandParent grandParent){
        // * cuman bikin 1 sayWoy lalu parameternya harus yang class paling tinggi dari inheritance yang dibuat
        System.out.println("Hello " + grandParent.name);
     }
}
