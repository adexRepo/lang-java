package app;

public class StackTraceElement_Class_39 {
    /* -------------------------------------------------------------------------- */
    /* STACK TRACE ELEMENT CLASS */
    /* -------------------------------------------------------------------------- */

    /*
     * Throwable memiliki method yang bernama getStackTrace(), diamna menghasilkan
     * Array dari StackTraceElement object
     * StackTraceElement berisikan informasi tentang, class, file bahkan baris
     * lokasi terjadinya error
     * Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian
     * error yang terjadi
     * Cara paling mudah, kita bisa memanggil method printStackTrace() class
     * Throwable, untuk memprint ke console detail error StackTraceElementnya
     */

    public static void main(String[] args) {

        // * contoh 2
        try {
            sampelError();
        }
        catch (RuntimeException err) {
            err.printStackTrace();
        }



        // * contoh 1
        // try {
        //     String[] names = {"Adek","Krist","dupin"};
        //     System.out.println(names[100]);
        // }
        // catch (Throwable throwable) {
        //     // manual
        //     // StackTraceElement[] errorLoc = throwable.getStackTrace();
        //     // System.out.println(errorLoc);

        //     // auto
        //     throwable.printStackTrace();
        // }
    }     

    public static void sampelError(){
        try {
            String[] names = {"Adek","Krist","dupin"};
            System.out.println(names[100]);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
