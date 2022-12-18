package app;

import error.DatabaseError;

public class Error_38 {
    /* -------------------------------------------------------------------------- */
    /* ERROR */
    /* -------------------------------------------------------------------------- */

    /*
     * Error adalah jenis exception yang terakhir.
     * Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di
     * try-catch
     * Biasanya error terjadi ketika ada masalah serius, dan sangat direkomendasikan
     * untuk di try-catch
     * Artinya, direkomendasikan untuk mematikan aplikasi
     * Contoh, misalkan diawal aplikasi kita tidak bisa terkoneksi ke database,
     * direkomendasikan untuk
     * membuat exception jenis Error, dan menghentikan aplikasi.
     * 
     * lihat error.DatabaseError
     */

    public static void main(String[] args) {
        connectDatabase("adek",null);
        // connectDatabase("adek","success");
        System.out.println("Success!");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Cannot connect to database");
        }
    }
}
