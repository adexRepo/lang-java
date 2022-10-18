import Module.parent01.Child02;
import Module.parent01.Parent01;

public class Method_Overriding_10 {
    /* -------------------------------------------------------------------------- */
    /*                          THEORY METHOD OVERRIDING                          */
    /* -------------------------------------------------------------------------- */

    /*
     * Method Overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
     * Saat kita melakukan overriding tersebut, secara otomatis ketika kita membuat object dari class child,
     *  method yang ada di class parent tidak bisa di akses lagi.
     * 
     * Aturannya return type, parameter, dan nama method nya harus sama
     * Yang bisa kita bedakan hanyalah isi / body scope nya
     * 
     * Lihat : Child02.java dengan parent01.java
     */

    public static void main(String[] args) {
        
        Parent01 parent01 = new Parent01();
        System.out.println("Dari Parent01");
        parent01.sayHelloToDad();
        parent01.sayHelloToMom("Shelia");
        
        System.out.println("\n");
        
        Child02 child02 = new Child02();
        System.out.println("Dari Child02 : ");
        child02.sayHelloToDad();
        child02.sayHelloToMom("Shelia");
        
        // disini hasil dari Parent01 sudah berbeda dengan Child02
        // karena Child02 melakukan overriding dari Parent01
        // khususnya method sayHelloToDad() dan sayHelloToMom()
        // yang berbeda adalah isi / body scope nya
     }
}
