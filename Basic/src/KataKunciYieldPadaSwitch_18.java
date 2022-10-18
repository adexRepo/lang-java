public class KataKunciYieldPadaSwitch_18 {
    public static void main(String[] args) {
        // Kata Kunci Yield pada Switch
        /* 
            1. Di Java 14, ada kata kunci baru yaitu yield, kita dapat 
                menggunakannya untuk mengembalikan / return nilai pada switch statemet
            2. Ini sangat mempermuda kita ketika butuh membuat data berdasarkan kondisi
                switch statement
            3. yield tidak bisa digunakan di switch lambda
        */

        // Contoh : SWITCH TANPA YIELD
        var nilai = "A";
        String ucapan;

        switch (nilai) {
            case "A"     -> ucapan = "Nilai A  : Genius";
            case "B","C" -> ucapan = "Nilai B/C : Pinter";
            case "D"     -> ucapan = "Nilai D  : Rata-rata";
            case "E"     -> ucapan = "Nilai E  : Sedikit Bodoh";
            default      -> ucapan = "Nilai F   : Bodoh sekali";
        }
        
        System.out.println(ucapan);

        nilai = "B";

        // Contoh : SWITCH Dengan YIELD
        String bacot = switch (nilai) {
            case "A"     : yield "Nilai A  : Genius";
            case "B","C" : yield "Nilai B/C : Pinter";
            case "D"     : yield "Nilai D  : Rata-rata";
            case "E"     : yield "Nilai E  : Sedikit Bodoh";
            default      : yield "Nilai F   : Bodoh sekali";
        };
        //remember, keyword yield is not a keyword in Java 14
        //and can't useing lambda expression in switch statement

        System.out.println(bacot);
    }
}
