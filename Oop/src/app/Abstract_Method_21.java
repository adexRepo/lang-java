package app;
import data.animal.Cat;

public class Abstract_Method_21 {
    /* -------------------------------------------------------------------------- */
    /*                           THEORY ABSTRACT METHOD                           */
    /* -------------------------------------------------------------------------- */

    /*
     * Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class abstract tersebut
     * Saat kita membuat sebuah abstract method, kita TIDAK BOLEH membuat block method untuk method tersebut.
     * artinya, abstract method wajib di override di class child nya
     * Abstract method TIDAK BOLEH memiliki access modifier private
     * 
     * Abstract method digunakan agar si child nya meng overide method tersebut
     * 
     * Lihat di Module.Animal.*
     */

     public static void main(String[] args) {
        var cat = new Cat();
        cat.name = "Yuki";
        cat.eat();
     }
}
