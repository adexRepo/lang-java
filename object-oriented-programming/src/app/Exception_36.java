package app;

import data.LoginRequest;
import error.ValidationEception;
import util.ValidationUtil;

public class Exception_36 {
    /* -------------------------------------------------------------------------- */
    /*                                    ERROR                                   */
    /* -------------------------------------------------------------------------- */

    /*
     * Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error
     * Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam
     * bentuk class exception
     * 
     * Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disedikakan oleh java
     * 
     * Jika kita ingin membuat exception sendiri, maka kita harus membuat class yang extends class
     * Throwable atau turunan-turunan nya.
     * 
     * // MEMBUAT EXCEPTION
     * Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method 
     * tersebut harus ditandai dengan kata kunci throw diikuti dengan class exception nya.
     * Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah lebih dari satu class exceptionnya
     * Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikuti dengan object exceptionnya
     * 
     * // TRY Catch
     * Saat kita memanggil sebuah method yang memungkinkan error maka perlu pakai try catch
     * kalo tidak maka program akan berhenti
     */


     public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,"rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid!!");
        } catch (ValidationEception | NullPointerException ex) {
            System.out.println("Ooops Someting wrong, data not valid: "+ex.getMessage());
            ex.printStackTrace();
        } finally{
            System.out.println("Validation Finish");
        }
     }
}
