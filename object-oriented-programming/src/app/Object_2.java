package app;
public class Object_2 {
    /* -------------------------------------------------------------------------- */
    /*                                Theory Object                               */
    /* -------------------------------------------------------------------------- */

    /*
     * Object adalah hasil instansiasi dari sebuah class
     * Untuk membuat object kita bisa menggunakan kata kunci new,
     * dan diikuti dengan nama Class nya lalu kurung()
     */

    public static void main(String[] args){

        var classBaru1 = new ClassAja_1();

        ClassAja_1 classBaru2 = new ClassAja_1();

         System.out.println(classBaru1); // unique id nya si classBaru1
         System.out.println(classBaru2); // unique id nya si classBaru2
    }
}
