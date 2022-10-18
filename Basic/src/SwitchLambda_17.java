public class SwitchLambda_17 {
    public static void main(String[] args) {
        //Switch lamda expression
        /* 
            1. Di java 14, diperkenalkan switch expression dengan lambda
            2. Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi
                menggunakan kata kunci break
        */
        var nilai = 'A';

        switch (nilai) {
            case 'A' -> System.out.println("Nilai A  : Genius");
            case 'B' -> System.out.println("Nilai B  : Pinter");
            case 'C' -> System.out.println("Nilai C  : Rata-rata");
            case 'D' -> System.out.println("Nilai D  : Sedikit Bodoh");
            default -> System.out.println("Nilai E   : Bodoh sekali");
        }
    }
}
