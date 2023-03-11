package app;
import data.person.Person02;

public class Constructor_5 {
    /* -------------------------------------------------------------------------- */
    /*                            THEORY OF CONSTRUCTOR                           */
    /* -------------------------------------------------------------------------- */

    /*
     * Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena ktia menggunakan kurung(),
     * Di dalam class Java, kita bisa membuat constructor, constructor adalah method yang akan dipanggil saat pertama kali Object dibuat,
     * Mirip seperti method, kita bisa memberi parameter pada constructor,
     * Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value.
     */

     public static void main(String[] args) {
        Person02 nameAndAddr = new Person02("Adex", "Jakarta");

        System.out.println("================================");
        System.out.println("Field name : "+nameAndAddr.name);
        System.out.println("Field address : "+nameAndAddr.address);
     }
}