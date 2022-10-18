public class OperasiBoolean_13 {
    public static void main(String[] args){
        // Operasi Boolean
        /* 
            1. && (AND)     => Dan   => true && true = true
            2. || (OR)      => Atau  => true || false = true
            3. ! (NOT)      => Kebalikan    => !true = false
        
        Untuk operasi AND itu dua2nya harus sama dulu baru bisa true
        Untuk operasi OR itu minimal satu harus true
        Untuk operasi NOT itu kebalikannya , jika true maka berubah jadi false
            jika false maka berubah jadi true
        */

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsensi = absen >= 75;
        var lulusNilaiAkhir  = nilaiAkhir >= 75;

        var lulus1 = lulusAbsensi && lulusNilaiAkhir;
        var lulus2 = lulusAbsensi || lulusNilaiAkhir;
        System.out.println("Lulus : " + lulus1);    // false
        System.out.println("Lulus : " + lulus2);    // true
        System.out.println("Lulus : " + !lulus2);   // false
        
    }
}
