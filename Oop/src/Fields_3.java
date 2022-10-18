import Module.person.Person01;

public class Fields_3 {
    /* -------------------------------------------------------------------------- */
    /*                                Theory Fields                               */
    /* -------------------------------------------------------------------------- */

    /*
     * Fields / Properties /  Attributes adalah data yang bisa kita sisikan di dalam Object
     * Namun sebelum kita bisa memasukkan data di field, kita harus mendeklarasikan data
     *  apa saja yang dimiliki object tersebut didalam deklarasi class-nya
     * Membuat field sama seperti membuat variabel biasa, namun ditempatkan didalam block class
     */

    /* -------------------------------------------------------------------------- */
    /*                              Manipulasi Field                              */
    /* -------------------------------------------------------------------------- */

    /*
     * Fields yang ada di Object, bisa kita manipulasi, tergantung final atau bukan.
     * Jika final, berarti kita tidak bisa mengubah data fieldnya, namun jika tidak, kita bisa mengubah field nya
     * Untuk memanipulasi data field, sama seperti cara pada variabel
     * Untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama fields nya
     */

    public static void main(String[] args){
        var classBaru1 = new Person01();

        classBaru1.sd = "SMP";
        classBaru1.smp = "SMP";
        // classBaru1.smk = "SMK"; error
        System.out.println(classBaru1.sd);
        System.out.println(classBaru1.smp);
        // System.out.println(classBaru1.smk); // muncul warning, karena smk adalah static harus diakses static way but still can
    }
}
