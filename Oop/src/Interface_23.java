import Module.Car.Avanza;
import Module.Car.Car;

public class Interface_23 {
    /* -------------------------------------------------------------------------- */
    /*                            THEORY JAVA INTERFACE                           */
    /* -------------------------------------------------------------------------- */

    /*
     * Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk kelas childnya.
     * Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface
     * Jangan salah sangka bahwa interface disini bukanlah user interface / UI / GUI.
     * Interface disini mirip seperti abstract class, yang membedakan adalah di Interface,
     *  semua method otomatis abstract, tidak memiliki block
     * Di Interface kita tidak boleh memiliiki field, kita hanya boleh memiliki constant
     *  field yang tidak bisa diubah.
     * Untuk mewariskan interface, kita TIDAK lagi menggunakan kata kunci extends, melainkan implements.
     * 
     * 
     * NOTE : Kontrak disini seperti : , 
     * "TERSERAH BENTUK DAN MEREKNYA KYK APA YANG PENTING HARUS ADA ALAT TULIS, TAS DAN BUKU UNTUK SEKOLAH"
     * "TERSERAH FUNCTIONYA ISI NYA KYK APA YG PENTING HARUS ADA FUNCTION SEARCH, READ, UPDATE, DELETE"
     * jadi kontrak disini kyk semacam kesepakatan antara parent dengan child nya
     * 
     * lihat lengkapnya di Module.Car.Car.java dan Module.Car.Avanza.java
     */

    public static void main(String[] args) {
        Car car = new Avanza();
        
        car.drive();
        System.out.println(car.getTire());
    }
}
