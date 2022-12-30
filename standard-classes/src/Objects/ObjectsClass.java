package Objects;

import java.util.Objects;

public class ObjectsClass {
    /* ------------------------------ Class Objects ----------------------------- */
    /*
     * Awas! jangan keliru, ini class Objects, bukan Object.
     * Objects adalah class utility yang berisikan banyak static method yang bisa
     * kita gunakan untuk operasi object atau melakukan pengecekan sebelum
     * operasinya dilakukan.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html
     */

     public static void main(String[] args) {
        
        String data = null;

        var string = Objects.toString(data);
        var hashCode = Objects.hashCode(data);
        var equal    = Objects.equals("sampah", data);

        // System.out.println(data.toString()); // error null pointer exception


        System.out.println(string);
        System.out.println(hashCode);
        System.out.println(equal);

     }
}
