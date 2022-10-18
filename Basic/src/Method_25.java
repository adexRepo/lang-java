public class Method_25 {
    public static void main(String[] args) {
        // Method
        /* 
            1. Method adalah block kode program yang akan berjalan saat kita panggil
                jadi kalo ga dipanggil dia gaakan dieksekyusi
            2. Sebelumnya kita sudah menggunakan method println() untuk menampilkan
                data ke layar
            3. Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu
                diikuti dnegan nama method,kurung () dan diakhiri dengen block
            4. Kita bisa memanggil method dengan menggunakan nama method nya lalu diikuti
                dengan kurung ()
            5. Di bahasa pemrograman lain, Method juga disebut dengan Function
            6. Note untuk namaMethod pakai camel case ya guys
        */
        sayHello();
    }

    static void sayHello() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
    }
    //static hanya bisa memanggil static doang
}
