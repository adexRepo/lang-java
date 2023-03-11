package app;
import data.category.Category;

public class Getter_And_Setter_22 {
    /* -------------------------------------------------------------------------- */
    /*                            THEORY ENCAPSULATION                            */
    /* -------------------------------------------------------------------------- */

    /*
     * Encapsulation
     * Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar
     * Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid
     * Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private
     *  sehingga tidak bisa diakses atau diubah dari luar.
     * Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut.
     * 
     * Getter dan Setter
     * Di Java, proses encapsulasi sudah dibuat standarisasinya, dimana kita bisa menggunakan
     *  Getter dan setter method.
     * Getter adalah function yang dibuat untuk mengambil data field.
     * Setter adalah function untuk mengubah data field
     * 
     * Standart Pembuatan Getter Setter
     * Tipe data boolean    >> Geter : isXxx()  , Setter : setXxx(boolean value)
     * Tipe data primitif   >> Geter : getXxx() , Setter : setXxx(primitif value)
     * Tipe data object     >> Geter : getXxx() , Setter : setXxx(object value)
     * 
     * lihat di : Module.category
     */

     public static void main(String[] args) {
        var category = new Category();
        category.setId("1");
        category.setId(null); // bakal di reject karena ada checking di method set
        category.setIsActive(true);
        System.out.println(category.getId());
        System.out.println(category.isIsActive());
     }
}
