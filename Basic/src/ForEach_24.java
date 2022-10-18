public class ForEach_24 {
    public static void main(String[] args) {
        // For each loop
        /* 
            1. Kadang kita biasa mengakses data array menggunakan Perulangan
            2. Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus
                membuat counter (tadi saya pakai i) lalu mengakses array
                menggunakan counter yang kita buat
            3. Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan
                untuk mengakses data array secara otomatis.
            4. Digunakan khusus untuk ngambil data array
        */
        String[] nama = {"Budi", "Andi", "Sri", "Siti"};

        // Akses tanpa for Each
        for (int i = 0; i <nama.length; i++) {
            System.out.println("WOII : "+nama[i]);
        }

        System.out.println("\n");

        // Akses dengan for Each
        for (String manggil : nama) {
            System.out.println("Haii : "+manggil);
        }
    }
}
