public class BreakAndContinue_23 {
    public static void main(String[] args) {
        // Break and continue
        /* 
            1. Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan
                case dalam switch
            2. Sama dengan pada perulangan, break juga digunakan untuk menghentikan perulangan.
            3. Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini.
                lalu melanjutkan ke perulangan selanjutnya
            4. Misalkan ada 10 kali ngulang, lalu ada kondisi kalo udah 5 continue, maka program dibawah
                continue itu tidak akan dilanjutin tapi langsung lanjut ke perulangan ke 6, atau perulangan ke 5
                akan di skip.
        */

        // Break
        var counter = 1;
        while(true) {
            if(counter == 5) {
                break;
            }
            System.out.println("kata kunci break : "+counter);
            counter++;
        }

        System.out.println("================================================");

        // Continue
        for(var i = 1; i <= 10; i++) {
            if(i % 2 == 0) { // jika i genap maka lanjut ke looping selanjutnya
                continue;
            }
            System.out.println("kata kunci continue : "+i);
        }
    }
}
