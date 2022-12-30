package System;

public class SystemClass {
    /* ------------------------------ System Class ------------------------------ */
    /*
     * Class System adalah class yang berisikan banyak utility static method di
     * Java, contohnya System.prinln System.in dst.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/System.html
     * 
     * contoh:
     * String getenv(key)       >> untuk mendapatkan environtment variabel sistem operasi
     * void exit(status)        >> menghentikan program java
     * long currentTimeMilis()  >> mendapatkan waktu saat ini dalam milisecond
     * long nanoTime()          >> mendapatkan waktu saat ini dalam nanosecond
     * void gc()                >> menjalankan Java garbage collection
     */

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        System.out.println(System.nanoTime());
        System.out.println(System.getenv("TERM_PROGRAM_VERSION"));

        System.exit(0);

        System.out.println("Tralalal");

    }

}
