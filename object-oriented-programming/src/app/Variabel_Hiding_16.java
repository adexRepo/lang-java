package app;
import data.parent04.*;

public class Variabel_Hiding_16 {
    /* -------------------------------------------------------------------------- */
    /*                           THEORY VARIABLE HIDING                           */
    /* -------------------------------------------------------------------------- */

    /*
     * Varriable hiding merupakan masalah yang terjadi ketika kita membuat nama field sama,
     *  di class child dengan nama field yang ada di class parent.
     * Tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class,
     *  maka class itu berarti variable hiding.
     * Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
     * Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts
     * Saat di cast itu, method akan tetap mengakses method overrding, namun variable akan
     *  mengakses variabel yang ada di classnya bukan di parent nya.
     * 
     * Lihat di parent04
     */

     public static void main(String[] args) {
         Child01 child = new Child01();
         child.name = "Dupin";
         child.doIt();
         System.out.println(child.name);

         Parent04 parent = (Parent04) child; // gini gapapa karena child turunan dari parent

         parent.doIt(); // ini yang diakses child nya karena overidde
         System.out.println(parent.name); // null tiap field adalah independent jika namanya sama


         //  ini di cara akses field name parent dari child
         child.doIt2();
     }
}
