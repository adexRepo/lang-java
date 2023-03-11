package app;
import data.parent02.Child01;

public class Super_Constructor_12 {
    /* -------------------------------------------------------------------------- */
    /*                          THEORY SUPER CONSTRUCTOR                          */
    /* -------------------------------------------------------------------------- */

    /*
     * Tidak hanya untuk mengakses method atau field yang ada di parent class,
     *  kata kunci super juga bisa untuk mengakses constructor.
     * Namun syaratnya unutuk mengakses parent class constructor,kita harus mengaksesnya
     *  di dalam class child constructor.
     * Jika sebuah class parent tidak memiliki constructor yang tidak ada parameternya 
     *  (Tidak memiliki default constructor), maka class child wajib mengakses constructor
     *  class parent tersebut.
     * 
     * Default constructor adalah constructor yang tidak memiliki parameter.
     * 
     * Constructor class parent (berparameter) harus dan wajib diakses di dalam class child constructor.
     * Jika tidak, maka akan terjadi error. bisa diisi bebas. null juga boleh kok.
     * 
     * lihat di parent02.Parent02.java
     */

     public static void main(String[] args) {
        Child01 child01 = new Child01();
        System.out.println(child01.nameMom); // Amora
        System.out.println(child01.nameDad); // null
     }
}
