import Module.parent01.Child03;

public class Super_11 {
    /* -------------------------------------------------------------------------- */
    /*                            THEORY KEYWORD SUPER                            */
    /* -------------------------------------------------------------------------- */

    /*
     * Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur override di class child.
     * Untuk mengakses method milik parent, kita bisa menggunakan kata kunci super.
     * Sederhanannya, super digunakan untuk mengakses class parent.
     * Tidak hanya method, field milik parent class pun bisa kita akses menggunakan super keyword.
     * 
     * kapan digunakna ? saat field milik parent terkena shadowing oleh child terkait.
     * 
     * Lihat : parent01 : child03.java dan parent01.java
     * 
     */

     public static void main(String[] args) {
        Child03 child03 = new Child03();
        child03.sayHelloToMom("Mom");
        child03.sayHelloToDad();

        System.out.println("\n");

        System.out.println(child03.getParentFieldNameDad());
        child03.getParentMethodSayHelloToDad();
        child03.getParentMethodSayHelloToMom("Mom");
        System.out.println(child03.getParentFieldNameMom());
     }
}
