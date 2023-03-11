package app;

import data.LoginRequest;
import util.ValidationUtil;

public class Runtime_Exception_37 {
    /* -------------------------------------------------------------------------- */
    /* RUNTIME EXCEPTION */
    /* -------------------------------------------------------------------------- */

    /*
     * Jenis-Jenis Exception
     * Secara garis besar di java, exception dibagi jadi 3 bagian1
     * 1. Checked Exception, yaitu exception yang wajib di try-catch, karena akan
     * menyebabkan berhentinya program seperti pada no 36
     * 2. Runtime Exception,
     * 3. Error
     * 
     * Runtime Exception
     * Runtime Exception adalah jenis exception yang tidak wajib ditangkap
     * menggunakan try catch
     * Kompiler java tidak akan protes walaupun tidak menggunakan try catch ketika
     * kita memanggil method yang bisa menyebabkan runtime exception
     * Untuk membuat class runtime exception, kita wajib mengextends class
     * RuntimeException
     * Ada banyak di Java yang merupakan runtime exception, seperti Null
     * NullPointerException,
     * IllegalArgumentException, dan lain-lain
     * 
     * lihat di error.blankEception
     * 
     * Runtime Exception bisa menghentikan program, but penggunaan Runtime Exception
     * ini berguna
     * saat pembuatan error handling / agar code lebih mudah dibaca.
     */

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Adek");

        ValidationUtil.validateRuntime(loginRequest);
        System.out.println("sucess validate");
    }
}
