package app;

// import data.Constant;
import static data.Constant.*;
import data.location.Country;
import util.MathUtil;

public class Static_Keyword_32 {
    /* -------------------------------------------------------------------------- */
    /*                              KATA KUNCI STATIC                             */
    /* -------------------------------------------------------------------------- */

    /*
     * Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses
     * langsung tanpa melalui objectnya.
     * Perlu diingat, static hanya bisa mengakses static lainnya.
     * 
     * Static Dapat Digunakan:
     * 1. Field, atau class variabel, artinya field itu dapat diakses langsung tanpa membuat object dulu
     * 2. Method atau class method, artinya method tersebut dapat diakses langsung tanpa membuat object dulu
     * 3. Block, static block akan otomatis dieksekusi ketika sebuah class di load
     * 4. Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object
     * outer classnya terlebih dahulu, Static pada inner class menyebabkan kita tidak mengakses lagi object
     * outer classnya.
     * 
     * Lihat di data.constant
     * 
     * // STATIC BLOCK
     * Static block ini adalah sebuah load yang akan diakses lebih dahulu sebelum class nya di load
     * contohnya ada di data.constant
     * 
     * // STATIC IMPORT
     * tidak perlu pakai Constatnt.APPLICATION lagi , tapi langsung APPLICATION aja
     * lihat di atas : import static data.Constant.*; atau import static data.Constant.PROCESSOR;
     */

    public static void main(String[] args) {
        // * IMPORT BY GENERATE
        // System.out.println(Constant.APPLICATION);
        // System.out.println(Constant.VERSION_NO);
        // System.out.println(MathUtil.jumlah(1,1,1,1));

        // Country.City city = new Country.City();
        // city.setName("Adex");
        // System.out.println(city.getName());

        // test static block
        // System.out.println(Constant.PROCESSOR);

        // * IMPORT BY STATIC

        System.out.println(APPLICATION);
        System.out.println(VERSION_NO);
        System.out.println(MathUtil.jumlah(1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Adex");
        System.out.println(city.getName());

        // test static block
        System.out.println(PROCESSOR);
    }
}
