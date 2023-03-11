package app;

import data.CreateUserRequest;
import util.ValidationUtil;

public class Reflection_42 {
    /* -------------------------------------------------------------------------- */
    /* Reflection */
    /* -------------------------------------------------------------------------- */

    /*
     * Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
     * Reflection biasanya sangat berguna saat kita ingin membuat library ataupun
     * framework, sehingga bisa meng-otomatisasi pekerjaan
     * Untuk bisa mengakses reflection class dari sebuah object, kita bisa
     * menggunakan method getClass() atau NamaClass.class
     * 
     * lihat :
     * annotation.NotBlank
     * util.ValidationUtil
     * CreateUserRequest
     * 
     * ini bagus karena gaperlu if else lagi, karena sudah otomatis di check by
     * reflection
     */

    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("null");
        request.setPassword("null");

        ValidationUtil.validationReflection(request);
        System.out.println("Sucess");

        // * disini tidak perlu lagi pakai if else tinggal tambahin anotation @Notblank
        // dan yang tidak ada NotBlank akan lolos,, dan yang ada maka akan error
        // otomatis tanpa kita perlu
        // buat try catch
    }
}
