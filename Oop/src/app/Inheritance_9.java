package app;
import data.parent01.Child01;
import data.parent01.Parent01;

public class Inheritance_9 {
    /* -------------------------------------------------------------------------- */
    /*                            THEORY OF INHERITANCE                           */
    /* -------------------------------------------------------------------------- */

    /*
     * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain.
     * Dalam artian, kita bisa membuat class Parent dan class child,
     * Class child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class child.
     * 
     * Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent,
     *  secara otomatis akan dimiliki oleh class child nya.
     * Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti,
     *  dengan nama class parent nya.
     * 
     * Pewarisan ini berguna untuk efisiensi dari duplikasi code
     * 
     * Lihat Interaksi nya di : Parent01.java dengan Child01.java 
     */

     /* -------------------------------------------------------------------------- */
     /*                                 CARA AKSES                                 */
     /* -------------------------------------------------------------------------- */

     public static void main(String[] args) {
        
        Parent01 parent01 = new Parent01();
        System.out.println("Dari Parent01");
        parent01.sayHelloToDad();
        parent01.sayHelloToMom("Shelia");
        
        System.out.println("\n");
        
        Child01 child01 = new Child01();
        System.out.println("Dari Child01 : ");
        child01.sayHelloToDad();
        child01.sayHelloToMom("Shelia");
        
        // Padahal disini si Child01 kosong, tapi karena dia anaknya parent01
        // dan parent01 punya field dan method , maka sifat itu juga dimiliki oleh child01
        // karena child01 adalah anaknya si parent01
     }
}
