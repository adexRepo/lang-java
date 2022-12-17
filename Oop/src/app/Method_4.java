package app;
import data.person.Person01;

class Method_4 {

    /* -------------------------------------------------------------------------- */
    /*                              THEORY OF METHOD                              */
    /* -------------------------------------------------------------------------- */

    /*
    * Selain menambahkan field, kita juga bisa menambahkan method ke object
    * Caranya dengan mendeklarasikan method tersebut di dalam block class
    * Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method
    *  yang ada dialam block class
    * Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama methodnya,
    *  sama seperti mengakses field
    * 
    */

    public static void main(String[] args) {
        Person01 human =  new Person01(); // object human dari class person
        human.sayWoy("Adex");
    }

}