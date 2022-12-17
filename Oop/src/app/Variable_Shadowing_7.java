package app;
public class Variable_Shadowing_7 {
    /* -------------------------------------------------------------------------- */
    /*                        THEORY OF VARIABLE SHADOWING                        */
    /* -------------------------------------------------------------------------- */

    /*
     * Variabel Shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama
     *  di scope yang menutupi variable dengan nama yang sama di scope diatasnya.
     * Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
     * Saat terjadi variable shadowing, maka secara otomatis variabel di scope diatasnya tidak bisa diakses
     */


}


class Person {
    public String name;
    public String address;

    public Person(String name, String address) {
        // ada alert dari compiler kalo ini ga guna, karena variable diatas ke shadow sama parameter di method
        // hal ini karena nama variable diatas dengan nama parameter di method itu sama
        // name = name;
        // address = address;

        // untuk ngatasin hal diatas bisa digunakan kata kunci this
        this.name = name;
        this.address = address;
        // kata kunci this disini artinya mengakses variabel diatasnya / di class nya bukan di paramter constructor
        // lengkapnya kata kunci "this" ini bisa dilihat di file This.java
    }

    public Person(String paramName) {
        this(paramName, null);
    }

    public Person() {
        this(null);
    }

    void sayWoy(String name){
        System.out.println("Hello, I'm " + name + ", Are you " + this.name+ "?");
    }
}