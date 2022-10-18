public class ForLoop_20 {
    public static void main(String[] args) {
        // For
        /* 
            1. For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
            2. Block code yang terdapat dalam for akan selalu diulangi selama kondisi for terpenuhi
            example :
            for(init statement; kondisi; post statement) {
                block code yang akan diulangi
            }
            3. ketiga nya tidak wajib di isi, jika tidak diisi berarti kondisinya selalu bernilai true
        */

        // contoh 1
        var a = 0;
        for(;;) {
            a++;
            System.out.println("contoh 1, loop ke : " + a);
            if(a == 10) {
                break;
            }
        }

        // contoh 2
        for (int i = 0; i < 10;) {
            i++;
            System.out.println("contoh 2, loop ke : " + i);
        }

        // contoh 3
        for (int i = 0; i < 10; i++) {
            System.out.println("contoh 3, loop ke : " + i);
        }
    }
}
