package UUID;

import java.util.UUID;

public class UUIDClass {
    /* ------------------------------- UUID Class ------------------------------- */

    /*
     * Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique,
     * misalnya untuk kebutuhan data primary key misalnya.
     * Java menyediakan sebuah class UUID atau singkatan dari Universal Unique Identifier.
     * UUID adalah format standard untuk membuat unique value yang telah terjamin.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/UUID.html
     * https://www.ietf.org/rfc/rfc4122.txt
     *
     */

     public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();

            System.out.println(key);
        }
     }
}
