package Runtime;

public class RuntimeClass {
    /* ------------------------------ Runtime Class ----------------------------- */
    /*
     * Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environtment
     * tempat aplikasi Java berjalan
     * Informasi itu terdapat di class Runtime.
     * Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single
     * object. kit abisa mengakses object tersebut menggunakan static method
     * getRuntime() milik class runtime.
     * 
     * Lengkapnya:
     * https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html
     * 
     * Contoh:
     * int  availableProcessors()   >> Mendapatkan jumlah core cpu
     * long freeMemory()            >> Mendapatkan jumlah memory bebas di JVM 
     * long totalMemory()           >> Mendapatkan jumlah total memory di JVM
     * long maxMemory()             >> Mendapatkan jumlah maksimum memory di JVM
     * void gc()                    >> Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai
     * 
     * 
     */

    public static void main(String[] args) {
        
        Runtime runtime = Runtime.getRuntime();

        System.out.println("availableProcessors() : "+runtime.availableProcessors());
        System.out.println("freeMemory()          : "+runtime.freeMemory());  // memory JVM
        System.out.println("totalMemory()         : "+runtime.totalMemory()); // memory JVM
        System.out.println("maxMemory()           : "+runtime.maxMemory());   // memory JVM

    }

}
