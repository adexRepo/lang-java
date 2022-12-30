package Base64;

import java.util.Base64;

public class Base64Class {
    /* ------------------------------ Base64 Class ------------------------------ */
    /*
     * Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64.
     * Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa
     * digunakan untuk mengubah binary data ke text yang aman.
     * Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Base64.html
     * https://www.ietf.org/rfc/rfc4648.txt
     * 
     */

     public static void main(String[] args) {

        String name = "Toko Elektronik JayaBaya";

        String encoded = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(encoded);

        byte[] decoded = Base64.getDecoder().decode(encoded);
        String result = new String(decoded);

        System.out.println(result);

     }
}
