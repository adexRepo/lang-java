public class MethodParameter_26 {
    public static void main(String[] args) {
        // Method dengan parameter
        /* 
            1. Kita bisa mengirim informasi ke method yang ingin kita panggil
            2. Untuk melakukan hal tersebut, kita perlu menambahkan parameter / argument
                di method yang sudah kita buat
            3. Cara membuat parameter sama seperti cara membuat variabel
            4. Parameter ditempatkan di dalam kurung () di deklarasi method
            5. Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisahkan dengan tanda koma ,
            6. Jika suatu method sudah dideklarasikan ada parameternya maka parameter tersebut wajib diisi
        */
        iniMethod("Adex",20);
    }

    static void iniMethod(String a, int b){
        System.out.println("Nama : "+a);
        System.out.println("Umur : "+b);
    }
}
